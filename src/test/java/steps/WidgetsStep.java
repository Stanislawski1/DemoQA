package steps;

import manager.PageManager;
import org.openqa.selenium.WebDriver;

public class WidgetsStep {

    PageManager pageManager;
    protected WebDriver driver;

    public WidgetsStep(WebDriver driver) {
        this.driver = driver;
        this.pageManager = new PageManager(driver);
    }

    public void goToAccordianPage() {
        pageManager.getMainPage().open()
                .isPageOpened()
                .moveToElements();
        pageManager.getAlertsFrameWindowPage().goToWidgetsPage();
        pageManager.getWidgetsPage().goToAccordianPage()
                .isPageOpened()
                .useAccordian();
    }

    public void goToAutoComplete() {
        pageManager.getMainPage().open()
                .isPageOpened()
                .moveToElements();
        pageManager.getAlertsFrameWindowPage().goToWidgetsPage();
        pageManager.getWidgetsPage().goToAutoCompletePage()
                .isPageOpened()
                .useAutoComplete("Red");
    }
}
