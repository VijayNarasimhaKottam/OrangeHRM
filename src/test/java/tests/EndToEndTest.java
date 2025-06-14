package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.*;

public class EndToEndTest extends BaseTest {

    @Test
    public void orangeHRMEndToEndFlow() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        DashboardPage dashboard = new DashboardPage(driver);
        PIMPage pimPage = new PIMPage(driver);
        LogoutPage logoutPage = new LogoutPage(driver);

        // Step 1: Login
        loginPage.login("Admin", "admin123");

        // Step 2: Go to PIM
        dashboard.goToPIM();

        // Step 3: Add Employee
        String firstName = "John";
        String lastName = "Doe";
        pimPage.addEmployee(firstName, lastName);
        Thread.sleep(2000); // Wait for save

        // Step 4: Search Employee
        dashboard.goToPIM(); // go back to PIM main
        pimPage.searchEmployee(firstName + " " + lastName);
        Thread.sleep(2000); // wait for search result

        // Step 5: Logout
        logoutPage.logout();
    }
}
