package pages.Interactions;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pages.BasePage;
import pages.BookStore.BookStorePage;

import static elements.Elements.*;


public class InteractionsPage extends BasePage {

    public InteractionsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public InteractionsPage isPageOpened() {
        waitForPageLoaded();
        return this;
    }

    public InteractionsPage goToSortablePage() {
        driver.findElement(SORTABLE_PAGE_BUTTON).click();
        return this;
    }

    public InteractionsPage useSortable() {
        WebElement source = driver.findElement(SOURCE_ITEM);
        WebElement target = driver.findElement(TARGET_ITEM);
        Actions actions = new Actions(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", source);
        actions.dragAndDrop(source, target).perform();
        String targetText = target.getText();
        Assert.assertEquals(targetText, "One", "Item was not moved correctly");
        return this;
    }

    public InteractionsPage useGridSortable() {
        driver.findElement(GRID_BUTTON).click();
        WebElement source = driver.findElement(GRID_SOURCE_ITEM);
        WebElement target = driver.findElement(GRID_TARGET_ITEM);
        Actions actions = new Actions(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", source);
        actions.dragAndDrop(source, target).perform();
        String targetText = target.getText();
        Assert.assertEquals(targetText, "One", "Item was not moved correctly in grid");
        return this;
    }

    public InteractionsPage goToSelectable() {
        driver.findElement(SELECTABLE_BUTTON).click();
        return this;
    }

    public InteractionsPage useSelectableItem(String text) {
        WebElement selectItem = driver.findElement(By.xpath(String.format("//ul[@id='verticalListContainer']//li[contains(text(), '%s')]", text)));
        selectItem.click();
        selectItem.isSelected();
        return this;
    }

    public InteractionsPage useGridSelectableItem(String item) {
        driver.findElement(GRID_BUTTON).click();
        WebElement selectItem = driver.findElement(By.xpath(String.format("//div[@class='list-group list-group-horizontal-sm']//li[contains(text(), '%s')]", item)));
        selectItem.click();
        selectItem.isSelected();
        return this;
    }

    public InteractionsPage goToResizable() {
        driver.findElement(RESIZABLE_BUTTON).click();
        return this;
    }

    public InteractionsPage useResizable() throws InterruptedException {
        Actions actions = new Actions(driver);
        WebElement resizable = driver.findElement(RESIZABLE_BOX);
        WebElement handle = driver.findElement(RESIZABLE_BOX_HANDLE);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", handle);
        actions.clickAndHold(handle)
                .moveByOffset(500, 300)
                .release()
                .perform();
        String width = resizable.getCssValue("width");
        String height = resizable.getCssValue("height");
        Assert.assertTrue(width.contains("500px"));
        Assert.assertTrue(height.contains("300px"));
        return this;
    }

    public BookStorePage goToBookStorePage() {
        org.openqa.selenium.WebElement el = driver.findElement(BOOK_STORE_BUTTON);
        ((org.openqa.selenium.JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", el);
        el.click();
        driver.findElement(By.xpath("//span[contains(text(), 'Login')]")).click();
        return new BookStorePage(driver);
    }
}
