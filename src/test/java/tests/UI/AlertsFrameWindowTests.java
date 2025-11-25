package tests.UI;



import org.testng.annotations.Test;
import tests.BaseTest;


public class AlertsFrameWindowTests extends BaseTest {

    @Test
    public void testOfNewTab() {
        pageManager
                .getMainPage().open()
                .isPageOpened()
                .moveToElements();
        pageManager
                .getFormPage().goToAlertsPage();
        pageManager
                .getAlertsFrameWindowPage().goToWindowsPage()
                .isPageOpened()
                .goToWindowsPage()
                .useTab();
    }

    @Test
    public void testOfNewWindow() {
        pageManager
                .getMainPage().open()
                .isPageOpened()
                .moveToElements();
        pageManager
                .getFormPage().goToAlertsPage();
        pageManager
                .getAlertsFrameWindowPage().goToWindowsPage()
                .isPageOpened()
                .goToWindowsPage()
                .useWindow();
    }

    @Test
    public void testOfNewWindowMessage() {
        pageManager
                .getMainPage().open()
                .isPageOpened()
                .moveToElements();
        pageManager
                .getFormPage().goToAlertsPage();
        pageManager
                .getAlertsFrameWindowPage().goToWindowsPage()
                .isPageOpened()
                .goToWindowsPage()
                .useWindowMessage();
    }

    @Test
    public void testOfAlerts() {
        pageManager
                .getMainPage().open()
                .isPageOpened()
                .moveToElements();
        pageManager
                .getFormPage().goToAlertsPage();
        pageManager
                .getAlertsFrameWindowPage().goToAlertsPage()
                .isPageOpened()
                .goToAlert();
    }
}
