import PageObjects.MainPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainPageTest {

        private WebDriver driver;
        private String expected;

    @Before
    public void openWebsite() {
        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
    }

    @Test
    public void checkAnswerAboutCost() {
        MainPage objMainPage = new MainPage(driver);
        expected = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
        objMainPage.cost(expected);
    }
    @Test
    public void checkAnswerAboutQuantity() {
        MainPage objMainPage = new MainPage(driver);
        expected = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
        objMainPage.quantity(expected);
    }
    @Test
    public void checkQuestionAboutTimeRent() {
        MainPage objMainPage = new MainPage(driver);
        expected = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
        objMainPage.timeRent(expected);
    }
    @Test
    public void checkQuestionAboutRentToday() {
        MainPage objMainPage = new MainPage(driver);
        expected = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
        objMainPage.rentToday(expected);
    }
    @Test
    public void checkQuestionAboutExtendRentOrReturn() {
        MainPage objMainPage = new MainPage(driver);
        expected = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
        objMainPage.extendRent(expected);
    }
    @Test
    public void checkQuestionAboutBatteryScooter() {
        MainPage objMainPage = new MainPage(driver);
        expected = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
        objMainPage.batteryScooter(expected);
    }
    @Test
    public void checkQuestionAboutOrderCancel() {
        MainPage objMainPage = new MainPage(driver);
        expected = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
        objMainPage.orderCancel(expected);
    }
    @Test
    public void checkQuestionAboutLocation() {
        MainPage objMainPage = new MainPage(driver);
        expected = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";
        objMainPage.location(expected);
    }
    @Test
    public void checkClickOrderFirstButton() {
        MainPage objMainPage = new MainPage(driver);
        objMainPage.firstButton();
    }
    @Test
    public void checkClickOrderSecondButton() {
        MainPage objMainPage = new MainPage(driver);
        objMainPage.secondButton();
    }
    @After
    public void quitWebsite(){
        driver.quit();
    }
}
