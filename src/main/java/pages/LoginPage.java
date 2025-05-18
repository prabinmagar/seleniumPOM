package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private final WebDriver driver;
    private final By usernameField = By.xpath("//input[contains(@class, 'oxd-input') and @placeholder='Username' and @name='username']");
    private final By passwordField = By.xpath("//input[contains(@class, 'oxd-input') and @placeholder='Password' and @name='password']");
    private final By loginBtn = By.xpath("//button[@type='submit' and contains(@class,'orangehrm-login-button')]");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void enterUsername(String username){
        driver.findElement(usernameField).sendKeys(username);
    }

    public void enterPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLoginBtn(){
        driver.findElement(loginBtn).click();
    }
}
