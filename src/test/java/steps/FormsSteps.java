package steps;

import manager.PageManager;
import org.openqa.selenium.WebDriver;

public class FormsSteps {

    PageManager pageManager;
    protected WebDriver driver;

    public FormsSteps(WebDriver driver) {
        this.driver = driver;
        this.pageManager = new PageManager(driver);
    }

    public void goToFormPage() {
        pageManager.getMainPage().open()
                .isPageOpened()
                .moveToElements();
        pageManager.getElementsPage().goToFormPage();
    }
}
