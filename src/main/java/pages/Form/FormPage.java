package pages.Form;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.Alerts.AlertsFrameWindowPage;
import pages.BasePage;
import wrappers.*;

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

    public FormPage fillOutForm() {
        new Input(driver, "First Name").write("John");
        new Input(driver, "Last Name").write("Doe");
        new Input(driver, "Email").write("JohnDoe@mail.com");
        new Input(driver, "Mobile").write("1234567890");
        new Input(driver, "Subjects").write("History");
        new RadioButton(driver,"Male").select();
        new TextArea(driver, "Current Address").write("1234 Elm Street, Springfield, IL 62704");
        new PickList(driver, "State and City").select("NCR");
        driver.findElement(SUBMIT_BUTTON).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(SUCCESS_MESSAGE));
        return this;
    }

    public AlertsFrameWindowPage goToAlertsPage() {
        driver.findElement(ALERTS_PAGE_BUTTON).click();
        return new AlertsFrameWindowPage(driver);
    }
}
