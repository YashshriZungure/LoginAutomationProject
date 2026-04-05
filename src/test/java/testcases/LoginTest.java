package testcases;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void validLoginTest() {

        LoginPage login = new LoginPage(driver);

        login.enterUsername("standard_user");
        login.enterPassword("secret_sauce");
        login.clickLogin();

        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.saucedemo.com/inventory.html";

        Assert.assertEquals(actualUrl, expectedUrl);
    }

    @Test
    public void invalidLoginTest() {

        LoginPage login = new LoginPage(driver);

        login.enterUsername("wrong_user");
        login.enterPassword("wrong_pass");
        login.clickLogin();

        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.saucedemo.com/";

        Assert.assertEquals(true, false);
    }
}