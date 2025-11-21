package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.base.BasePage;

public class MainPage extends BasePage {

    protected By TITLE = By.xpath("//div[@class='card-body']//h5[contains(text(), 'Elements')]");

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
        driver.findElement(TITLE);
        return this;
    }
}
