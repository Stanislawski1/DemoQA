package pages.Widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pages.BasePage;

import java.util.List;

import static elements.Elements.*;

public class WidgetsPage extends BasePage {

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

    public WidgetsPage useAutoComplete() {
        driver.findElement(MULTI_COLOR_INPUT).sendKeys("Red");
        List<WebElement> suggestions = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
                By.xpath("//div[@id='react-select-2-listbox']//div[contains(@class, 'css-11unzgr')]")
        ));
        for (WebElement suggestion : suggestions) {
            if (suggestion.getText().equals("Red")) {
                suggestion.click();
                break;
            }
        }
        driver.findElement(MULTI_COLOR_INPUT).sendKeys("Bl");
        suggestions = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
                By.xpath("//div[@id='react-select-2-listbox']//div[contains(@class, 'css-11unzgr')]")
        ));
        for (WebElement suggestion : suggestions) {
            if (suggestion.getText().equals("Blue")) {
                suggestion.click();
                break;
            }
        }
        String multiColors = driver.findElement(MULTI_COLOR_INPUT).getAttribute("value");
        Assert.assertTrue(multiColors.contains("Red"), "Red color is not selected in multi-select");
        Assert.assertTrue(multiColors.contains("Blue"), "Blue color is not selected in multi-select");
        return this;
    }
}