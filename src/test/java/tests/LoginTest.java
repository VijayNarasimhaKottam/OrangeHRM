package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.DashboardPage;

public class LoginTest extends BaseTest {

    @Test
    public void validLoginTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("Admin", "admin123");

        DashboardPage dashboardPage = new DashboardPage(driver);
        Assert.assertTrue(dashboardPage.isDashboardVisible(), "Dashboard not visible");
    }

    @Test
    public void invalidUsernameTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("WrongUser", "admin123");
        Assert.assertTrue(loginPage.isErrorMessageDisplayed(), "Error message not displayed");
    }

    @Test
    public void invalidPasswordTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("Admin", "wrongpass");
        Assert.assertTrue(loginPage.isErrorMessageDisplayed(), "Error message not displayed");
    }

    @Test
    public void blankCredentialsTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("", "");
        Assert.assertTrue(loginPage.isErrorMessageDisplayed(), "Error message not displayed");
    }
 
    
}