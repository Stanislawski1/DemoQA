package tests;

import org.testng.annotations.Test;
import tests.base.BaseTest;

public class AlertsFrameWindowTests extends BaseTest {

    @Test
    public void testOfNewTab() {
        mainPage.open()
                .isPageOpened()
                .moveToElements();
        formPage.goToAlertsPage();
        alertsFrameWindowPage.goToWindowsPage()
                .isPageOpened()
                .goToWindowsPage()
                .useTab();
    }

    @Test
    public void testOfNewWindow() {
        mainPage.open()
                .isPageOpened()
                .moveToElements();
        formPage.goToAlertsPage();
        alertsFrameWindowPage.goToWindowsPage()
                .isPageOpened()
                .goToWindowsPage()
                .useWindow();
    }

    @Test
    public void testOfNewWindowMessage() {
        mainPage.open()
                .isPageOpened()
                .moveToElements();
        formPage.goToAlertsPage();
        alertsFrameWindowPage.goToWindowsPage()
                .isPageOpened()
                .goToWindowsPage()
                .useWindowMessage();
    }

    @Test
    public void testOfAlerts() {
        mainPage.open()
                .isPageOpened()
                .moveToElements();
        formPage.goToAlertsPage();
        alertsFrameWindowPage.goToAlertsPage()
                .isPageOpened()
                .goToAlert();
    }
}
