import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.conditions.webdriver.Url;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class QuestionsAboutImportantTest {
    private String exactText1 = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
    private String exactText2 = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
    private String exactText3 = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
    private String exactText4 = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
    private String exactText5 = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
    private String exactText6 = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
    private String exactText7 = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
    private String exactText8 = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";

    @Before
    public void startUp() {
        System.setProperty("selenide.browser", "chrome");
        Configuration.startMaximized = true;
    }


    @Test
    public void checkQuestionsAndAnswers1() {
        //открываем главную страницу
        open(MainPage.URL, MainPage.class)
                //принимаем куки
                .getCookiesAccept()
                //скролим до вопросов
                .moveToQuestions()
                //открываем 1 вопрос
                .clickOnFirstQ()
                //проверяем ответ
                .getFirstAnswer().shouldHave(exactText(exactText1));
    }

    @Test
    public void checkQuestionsAndAnswers2() {
        //открываем главную страницу
        open(MainPage.URL, MainPage.class)
                //принимаем куки
                //.getCookiesAccept() //расскомментить если запускать точечно
                //скролим до вопросов
                .moveToQuestions()
                //открываем 2 вопрос
                .clickOnSecondQ()
                //проверяем ответ
                .getSecondAnswer().shouldHave(exactText(exactText2));
    }

    @Test
    public void checkQuestionsAndAnswers3() {
        //открываем главную страницу
        open(MainPage.URL, MainPage.class)
                //принимаем куки
                //.getCookiesAccept()
                //скролим до вопросов
                .moveToQuestions()
                //открываем 3 вопрос
                .clickOnThirdQ()
                //проверяем ответ
                .getThirdAnswer().shouldHave(exactText(exactText3));
    }

    @Test
    public void checkQuestionsAndAnswers4() {
        //открываем главную страницу
        open(MainPage.URL, MainPage.class)
                //принимаем куки
                //.getCookiesAccept()
                //скролим до вопросов
                .moveToQuestions()
                //открываем 4 вопрос
                .clickOnFourthQ()
                //проверяем ответ
                .getFourthAnswer().shouldHave(exactText(exactText4));
    }

    @Test
    public void checkQuestionsAndAnswers5() {
        //открываем главную страницу
        open(MainPage.URL, MainPage.class)
                //принимаем куки
                //.getCookiesAccept()
                //скролим до вопросов
                .moveToQuestions()
                //открываем 5 вопрос
                .clickOnFifthQ()
                //проверяем ответ
                .getFifthAnswer().shouldHave(exactText(exactText5));
    }

    @Test
    public void checkQuestionsAndAnswers6() {
        //открываем главную страницу
        open(MainPage.URL, MainPage.class)
                //принимаем куки
                //.getCookiesAccept()
                //скролим до вопросов
                .moveToQuestions()
                //открываем 6 вопрос
                .clickOnSixthQ()
                //проверяем ответ
                .getSixthAnswer().shouldHave(exactText(exactText6));
    }

    @Test
    public void checkQuestionsAndAnswers7() {
        //открываем главную страницу
        open(MainPage.URL, MainPage.class)
                //принимаем куки
                //.getCookiesAccept()
                //скролим до вопросов
                .moveToQuestions()
                //открываем 7 вопрос
                .clickOnSeventhQ()
                //проверяем текст
                .getSeventhAnswer().shouldHave(exactText(exactText7));
    }

    @Test
    public void checkQuestionsAndAnswers8() {
        //открываем главную страницу
        open(MainPage.URL, MainPage.class)
                //принимаем куки
                //.getCookiesAccept()
                //скролим до вопросов
                .moveToQuestions()
                //открываем 8 вопрос
                .clickOnEighthQ()
                //проверяем текст
                .getEighthAnswer().shouldHave(exactText(exactText8));
    }
}


