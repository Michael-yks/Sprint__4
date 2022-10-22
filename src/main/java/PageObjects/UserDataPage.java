package PageObjects;

import org.openqa.selenium.*;

public class UserDataPage {
    private WebDriver driver;
    private final By orderButtonHeader = By.className("Button_Button__ra12g");
    private final By orderSecondButton = By.cssSelector("div.Home_FinishButton__1_cWm > button.Button_Middle__1CSJM");
    private final By nameField = By.xpath("//*[@placeholder='* Имя']");
    private final By familyNameField = By.xpath("//*[@placeholder='* Фамилия']");
    private final By deliveryAddressField = By.xpath("//*[@placeholder='* Адрес: куда привезти заказ']");
    private final By metroStationField = By.xpath("//*[@placeholder='* Станция метро']");
    private final By telNumberField = By.xpath("//*[@placeholder='* Телефон: на него позвонит курьер']");
    private final By nextButton = By.xpath(".//button[(text() = 'Далее')]");

    public UserDataPage(WebDriver driver) {
        this.driver = driver;
    }

    public void scrollToOrderSecondButton() {
        WebElement element = driver.findElement(orderSecondButton);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
    }


    public void clickOrderButtonHeader() {
        driver.findElement(orderButtonHeader).click();
    }
    public void clickOrderSecondButton() {
        driver.findElement(orderSecondButton).click();
    }
    public void fillFieldName(String name) {
        driver.findElement(nameField).sendKeys(name);
    }
    public void fillFieldFamilyName(String familyName) {
        driver.findElement(familyNameField).sendKeys(familyName);
    }
    public void fillFieldDeliveryAddress(String deliveryAddress) {
        driver.findElement(deliveryAddressField).sendKeys(deliveryAddress);
    }
    public void fillFieldMetroStation(String metroStation) {
        driver.findElement(metroStationField).click();
        driver.findElement(metroStationField).sendKeys((Keys.ARROW_DOWN));
        driver.findElement(metroStationField).sendKeys(Keys.ENTER);
    }
    public void fillFieldTelNumber(String telNumber) {
        driver.findElement(telNumberField).sendKeys(telNumber);
    }
    public void clickNextButton() {
        driver.findElement(nextButton).click();
    }
    public void fillScooterOrderForm(String name, String familyName, String deliveryAddress, String metroStation, String telNumber) {
        clickOrderButtonHeader();
        fillFieldName(name);
        fillFieldFamilyName(familyName);
        fillFieldDeliveryAddress(deliveryAddress);
        fillFieldMetroStation(metroStation);
        fillFieldTelNumber(telNumber);
        clickNextButton();
    }
    public void fillScooterOrderFormUseSecondButton(String name, String familyName, String deliveryAddress, String metroStation, String telNumber) {
        scrollToOrderSecondButton();
        clickOrderSecondButton();
        fillFieldName(name);
        fillFieldFamilyName(familyName);
        fillFieldDeliveryAddress(deliveryAddress);
        fillFieldMetroStation(metroStation);
        fillFieldTelNumber(telNumber);
        clickNextButton();
    }


}

