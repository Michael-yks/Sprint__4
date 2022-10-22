import PageObjects.AboutRentPage;
import PageObjects.UserDataPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserDataPageTest {
    private WebDriver driver;
    @Before
    public void openWebsite() {

        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
    }

    @Test
    public void getWindowCreatedOrderScooter() {
        UserDataPage objUserDataPage = new UserDataPage(driver);
        objUserDataPage.fillScooterOrderForm("Таня", "Петрова", "Московская улица 2-2-2", "Таганская", "+79202220000");
        AboutRentPage objAboutRentPage = new AboutRentPage(driver);
        objAboutRentPage.fillFieldAboutRent("24.10.2022", "сутки", "grey", "Позвонить за 30 минут");
        Assert.assertEquals("Incorrect text message", "Заказ оформлен", objAboutRentPage.setTextWindowOrderCreated());
    }
    @Test
    public void getWindowCreatedOrderScooterUseSecondButtonOrder() {
        UserDataPage objUserDataPage = new UserDataPage(driver);
        objUserDataPage.fillScooterOrderFormUseSecondButton("Александр", "Сергеев", "Таганская улица 2-2-2", "Сходненская", "89212323456");
        AboutRentPage objAboutRentPage = new AboutRentPage(driver);
        objAboutRentPage.fillFieldAboutRent("31.10.2022", "сутки", "grey", "Позвонить за 30 минут");
        Assert.assertEquals("Incorrect text message", "Заказ оформлен", objAboutRentPage.setTextWindowOrderCreated());
    }
    @After
    public void tearDown() {
        driver.quit();
    }

}
