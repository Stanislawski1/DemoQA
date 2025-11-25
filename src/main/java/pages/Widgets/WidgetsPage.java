package pages.Widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pages.BasePage;

import java.util.List;

import static elements.Elements.*;

public class WidgetsPage extends BasePage {

    public static final By INPUT_RESULT = By.xpath("//div[@class='css-12jo7m5 auto-complete__multi-value__label']");
    public static final By SINGLE_INPUT_RESULT = By.xpath("//div[@class='auto-complete__single-value css-1uccc91-singleValue']");

    public WidgetsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public WidgetsPage isPageOpened() {
        waitForPageLoaded();
        return this;
    }

    public WidgetsPage goToAccordianPage() {
        driver.findElement(ACCORDIAN_BUTTON).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(ACCORDIAN_TITLE));
        Assert.assertEquals(driver.findElement(ACCORDIAN_TITLE).getText(), "Accordian");
        return this;
    }

    public WidgetsPage useAccordian() {
        SoftAssert softAssert = new SoftAssert();
        driver.findElement(ACCORDIAN_FIRST_SECTION).click();
        softAssert.assertTrue(driver.findElement(ACCORDIAN_FIRST_SECTION_CONTENT).isDisplayed(), "First section content is not displayed");
        driver.findElement(ACCORDIAN_SECOND_SECTION).click();
        softAssert.assertTrue(driver.findElement(ACCORDIAN_SECOND_SECTION_CONTENT).isDisplayed(), "Second section content is not displayed");
        driver.findElement(ACCORDIAN_THIRD_SECTION).click();
        softAssert.assertTrue(driver.findElement(ACCORDIAN_THIRD_SECTION_CONTENT).isDisplayed(), "Third section content is not displayed");
        softAssert.assertAll();
        return this;
    }

    public WidgetsPage goToAutoCompletePage() {
        driver.findElement(AUTO_COMPLETE_BUTTON).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(AUTO_COMPLETE_TITLE));
        Assert.assertEquals(driver.findElement(AUTO_COMPLETE_TITLE).getText(), "Auto Complete");
        return this;
    }

    public WidgetsPage useAutoComplete(String value) throws InterruptedException {
        Actions actions = new Actions(driver);
        WebElement multiColorInput = driver.findElement(MULTI_COLOR_INPUT);
        multiColorInput.sendKeys(value);
        multiColorInput.sendKeys(Keys.ENTER);
        Assert.assertTrue(driver.findElement(INPUT_RESULT).getText().contains(value), "Value not found in the input result");
        WebElement singleColorInput = driver.findElement(SINGLE_COLOR_INPUT);
        singleColorInput.sendKeys(value);
        singleColorInput.sendKeys(Keys.ENTER);
        String actualValue = singleColorInput.getAttribute("value");
        Assert.assertTrue(driver.findElement(SINGLE_INPUT_RESULT).getText().contains(value), "Value not found in the input result");
        return this;
    }
}