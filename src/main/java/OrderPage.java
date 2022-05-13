import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class OrderPage {

    //locator Name Field
    @FindBy(how = How.XPATH, using = "//*[@placeholder=\"* Имя\"]")
    private SelenideElement inputName;

    //locator Surname Field
    @FindBy(how = How.XPATH, using = "//*[@placeholder=\"* Фамилия\"]")
    private SelenideElement inputSurname;

    //locator Adress Field
    @FindBy(how = How.XPATH, using = "//*[@placeholder=\"* Адрес: куда привезти заказ\"]")
    private SelenideElement inputAdress;

    //locator MetroStation
    @FindBy(how = How.XPATH, using = "//*[@placeholder=\"* Станция метро\"]")
    private SelenideElement metroStation;

    //locator Phone
    @FindBy(how = How.XPATH, using = "//*[@placeholder=\"* Телефон: на него позвонит курьер\"]")
    private SelenideElement inputPhoneNumber;

    //locator Next
    @FindBy(how = How.XPATH, using = "//button[@class='Button_Button__ra12g Button_Middle__1CSJM']")
    private SelenideElement btnNext;

    //locator поля Когда привезти самокат
    @FindBy(how = How.XPATH, using = "//*[@placeholder=\"* Когда привезти самокат\"]")
    private SelenideElement inputdeliveryDate;

    //локатор срок аренды
    @FindBy(how = How.CLASS_NAME, using = "Dropdown-placeholder")
    private SelenideElement btnRentTime;

    //выбор времени аренды
    @FindBy(how = How.CLASS_NAME, using = "Dropdown-option")
    private SelenideElement setRentTime;

    //комментарий курьеру
    @FindBy(how = How.XPATH, using = "//*[@placeholder=\"Комментарий для курьера\"]")
    private SelenideElement inputComment;

    //цвет самоката
    @FindBy(how = How.CLASS_NAME, using = "Checkbox_Label__3wxSf")
    private ElementsCollection checkBoxColor;

    //локатор Заказать
    @FindBy(how = How.XPATH, using = "//*[@class='Button_Button__ra12g Button_Middle__1CSJM']")
    private SelenideElement btnMakeOrder;

    //модальное окно Хотите оформить заказ
    @FindBy(how = How.CLASS_NAME, using = "Order_ModalHeader__3FDaJ")
    private SelenideElement modalCreateOrder;

    //кнопка да в модальном окне
    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Да')]")
    private SelenideElement btnYes;

    //локатор ваш аказ оформлен
    @FindBy(how = How.CLASS_NAME, using = "Order_ModalHeader__3FDaJ")
    private SelenideElement textCreateOrder;

    //Enter Name
    public OrderPage enterName(String name) {
        inputName.sendKeys(name);
        return this;
    }

    //Enter Surname
    public OrderPage enterSurname(String surname) {
        inputSurname.sendKeys(surname);
        return this;
    }

    //Enter Adress
    public OrderPage enterAdress(String adress) {
        inputAdress.sendKeys(adress);
        return this;
    }

    //select MetroStation
    public OrderPage selectMetroStstion(String metro) {
        metroStation.click();
        metroStation.sendKeys(metro);
        metroStation.sendKeys(Keys.ARROW_DOWN);
        metroStation.pressEnter();
        return this;
    }

    //Enter Phone Number
    public OrderPage enterPhoneNumber(String phone) {
        inputPhoneNumber.sendKeys(phone);
        return this;
    }

    //click Next button
    public OrderPage clickNext() {
        btnNext.click();
        return this;
    }

    //выбираем дату доставки
    public OrderPage setDeliveryDate(String deliveryDate) {
        inputdeliveryDate.setValue(deliveryDate).click();
        inputdeliveryDate.pressEnter();
        return this;
    }

    //выбираем срок аренды
    public OrderPage selectRentTime() {
        btnRentTime.click();
        setRentTime.parent().click();
        return this;
    }

    //вводим комментарий клиенту
    public OrderPage enterComment(String comment) {
        inputComment.sendKeys(comment);
        return this;
    }

    //выбираем цвет Черный жемчуг
    public OrderPage selectBlackColor(int k) {
        k = 0;
        checkBoxColor.get(k).click();
        return this;
    }

    //выбираем цвет Серая безысходность
    public OrderPage selectGreyColor(int k) {
        k = 1;
        checkBoxColor.get(k).click();
        return this;
    }

    //кликаем Заказать
    public OrderPage clickBtnMakeOrder() {
        btnMakeOrder.click();
        return this;
    }

    //кликаем да в модальном окне
    public OrderPage clickYes() {
        //modalCreateOrder.isDisplayed();
        btnYes.click();
        return this;
    }

    //ваш заказ оформлен
    public SelenideElement getTextCreateOrder() {
        return textCreateOrder;
    }

    //Заполняем форму заказа
    public OrderPage inputOrderForm(String name, String surname, String adress, String metro,
                                    String phone, String deliveryDate, int k, String comment) {
        enterName(name);//вводим имя
        enterSurname(surname);//вводим фамилию
        enterAdress(adress);//вводим адрес куда доставить
        selectMetroStstion(metro);//выбираем станцию метро
        enterPhoneNumber(phone);//вводим номер телефона
        clickNext();//нажимаем кнопка далее
        setDeliveryDate(deliveryDate);//выбираем дату доставки
        selectRentTime();//выбораем срок аренды
        selectBlackColor(k);//выбираем черный цвета
        enterComment(comment);//вводим комментарий курьеру
        clickBtnMakeOrder();//нажимаем Заказать
        clickYes();//подтверждаем заказ
        return this;
    }

}







