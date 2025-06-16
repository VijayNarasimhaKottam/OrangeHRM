/*package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
    private WebDriver driver;
    private By dashboardText = By.xpath("//h6[text()='Dashboard']");

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isDashboardVisible() {
        return driver.findElement(dashboardText).isDisplayed();
    }
}
*/
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
    WebDriver driver;
    private By dashboardText = By.xpath("//h6[text()='Dashboard']");
    By pimLink = By.xpath("//span[text()='PIM']");

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    public void goToPIM() {
        driver.findElement(pimLink).click();
    }
    public boolean isDashboardVisible() {
        return driver.findElement(dashboardText).isDisplayed();
    }
	
}
