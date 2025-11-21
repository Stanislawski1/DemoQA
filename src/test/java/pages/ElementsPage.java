package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.base.BasePage;

public class ElementsPage extends BasePage {

    protected By ELEMENTS_TITLE = By.xpath("//div[@class='header-wrapper']//div[contains(text(), 'Elements')]");

    public ElementsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public ElementsPage isPageOpened() {
        waitForPageLoaded();
        wait.until(ExpectedConditions.visibilityOfElementLocated(ELEMENTS_TITLE));
        return this;
    }
}
