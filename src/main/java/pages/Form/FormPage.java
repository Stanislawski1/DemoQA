package pages.Form;

import dto.FormData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.Alerts.AlertsFrameWindowPage;
import pages.BasePage;

import static elements.Elements.*;

public class FormPage extends BasePage {

    public FormPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public FormPage isPageOpened() {
        waitForPageLoaded();
        wait.until(ExpectedConditions.visibilityOfElementLocated(FORM_TITLE));
        return this;
    }

    public FormPage fillOutForm(FormData form) {
        form.apply(driver, form);
        form.applySpecialFields(driver, form, "Male");
        org.openqa.selenium.WebElement submit = driver.findElement(SUBMIT_BUTTON);
        ((org.openqa.selenium.JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", submit);
        submit.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(SUCCESS_MESSAGE));
        return this;
    }

    public AlertsFrameWindowPage goToAlertsPage() {
        driver.findElement(ALERTS_PAGE_BUTTON).click();
        return new AlertsFrameWindowPage(driver);
    }

}
