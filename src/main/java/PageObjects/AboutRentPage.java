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
    private final By rentOneDay = By.xpath(".//*[text() = 'сутки']");
    private final By rentTwoDay = By.xpath ( ".//*[text() = 'двое суток']");
    private final By rentThreeDay = By.xpath ( ".//*[text() = 'трое суток']");
    private final By rentFourDay = By.xpath(  ".//*[text() = 'четверо суток']");
    private final By rentFiveDay = By.xpath(  ".//*[text() = 'пятеро суток']");
    private final By rentSixDay = By.xpath(  ".//*[text() = 'шестеро суток']");
    private final By rentSevenDay = By.xpath(  ".//*[text() = 'семеро суток']");
    private final By colorScooterBlack = By.xpath(".//*[@class='Checkbox_Label__3wxSf' and @for='black']");
    private final By colorScooterGrey = By.xpath(".//*[@class='Checkbox_Label__3wxSf' and @for='grey']");

    private final By commentForCourierField = By.xpath(".//*[@placeholder = 'Комментарий для курьера']");

    private final By buttonOrder = By.xpath(".//div[@class='Order_Content__bmtHS']//button[text()='Заказать']");
    private final By buttonYes = By.xpath(".//button[(text() = 'Да')]");
    private final By windowOrderCreated = By.className("Order_Modal__YZ-d3");
    //private final By buttonOrderStatus = By.xpath(".//*[text() = 'Посмотреть статус']");
    //private final By windowOrderStatus = By.className("Track_OrderInfo__2fpDL");



    public AboutRentPage(WebDriver driver) {
        this.driver = driver;
    }
    public void fillDateRentField(String dateRent) {
        driver.findElement(dateRentField).click();
        driver.findElement(dateRentField).sendKeys(dateRent);
        driver.findElement(dateRentField).sendKeys(Keys.ENTER);
    }
    public void selectRentPeriodField(String day) {
        driver.findElement(rentPeriodField).click();
        switch (day) {
            case "сутки":
                driver.findElement(rentOneDay).click();
                break;
            case "двое суток":
                driver.findElement(rentTwoDay).click();
                break;
            case "трое суток":
                driver.findElement(rentThreeDay).click();
                break;
            case "четверо суток":
                driver.findElement(rentFourDay).click();
                break;
            case "пятеро суток":
                driver.findElement(rentFiveDay).click();
                break;
            case "шесть суток":
                driver.findElement(rentSixDay).click();
                break;
            case "семеро суток":
                driver.findElement(rentSevenDay).click();
                break;
        }
    }
    public void selectColorScooterField(String color) {
        if (color == "black") {
            driver.findElement(colorScooterBlack).click();
        } else {
            driver.findElement(colorScooterGrey).click();
        }
    }
    public void fillCommentForCourierField(String comment) {
        driver.findElement(commentForCourierField).sendKeys(comment);
    }
    public void clickButtonOrder() {
        driver.findElement(buttonOrder).click();
    }
    public void waitWindowsYesOrNo() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(windowOrderCreated));
    }
    public void clickButtonYes() {
        driver.findElement(buttonYes).click();
    }
    public String setTextWindowOrderCreated() {
        return (driver.findElement(windowOrderCreated).getText());
    }
    public void fillFieldAboutRent(String dateRent, String day, String color, String comment) {
        fillDateRentField(dateRent);
        selectRentPeriodField(day);
        selectColorScooterField(color);
        fillCommentForCourierField(comment);
        clickButtonOrder();
        waitWindowsYesOrNo();
        clickButtonYes();
        setTextWindowOrderCreated();
    }
}

