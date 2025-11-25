package tests.UI;

import org.testng.annotations.Test;
import tests.BaseTest;

public class WidgetsTests extends BaseTest {

    @Test
    public void testOfAccordians() {
        pageManager.getMainPage().open()
                .isPageOpened()
                        .moveToElements();
        pageManager.getAlertsFrameWindowPage().goToWidgetsPage();
        pageManager.getWidgetsPage().goToAccordianPage()
                .isPageOpened()
                .useAccordian();
    }

    @Test
    public void testOfAutoComplete() throws InterruptedException {
        pageManager.getMainPage().open()
                .isPageOpened()
                        .moveToElements();
        pageManager.getAlertsFrameWindowPage().goToWidgetsPage();
        pageManager.getWidgetsPage().goToAutoCompletePage()
                .isPageOpened()
                .useAutoComplete("Red");
    }
}
