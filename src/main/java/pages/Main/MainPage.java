package pages.Main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;

import static elements.Elements.ELEMENTS_BUTTON;
import static elements.Elements.TITLE;

public class MainPage extends BasePage {

    public MainPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public MainPage open() {
        driver.get(BASE_URL);
        return this;
    }

    public MainPage isPageOpened() {
        waitForPageLoaded();
        wait.until(ExpectedConditions.visibilityOfElementLocated(TITLE));
        return this;
    }

    public MainPage moveToElements() {
        org.openqa.selenium.WebElement el = driver.findElement(ELEMENTS_BUTTON);
        ((org.openqa.selenium.JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", el);
        el.click();
        return this;
    }
}
