package pages.Elements;

import com.github.javafaker.Faker;
import dto.FormData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pages.Form.FormPage;
import pages.BasePage;
import wrappers.*;

import static elements.Elements.*;

public class ElementsPage extends BasePage {

    public ElementsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public ElementsPage isPageOpened() {
        waitForPageLoaded();
        wait.until(ExpectedConditions.visibilityOfElementLocated(ELEMENTS_TITLE));
        return this;
    }

    public ElementsPage useTextBox(FormData form) {
        org.openqa.selenium.WebElement el = driver.findElement(TEXT_BOX_BUTTON);
        ((org.openqa.selenium.JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", el);
        el.click();
        form.applyTextBox(driver, form);
        org.openqa.selenium.WebElement element = driver.findElement(SUBMIT_BUTTON);
        ((org.openqa.selenium.JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        element.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(SUCCESS_MESSAGE));
        return this;
    }

    public ElementsPage useCheckBox() {
        driver.findElement(CHECKBOX_BUTTON).click();
        driver.findElement(SHOW_ALL_BUTTON).click();
        new Checkbox(driver, "Desktop").check();
        new Checkbox(driver, "Documents").check();
        new Checkbox(driver, "Downloads").check();
        new Checkbox(driver, "Home").check();
        return this;
    }

    public ElementsPage useRadioButton() {
        driver.findElement(RADIO_BUTTON_SECTION).click();
        new RadioButton(driver, "Impressive").select();
        Assert.assertEquals(driver.findElement(By.xpath("//span[@class='text-success']")).getText(), "Impressive");
        return this;
    }

    public ElementsPage useWebTables(FormData form) {
        Faker faker = new Faker();
        String firstName = faker.name().firstName();
        driver.findElement(WEB_TABLES_BUTTON).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("addNewRecordButton")));
        driver.findElement(By.id("addNewRecordButton")).click();
        form.fillFirstName(driver, form);
        form.useWebPages(driver, form);
        driver.findElement(By.id("submit")).click();
        driver.findElement(By.id("submit")).isDisplayed();
        return this;
    }

    public ElementsPage useButtons() {
        driver.findElement(BUTTONS).click();
        SoftAssert softAssert = new SoftAssert();
        new Buttons(driver, "Right Click Me").rightClick();
        softAssert.assertEquals(driver.findElement(By.id("rightClickMessage")).getText(),
                "You have done a right click");
        new Buttons(driver, "Double Click Me").doubleClick();
        softAssert.assertEquals(driver.findElement(By.id("doubleClickMessage")).getText(),
                "You have done a double click");
        new Buttons(driver, "Click Me").click();
        softAssert.assertEquals(driver.findElement(By.id("dynamicClickMessage")).getText(),
                "You have done a dynamic click");
        return this;
    }

    public ElementsPage useLinks(String linkText, String expectedUrlPart) {
        driver.findElement(By.xpath("//span[contains(text(),'Links')]")).click();
        driver.findElement(By.xpath(linkText)).click();
        wait.until(ExpectedConditions.urlContains(expectedUrlPart));
        return this;
    }

    public ElementsPage useResponse(String linkText, String expectedStatus) {
        driver.findElement(LINKS).click();
        driver.findElement(By.linkText(linkText)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("linkResponse")));
        Assert.assertTrue(driver.findElement(By.id("linkResponse")).getText().contains(expectedStatus));
        return this;
    }

    public FormPage goToFormPage() {
        org.openqa.selenium.WebElement el = driver.findElement(FORM_PAGE_BUTTON);
        ((org.openqa.selenium.JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", el);
        el.click();
        driver.findElement(PRACTICE_FORM).click();
        return new FormPage(driver);
    }

}
