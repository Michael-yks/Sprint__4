package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPage {
    private WebDriver driver;
    private final By questionAboutMain = By.className("accordion");
    private final By question_1 = By.id("accordion__heading-0");
    private final By answer_1 = By.id("accordion__panel-0");
    private final By question_2 = By.id("accordion__heading-1");
    private final By answer_2 = By.id("accordion__panel-1");
    private final By question_3 = By.id("accordion__heading-2");
    private final By answer_3= By.id("accordion__panel-2");
    private final By question_4 = By.id("accordion__heading-3");
    private final By answer_4 = By.id("accordion__panel-3");
    private final By question_5 = By.id("accordion__heading-4");
    private final By answer_5 = By.id("accordion__panel-4");
    private final By question_6 = By.id("accordion__heading-5");
    private final By answer_6 = By.id("accordion__panel-5");
    private final By question_7 = By.id("accordion__heading-6");
    private final By answer_7 = By.id("accordion__panel-6");
    private final By question_8 = By.id("accordion__heading-7");
    private final By answer_8 = By.id("accordion__panel-7");
    private final By orderFirstButton = By.className("Button_Button__ra12g");
    private final By orderSecondButton = By.cssSelector("div.Home_FinishButton__1_cWm > button.Button_Middle__1CSJM");

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }
    public void scrollQuestionAboutMain() {
        WebElement element = driver.findElement(questionAboutMain);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
    }
    public void clickQuestionAboutCost() {

        driver.findElement(question_1).click();
    }
    public void waitForCost(String expected){
        new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.textToBePresentInElementLocated(answer_1, expected));
    }
    public void cost(String expected) {
        scrollQuestionAboutMain();
        clickQuestionAboutCost();
        waitForCost(expected);
    }
    public void clickQuestionAboutQuantity() {
        driver.findElement(question_2).click();
    }   public void waitForQuantity(String expected){
        new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.textToBePresentInElementLocated(answer_2, expected));
    }
    public void quantity(String expected) {
        scrollQuestionAboutMain();
        clickQuestionAboutQuantity();
        waitForQuantity(expected);
    }
    public void clickQuestionAboutTimeRent() {
        driver.findElement(question_3).click();
    }
    public void waitForTimeRent(String expected) {
        new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.textToBePresentInElementLocated(answer_3, expected));
    }
    public void timeRent(String expected) {
        scrollQuestionAboutMain();
        clickQuestionAboutTimeRent();
        waitForTimeRent(expected);
    }
    public void clickQuestionAboutRentToday() {
        driver.findElement(question_4).click();
    }
    public void waitForRentToday(String expected) {
        new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.textToBePresentInElementLocated(answer_4, expected));
    }
    public void rentToday(String expected) {
        scrollQuestionAboutMain();
        clickQuestionAboutRentToday();
        waitForRentToday(expected);
    }

    public void clickQuestionAboutExtendRentOrReturn() {
        driver.findElement(question_5).click();
    }
    public void waitForExtendRent(String expected) {
        new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.textToBePresentInElementLocated(answer_5, expected));
    }
    public void extendRent(String expected) {
        scrollQuestionAboutMain();
        clickQuestionAboutExtendRentOrReturn();
        waitForExtendRent(expected);
    }

    public void clickQuestionAboutBatteryScooter() {
        driver.findElement(question_6).click();
    }
    public void waitForBatteryScooter(String expected) {
        new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.textToBePresentInElementLocated(answer_6, expected));
    }
    public void batteryScooter(String expected) {
        scrollQuestionAboutMain();
        clickQuestionAboutBatteryScooter();
        waitForBatteryScooter(expected);
    }

    public void clickQuestionAboutOrderCancel() {
        driver.findElement(question_7).click();
    }
    public void waitForOrderCancel(String expected) {
        new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.textToBePresentInElementLocated(answer_7, expected));
    }
    public void orderCancel(String expected) {
        scrollQuestionAboutMain();
        clickQuestionAboutOrderCancel();
        waitForOrderCancel(expected);
    }

    public void clickQuestionAboutLocation() {
        driver.findElement(question_8).click();
    }
    public void waitForLocation(String expected) {
        new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.textToBePresentInElementLocated(answer_8, expected));
    }
    public void location(String expected) {
        scrollQuestionAboutMain();
        clickQuestionAboutLocation();
        waitForLocation(expected);
    }

    public void clickOrderFirstButton() {
        driver.findElement(orderFirstButton).click();
    }
    public void waitForFirstButton() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(orderFirstButton));
    }
    public void firstButton() {
        clickOrderFirstButton();
        waitForFirstButton();
    }
    public void clickOrderSecondButton() {
        driver.findElement(orderSecondButton).click();
    }
    public void waitForSecondButton() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(orderSecondButton));
    }
    public void secondButton() {
        scrollQuestionAboutMain();
        clickOrderSecondButton();
        waitForSecondButton();
    }
}

