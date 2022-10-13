package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class UserDataPage {
    private WebDriver driver;
    private final By orderButton = By.className("Button_Button__ra12g");
    private final By nameField = By.xpath("//*[@placeholder='* Имя']");
    private final By familyNameField = By.xpath("//*[@placeholder='* Фамилия']");
    private final By deliveryAddressField = By.xpath("//*[@placeholder='* Адрес: куда привезти заказ']");
    private final By metroStationField = By.xpath("//*[@placeholder='* Станция метро']");
    private final By telNumberField = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[5]/input");
    private final By nextOrderButton = By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/button");

    public UserDataPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOrderButton() {
        driver.findElement(orderButton).click();
    }

    public void setName(String name) {
        driver.findElement(nameField).sendKeys(name);

    }

    public void setFamilyName(String familyName) {
        driver.findElement(familyNameField).sendKeys(familyName);
    }
    public void setDeliveryAddress(String deliveryAddress) {
        driver.findElement(deliveryAddressField).sendKeys(deliveryAddress);
    }
    public void setMetroStation(String metroStation) {
        driver.findElement(metroStationField).click();
        driver.findElement(metroStationField).sendKeys((Keys.ARROW_DOWN));
        driver.findElement(metroStationField).sendKeys(Keys.ENTER);
    }
    public void setTelNumber(String telNumber) {
        driver.findElement(telNumberField).sendKeys(telNumber);
    }
    public void clickNextOrderButton() {
        driver.findElement(nextOrderButton).click();
    }
    public void orderForm(String name, String familyName, String deliveryAddress, String metroStation, String telNumber) {
        clickOrderButton();
        setName(name);
        setFamilyName(familyName);
        setDeliveryAddress(deliveryAddress);
        setMetroStation(metroStation);
        setTelNumber(telNumber);
        clickNextOrderButton();
    }


}

