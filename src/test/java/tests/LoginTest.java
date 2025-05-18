package tests;

import base.Base;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends Base {
    @Test
    public void validLogin(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickLoginBtn();
        System.out.println("Dev");
        String pageTitle = driver.getTitle();
        Assert.assertEquals(pageTitle, "OrangeHRM");
    }
}
