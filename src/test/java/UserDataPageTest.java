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

   // @Test
   // public void checkInputUserData_1() {
     //   UserDataPage objUserDataPage = new UserDataPage(driver);
       // objUserDataPage.fillScooterOrderForm("Петя", "Петров", "Мюнхен штрассе 2-2-2", "Щукинская", "89202221122");
    //}

    //@Test
    //public void checkInputUserData_2() {
      //  UserDataPage objUserDataPage = new UserDataPage(driver);
        //objUserDataPage.fillScooterOrderForm("Таня", "Петрова", "Московская улица 2-2-2", "Таганская", "+79202220000");
   // }
    @Test
    public void getWindowCreatedOrderScooter() {
        UserDataPage objUserDataPage = new UserDataPage(driver);
        objUserDataPage.fillScooterOrderForm("Таня", "Петрова", "Московская улица 2-2-2", "Таганская", "+79202220000");
        AboutRentPage objAboutRentPage = new AboutRentPage(driver);
        objAboutRentPage.fillFieldAboutRent("13.10.2022", "сутки", "grey", "Позвонить за 30 минут");
        Assert.assertEquals("Incorrect text message", "Заказ оформлен", objAboutRentPage.setTextWindowOrderCreated());
    }
    @After
    public void tearDown() {
        driver.quit();
    }

}
