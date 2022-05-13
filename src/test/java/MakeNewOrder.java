import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class MakeNewOrder {
    Customer customer = Customer.getSimleCustomer();
    private String text = "Заказ оформлен";
    private String name = customer.getName();
    private String surname = customer.getSurname();
    private String adress = customer.getAdress();
    private String metro = customer.getMetro();
    private String phoneNumber = customer.getPhoneNumber();
    private String deliveryDate = "05.05.2022";
    private int blackColor = 0;
    private int greyColor = 1;
    private String comment = "Бла бла бла";

    @Before
    public void startUp() {
        System.setProperty("selenide.browser", "chrome");
        Configuration.startMaximized = true;
    }

    //Заказать кнопка Вверху
    @Test
    public void makeNewOrderSuccess1() {
        //открываем главную страницу
        open(MainPage.URL, MainPage.class)
                //принимаем куки
                //.getCookiesAccept()
                //кликаем Заказать
                .clickNewOrderTop()
                //Вводим Имя
                .enterName(name)
                //Вводим фамилию
                .enterSurname(surname)
                //Вводим Адрес
                .enterAdress(adress)
                //Выбираем станцию метро
                .selectMetroStstion(metro)
                //Вводим номер телефона
                .enterPhoneNumber(phoneNumber)
                //нажимаем Далее
                .clickNext()
                //Выбераем дату когда привезти самокат
                .setDeliveryDate(deliveryDate)
                //Выбираем срок аренды
                .selectRentTime()
                //выбираем цвет Серая безысходность
                .selectGreyColor(greyColor)
                //Вводим комментарий курьеру
                .enterComment(comment)
                //Кликаем Заказать
                .clickBtnMakeOrder()
                //нажимаем ДА
                .clickYes()
                //Проверяем сообщение
                .getTextCreateOrder().shouldHave(Condition.matchText(text));
    }

    //Заказать кнопка снизу+Объединение методов
    @Test
    public void makeNewOrderSuccess2() {
        //открываем главную страницу
        open(MainPage.URL, MainPage.class)
                //принимаем куки
                .getCookiesAccept()
                //сколлим до кнопки заказать
                .moveToBtnMakeOrderDown()
                //кликаем Заказать
                .clickNewOrderDown()
                //Заполняем форму заказа (Имя,Фамилия,адрес,Станция метро,номер телефона,дата доставки,цвет самоката,коммнтарий курьеру)
                .inputOrderForm(name, surname, adress, metro, phoneNumber, deliveryDate, blackColor, comment)
                //Проверяем сообщение
                .getTextCreateOrder().shouldHave(Condition.matchText(text));
    }
}