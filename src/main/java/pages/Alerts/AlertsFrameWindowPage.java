package pages.Alerts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import pages.Widgets.WidgetsPage;
import pages.BasePage;

import static elements.Elements.*;


public class AlertsFrameWindowPage extends BasePage {

    public AlertsFrameWindowPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public AlertsFrameWindowPage isPageOpened() {
        waitForPageLoaded();
        return this;
    }

    public AlertsFrameWindowPage goToWindowsPage() {
        driver.findElement(WINDOWS_BUTTON).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(WINDOWS_TITLE));
        return this;
    }

    public AlertsFrameWindowPage useTab() {
        driver.findElement(NEW_TAB_BUTTON).click();
        String originalHandle = driver.getWindowHandle();
        for (String handle : driver.getWindowHandles()) {
            if (!handle.equals(originalHandle)) {
                driver.switchTo().window(handle);
                break;
            }
        }
        return this;
    }

    public AlertsFrameWindowPage useWindow() {
        driver.findElement(NEW_WINDOW_BUTTON).click();
        String originalHandle = driver.getWindowHandle();
        for (String handle : driver.getWindowHandles()) {
            if (!handle.equals(originalHandle)) {
                driver.switchTo().window(handle);
                break;
            }
        }
        return this;
    }

    public AlertsFrameWindowPage useWindowMessage() {
        driver.findElement(NEW_WINDOW_MESSAGE_BUTTON).click();
        String originalHandle = driver.getWindowHandle();
        for (String handle : driver.getWindowHandles()) {
            if (!handle.equals(originalHandle)) {
                driver.switchTo().window(handle);
                break;
            }
        }
        return this;
    }

    public AlertsFrameWindowPage goToAlertsPage() {
        driver.findElement(ALERTS_BUTTON).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(ALERTS_TITLE));
        return this;
    }

    public AlertsFrameWindowPage goToAlert() {
        driver.findElement(FIRST_ALERT_BUTTON).click();
        driver.switchTo().alert().accept();
        driver.findElement(SECOND_ALERT_BUTTON).click();
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
        driver.findElement(THIRD_ALERT_BUTTON).click();
        driver.switchTo().alert().dismiss();
        driver.findElement(FOURTH_ALERT_BUTTON).click();
        driver.switchTo().alert().sendKeys("Stas");
        driver.switchTo().alert().accept();
        Assert.assertTrue(driver.findElement(CONFIRM_RESULT_TEXT).getText().contains("Stas"));
        return this;
    }

    public WidgetsPage goToWidgetsPage() {
        driver.findElement(WIDGETS_BUTTON).click();
        return new WidgetsPage(driver);
    }

}