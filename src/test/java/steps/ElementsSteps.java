package steps;

import manager.PageManager;
import org.openqa.selenium.WebDriver;
import pages.Elements.ElementsPage;
import pages.Main.MainPage;

public class ElementsSteps {

    PageManager pageManager;
    protected WebDriver driver;

    public ElementsSteps(WebDriver driver) {
        this.driver = driver;
        this.pageManager = new PageManager(driver);
    }

    public void goToElements() {
        pageManager.getMainPage().open()
                .isPageOpened()
                .moveToElements();
    }
}
