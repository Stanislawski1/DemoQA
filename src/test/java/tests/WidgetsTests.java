package tests;

import org.testng.annotations.Test;
import tests.base.BaseTest;

public class WidgetsTests extends BaseTest {

    @Test
    public void testOfAccordians() {
        mainPage.open()
                .isPageOpened()
                        .moveToElements();
        alertsFrameWindowPage.goToWidgetsPage();
        widgetsPage.goToAccordianPage()
                .isPageOpened()
                .useAccordian();
    }

    @Test
    public void testOfAutoComplete() {
        mainPage.open()
                .isPageOpened()
                        .moveToElements();
        alertsFrameWindowPage.goToWidgetsPage();
        widgetsPage.goToAutoCompletePage()
                .isPageOpened()
                .useAutoComplete();
    }
}
