package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.base.BasePage;

public class MainPage extends BasePage {

    protected By TITLE = By.xpath("//div[@class='card-body']//h5[contains(text(), 'Elements')]");
    protected By ELEMENTS_BUTTON = By.xpath("//div[@class='card-body']//h5[contains(text(), 'Elements')]");

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
