import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Selenide.page;


public class MainPage {

    //URL главной страницы
    public static final String URL = "https://qa-scooter.praktikum-services.ru/";

    //Логотип "Яндекс".
    @FindBy(how = How.CLASS_NAME, using = "Header_LogoYandex__3TSOI")
    private SelenideElement logoYandex;

    //Логотип "Самокат".
    @FindBy(how = How.ID, using = "Header_LogoScooter__3lsAR")
    private SelenideElement linkMainPage;

    //Логотип "Учебный тренажер".
    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Учебный тренажер')]")
    private SelenideElement trainingSimulator;

    //App Cookie Consent
    @FindBy(how = How.CLASS_NAME, using = "App_CookieConsent__1yUIN")
    private SelenideElement appCookiesConsent;

    //Текст App Cookie Consent "И здесь куки! В общем, мы их используем."
    @FindBy(how = How.XPATH, using = "//div[contains(text(),'И здесь куки! В общем,мы их используем.')]")
    private SelenideElement textCookiesConsent;

    //Кнопка "да все привыкли"
    @FindBy(how = How.ID, using = "rcc-confirm-button")
    private SelenideElement btncloseCookies;

    //Заголовок "Самокат на пару дней".
    @FindBy(how = How.CLASS_NAME, using = "Home_Header__iJKdX")
    private SelenideElement header;

    //Подзаголовок "Привезём его прямо к вашей двери,а когда накатаетесь — заберём.
    @FindBy(how = How.CLASS_NAME, using = "Home_SubHeader__zwi_E")
    private ElementsCollection subHeader;//Подзаголовок "Он лёгкий и с мощными колёсами— самое то, чтобы ехать по набережной и нежно барабанить пальцами по рулю"

    //Кнопка "Заказать" в хедере страницы.
    @FindBy(how = How.CLASS_NAME, using = "Button_Button__ra12g")
    private SelenideElement btnMakeOrderTop;

    //Элемент "Статус заказа" в хедере страницы.
    @FindBy(how = How.CLASS_NAME, using = "Header_Link__1TAG7")
    private SelenideElement showInputField;

    //Поле ввода номера заказа - Появляется после клака по кнопке "Статус заказа"
    @FindBy(how = How.XPATH, using = "//input[@class='Input_Input__1iN_Z Header_Input__xIoUq']")
    private SelenideElement inputOrderNum;

    //Кнопка "Go" - Появляется после клака по кнопке "Статус заказа"
    @FindBy(how = How.XPATH, using = "//input[@class='Button_Button__ra12g Header_Button__28dPO']")
    private SelenideElement btnFindOrder;

    //Картинка "Самокат".
    @FindBy(how = How.XPATH, using = "//img[@alt='Scooter blueprint']")
    private SelenideElement imgScooter;

    //Модель Toxic PRO
    @FindBy(how = How.CLASS_NAME, using = "Home_Column__xlKDK")
    private SelenideElement infoModelScooter;

    //Максимальная скорость
    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Максимальная скорость')]")
    private SelenideElement textMaxSpeed;

    //40 км/ч
    @FindBy(how = How.XPATH, using = "//div[contains(text(),'40 км/ч')]")
    private SelenideElement textSpeed;

    //Проедет без подзарядки
    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Проедет без поздарядки')]")
    private SelenideElement textRideWithoutEnergy;

    //80 км
    @FindBy(how = How.XPATH, using = "//div[contains(text(),'80 км')]")
    private SelenideElement textDistance;

    //Выдерживает вес
    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Выдерживает вес')]")
    private SelenideElement textBearTheWeight;

    //120 кг
    @FindBy(how = How.XPATH, using = "//div[contains(text(),'120 кг')]")
    private SelenideElement textWeight;

    //Подзаголовок "Как это работает"
    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Как это работает')]")
    private SelenideElement headerHowItIsWork;

    //Элементs "Кружок с цифрами-4"
    @FindBy(how = How.CSS, using = "div.Home_StatusCircle__3_aTp")
    private ElementsCollection circleNumber;

    //Шаг 1 "Заказываете самокат"
    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Заказываете самокат')]")
    private SelenideElement textOrderScooter;

    //Описание Шага 1 "Выбираете, когда и куда привезти".
    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Выбираете,когда и куда привезти')]")
    private SelenideElement textWhenAndWhereDelivery;

    //Шаг 2 "Курьер привозит самокат".
    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Курьер привозит самокат')]")
    private SelenideElement textCourierDeliveryScooter;

    //Описание Шага 2 "А вы — оплачиваете аренду"
    @FindBy(how = How.XPATH, using = "//div[contains(text(),'А вы — оплачиваете аренду')]")
    private SelenideElement textYouPayRent;

    //Шаг 3 "Катаетесь".
    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Катаетесь')]")
    private SelenideElement textSkate;

    //Описание Шага 3 "Сколько часов аренды осталось — видно на сайте"
    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Сколько часов аренды осталось — видно на сайте')]")
    private SelenideElement textTimeToCancelRent;

    //Шаг 4 "Курьер забирает самокат".
    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Курьер забирает самокат')]")
    private SelenideElement textCourierPickUpScooter;

    //Описание Шага 4 "Когда аренда заканчивается".
    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Когда аренда заканчивается')]")
    private SelenideElement textRentIsOver;

    //Кнопка "Заказать" в нижней части страницы.
    @FindBy(how = How.XPATH, using = "//button[@class='Button_Button__ra12g Button_Middle__1CSJM']")
    private SelenideElement btnMakeOrderDown;

    //Вопросы о важном
    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Вопросы о важном')]")
    private SelenideElement questionAboutImportant;

    //Блок вопросов:
    @FindBy(how = How.CLASS_NAME, using = "Home_FAQ__3uVm4")
    private SelenideElement listQuestions;

    //Вопрос №1 "Сколько это стоит и как оплатить"
    @FindBy(how = How.ID, using = "accordion__heading-0")
    private SelenideElement btnFirstQuestion;

    //Ответ на вопрос №1 "Сутки — 400 рублей. Оплата курьеру — наличными или картой.".
    @FindBy(how = How.ID, using = "accordion__panel-0")
    private SelenideElement firstAnswer;

    //Вопрос №2 "Хочу сразу несколько самокатов! Так можно?"
    @FindBy(how = How.ID, using = "accordion__heading-1")
    private SelenideElement btnSecondQuestion;

    //Ответ на вопрос №2. "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим."
    @FindBy(how = How.ID, using = "accordion__panel-1")
    private SelenideElement secondAnswer;

    //Вопрос №3 "Как рассчитывается время аренды?"
    @FindBy(how = How.ID, using = "accordion__heading-2")
    private SelenideElement btnThirdQuestion;

    //Ответ на вопрос №3. "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30."
    @FindBy(how = How.ID, using = "accordion__panel-2")
    private SelenideElement thirdAnswer;

    //Вопрос №4 "Можно ли заказать самокат прямо на сегодня?"
    @FindBy(how = How.ID, using = "accordion__heading-3")
    private SelenideElement btnFourthQuestion;

    //Ответ на вопрос №4. "Только начиная с завтрашнего дня. Но скоро станем расторопнее."
    @FindBy(how = How.ID, using = "accordion__panel-3")
    private SelenideElement fourthAnswer;

    //Вопрос №5 "Можно ли продлить заказ или вернуть самокат раньше?"
    @FindBy(how = How.ID, using = "accordion__heading-4")
    private SelenideElement btnFifthQuestion;

    //Ответ на вопрос №5. "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010."
    @FindBy(how = How.ID, using = "accordion__panel-4")
    private SelenideElement fifthAnswer;

    //Вопрос №6 "Вы привозите зарядку вместе с самокатом?"
    @FindBy(how = How.ID, using = "accordion__heading-5")
    private SelenideElement btnSixthQuestion;

    //Ответ на вопрос №6. "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.""
    @FindBy(how = How.ID, using = "accordion__panel-5")
    private SelenideElement sixthAnswer;

    //Вопрос №7 "Можно ли отменить заказ?"
    @FindBy(how = How.ID, using = "accordion__heading-6")
    private SelenideElement btnSeventhQuestion;

    //Ответ на вопрос №7. "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои."
    @FindBy(how = How.ID, using = "accordion__panel-6")
    private SelenideElement seventhAnswer;

    //Вопрос №8 "Я жизу за МКАДом, привезёте?"
    @FindBy(how = How.ID, using = "accordion__heading-7")
    private SelenideElement btnEighthQuestion;

    //Ответ на вопрос №8. "Да, обязательно. Всем самокатов! И Москве, и Московской области."
    @FindBy(how = How.ID, using = "accordion__panel-7")
    private SelenideElement eighthAnswer;

    //получаем первый ответ
    public SelenideElement getFirstAnswer() {
        return firstAnswer;
    }

    //получаем второй ответ
    public SelenideElement getSecondAnswer() {
        return secondAnswer;
    }

    //получаем 3 ответ
    public SelenideElement getThirdAnswer() {
        return thirdAnswer;
    }

    //получаем 4 ответ
    public SelenideElement getFourthAnswer() {
        return fourthAnswer;
    }

    //получаем 5 ответ
    public SelenideElement getFifthAnswer() {
        return fifthAnswer;
    }

    //получаем 6 ответ
    public SelenideElement getSixthAnswer() {
        return sixthAnswer;
    }

    //получаем 7 ответ
    public SelenideElement getSeventhAnswer() {
        return seventhAnswer;
    }

    //получаем 8 ответ
    public SelenideElement getEighthAnswer() {
        return eighthAnswer;
    }

    //Кликаем первый вопрос
    public MainPage clickOnFirstQ() {
        btnFirstQuestion.click();
        return this;
    }

    //Кликаем второй вопрос
    public MainPage clickOnSecondQ() {
        btnSecondQuestion.click();
        return this;
    }

    //Кликаем третий вопрос
    public MainPage clickOnThirdQ() {
        btnThirdQuestion.click();
        return this;
    }

    //Кликаем четвертый вопрос
    public MainPage clickOnFourthQ() {
        btnFourthQuestion.click();
        return this;
    }

    //Кликаем пятый вопрос
    public MainPage clickOnFifthQ() {
        btnFifthQuestion.click();
        return this;
    }

    //Кликаем шестой вопрос
    public MainPage clickOnSixthQ() {
        btnSixthQuestion.click();
        return this;
    }

    //Кликаем седьмой вопрос
    public MainPage clickOnSeventhQ() {
        btnSeventhQuestion.click();
        return this;
    }

    //Кликаем восьмой вопрос
    public MainPage clickOnEighthQ() {
        btnEighthQuestion.click();
        return this;
    }
    //кликаем кнопку Заказать Топ
    public OrderPage clickNewOrderTop() {
        btnMakeOrderTop.click();
        return page(OrderPage.class);
    }

    //кликаем кнопку Заказать Down
    public OrderPage clickNewOrderDown() {
        btnMakeOrderDown.click();
        return page(OrderPage.class);
    }

    //скролим до Вопросов о важном
    public MainPage moveToQuestions() {
        listQuestions.scrollIntoView(true);
        return this;
    }

    //скролим до кнопки Заказать внизу
    public MainPage moveToBtnMakeOrderDown() {
        btnMakeOrderDown.scrollIntoView(true);
        return this;
    }

    //Кликаем на "да все привыкли"
    public MainPage getCookiesAccept() {
        btncloseCookies.click();
        return this;
    }
}

