package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogoutPage {
    WebDriver driver;

    By userDropdown = By.cssSelector("span.oxd-userdropdown-tab");
    By logoutLink = By.xpath("//a[text()='Logout']");

    public LogoutPage(WebDriver driver) {
        this.driver = driver;
    }

    public void logout() {
        driver.findElement(userDropdown).click();
        driver.findElement(logoutLink).click();
    }
}
