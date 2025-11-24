package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.asserts.SoftAssert;
import pages.base.BasePage;
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

    public ElementsPage useTextBox() {
        org.openqa.selenium.WebElement el = driver.findElement(TEXT_BOX_BUTTON);
        ((org.openqa.selenium.JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", el);
        el.click();
        new Input (driver, "Email").write("John_Doe@gmail.com");
        new TextArea(driver, "Current Address").write("1234 Elm Street, Springfield, IL 62704");
        new TextArea(driver, "Permanent Address").write("5678 Oak Avenue, Springfield, IL 62705");
        org.openqa.selenium.WebElement element = driver.findElement(SUBMIT_BUTTON);
        ((org.openqa.selenium.JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        element.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(SUCCESS_MESSAGE));
        Assert.assertEquals(driver.findElement(SUCCESS_MESSAGE).getText(), "Email:John_Doe@gmail.com");
        return this;
    }

    public ElementsPage useCheckBox() throws InterruptedException {
        driver.findElement(CHECKBOX_BUTTON).click();
        driver.findElement(SHOW_ALL_BUTTON).click();
        new Checkbox(driver, "Desktop").select();
        new Checkbox(driver, "Documents").select();
        new Checkbox(driver, "Downloads").select();
        new Checkbox(driver, "Home").select();
        return this;
    }

    public ElementsPage useRadioButton() {
        driver.findElement(RADIO_BUTTON_SECTION).click();
        new RadioButton(driver, "Impressive").select();
        Assert.assertEquals(driver.findElement(By.xpath("//span[@class='text-success']")).getText(), "Impressive");
        return this;
    }

    public ElementsPage useWebTables(){
        driver.findElement(WEB_TABLES_BUTTON).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("addNewRecordButton")));
        driver.findElement(By.id("addNewRecordButton")).click();
        new Input(driver, "First Name").write("John");
        new Input(driver, "Last Name").write("Doe");
        new Input(driver, "Email").write("JohnDoe@mail.com");
        new Input(driver, "Age").write("30");
        new Input(driver, "Salary").write("50000");
        new Input(driver, "Department").write("Engineering");
        driver.findElement(By.id("submit")).click();
        Assert.assertEquals(driver.findElement(By.xpath("//div[@class='rt-td']" +
                "[contains(text(), 'Engineering')]")).getText(), "Engineering");
        return this;
    }

    public ElementsPage useButtons() {
        driver.findElement(By.xpath("//span[contains(text(),'Buttons')]")).click();
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
        driver.findElement(By.xpath("//span[contains(text(),'Links')]")).click();
        driver.findElement(By.linkText(linkText)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("linkResponse")));
        Assert.assertTrue(driver.findElement(By.id("linkResponse")).getText().contains(expectedStatus));
        return this;
    }

    public FormPage goToFormPage() {
        org.openqa.selenium.WebElement el = driver.findElement(FORM_PAGE_BUTTON);
        ((org.openqa.selenium.JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", el);
        el.click();
        driver.findElement(By.xpath("//span[contains(text(),'Practice Form')]")).click();
        return new FormPage(driver);
    }

}
