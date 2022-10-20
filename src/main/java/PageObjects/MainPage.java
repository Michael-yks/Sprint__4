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
    public String getTextAnswerToQuestionAboutCost() {
        return driver.findElement(answer_1).getText();
    }
        public void checkTextAnswerAboutCost() {
           scrollQuestionAboutMain();
           clickQuestionAboutCost();
    }

    public void clickQuestionAboutQuantity() {
        driver.findElement(question_2).click();
    }
    public String getTextAnswerToQuestionAboutQuantity() {
        return driver.findElement(answer_2).getText();
        }
        public void checkTextAnswerAboutQuantity() {
            scrollQuestionAboutMain();
            clickQuestionAboutQuantity();
    }

    public void clickQuestionAboutTimeRent() {
        driver.findElement(question_3).click();
    }
    public String getTextAnswerToQuestionAboutTimeRent() {
        return driver.findElement(answer_3).getText();
    }
    public void checkTextAnswerAboutTimeRent() {
        scrollQuestionAboutMain();
        clickQuestionAboutTimeRent();
    }

    public void clickQuestionAboutRentToday() {
        driver.findElement(question_4).click();
    }
    public String getTextAnswerToQuestionAboutRentToday() {
        return driver.findElement(answer_4).getText();
    }
    public void checkTextAnswerAboutRentToday() {
        scrollQuestionAboutMain();
        clickQuestionAboutRentToday();
    }

    public void clickQuestionAboutExtendRentOrReturn() {
        driver.findElement(question_5).click();
    }
    public String getTextAnswerToQuestionAboutExtendRentOrReturn() {
        return driver.findElement(answer_5).getText();
    }
    public void checkTextAnswerAboutExtendRentOrReturn() {
        scrollQuestionAboutMain();
        clickQuestionAboutExtendRentOrReturn();
    }

    public void clickQuestionAboutBatteryScooter() {
        driver.findElement(question_6).click();
    }
    public String getTextAnswerToQuestionAboutBatteryScooter() {
        return driver.findElement(answer_6).getText();
    }
    public void checkTextAnswerAboutBatteryScooter() {
        scrollQuestionAboutMain();
        clickQuestionAboutBatteryScooter();
    }

    public void clickQuestionAboutOrderCancel() {
        driver.findElement(question_7).click();
    }
    public String getTextAnswerToQuestionAboutOrderCancel() {
        return driver.findElement(answer_7).getText();
    }
    public void checkTextAnswerAboutOrderCancel() {
        scrollQuestionAboutMain();
        clickQuestionAboutOrderCancel();
    }

    public void clickQuestionAboutLocation() {
        driver.findElement(question_8).click();
    }
    public String getTextAnswerToQuestionAboutLocation() {
        return driver.findElement(answer_8).getText();
    }
    public void checkTextAnswerAboutLocation() {
        scrollQuestionAboutMain();
        clickQuestionAboutLocation();
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
    public void secondButton() {
        scrollQuestionAboutMain();
        clickOrderSecondButton();

    }
}

