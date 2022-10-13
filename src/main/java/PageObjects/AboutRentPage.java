package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AboutRentPage {
    private WebDriver driver;
    private final By dateRentField = By.xpath(".//*[@placeholder='* Когда привезти самокат']");
    private final By rentPeriodField = By.className("Dropdown-placeholder");
    private final By rentOneDay = By.xpath(     "//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div[2]/div[1]");
    private final By rentTwoDay = By.xpath ( "//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div[2]/div[2]");
    private final By rentThreeDay = By.xpath ( "//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div[2]/div[3]");
    private final By rentFourDay = By.xpath(  "//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div[2]/div[4]");
    private final By rentFiveDay = By.xpath(  "//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div[2]/div[5]");
    private final By rentSixDay = By.xpath(  "//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div[2]/div[6]");
    private final By rentSevenDay = By.xpath(  "//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div[2]/div[7]");
    private final By colorScooterBlack = By.xpath(".//*[@class='Checkbox_Label__3wxSf' and @for='black']");
    private final By colorScooterGrey = By.xpath(".//*[@class='Checkbox_Label__3wxSf' and @for='grey']");

    private final By commentForCourierField = By.className("Input_InputContainer__3NykH");
    private final By buttonOrder = By.xpath("//*[@id='root']/div/div[2]/div[3]/button[2]");
    private final By buttonYes = By.xpath("//*[@id='root']/div/div[2]/div[5]/div[2]/button[2]");
    private final By orderProcessed = By.className("Order_ModalHeader__3FDaJ");

    public AboutRentPage(WebDriver driver) {
        this.driver = driver;
    }
    public void setDateRentField(String dateRent) {
        driver.findElement(dateRentField).click();
        driver.findElement(dateRentField).sendKeys(dateRent);
        driver.findElement(dateRentField).sendKeys(Keys.ENTER);
    }
    public void setRentPeriodField(String day) {
        driver.findElement(rentPeriodField).click();
        if (day == "one") {
            driver.findElement(rentOneDay).click();
        }
        if (day == "two") {
            driver.findElement(rentTwoDay).click();
        }
        if (day == "three") {
            driver.findElement(rentThreeDay).click();
        }
        if (day == "four") {
            driver.findElement(rentFourDay).click();
        }
        if (day == "five") {
            driver.findElement(rentFiveDay).click();
        }
        if (day == "six") {
            driver.findElement(rentSixDay).click();
        }
        if (day == "seven") {
            driver.findElement(rentSevenDay).click();
        }
    }
    public void setColorScooterField(String color) {
        if (color == "black") {
            driver.findElement(colorScooterBlack).click();
        } else {
            driver.findElement(colorScooterGrey).click();

        }
    }
    public void setCommentForCourierField(String comment) {
        driver.findElement(commentForCourierField).sendKeys(comment);
    }
    public void clickButtonOrder() {

        driver.findElement(buttonOrder).click();
    }
    public void waitWindowsYesOrNo() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(buttonOrder));
    }
    public void clickButtonYes() {
        driver.findElement(buttonYes).click();
    }
    public String findOrderProcessedForm() {
        return (driver.findElement(orderProcessed).getText());
    }
    public void aboutRent(String dateRent, String day, String color, String comment) {
        setDateRentField(dateRent);
        setRentPeriodField(day);
        setColorScooterField(color);
        setCommentForCourierField(comment);
        clickButtonOrder();
        waitWindowsYesOrNo();
        clickButtonYes();
        findOrderProcessedForm();
    }

}

