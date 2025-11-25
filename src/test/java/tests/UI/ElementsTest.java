package tests.UI;

import dto.NavigationData;
import org.testng.annotations.Test;
import tests.BaseTest;

public class ElementsTest extends BaseTest {

    @Test
    public void testOfTextBox() {
        pageManager.getMainPage().open()
                .isPageOpened()
                .moveToElements();
        pageManager.getElementsPage().isPageOpened()
                .useTextBox();
    }

    @Test
    public void testOfCheckBox() throws InterruptedException {
        pageManager.getMainPage().open()
                .isPageOpened()
                .moveToElements();
        pageManager.getElementsPage().isPageOpened()
                .useCheckBox();
    }

    @Test
    public void testOfRadioButton() {
        pageManager.getMainPage().open()
                .isPageOpened()
                .moveToElements();
        pageManager.getElementsPage().isPageOpened()
                .useRadioButton();
    }

    @Test
    public void testOfWebTables() {
        pageManager.getMainPage().open()
                .isPageOpened()
                .moveToElements();
        pageManager.getElementsPage().isPageOpened()
                .useWebTables();
    }

    @Test
    public void testOfButtons() {
        pageManager.getMainPage().open()
                .isPageOpened()
                .moveToElements();
        pageManager.getElementsPage().isPageOpened()
                .useButtons();
    }

    @Test(dataProvider = "navigationData", dataProviderClass = NavigationData.class)
    public void testOfLinks(String linkText, String expectedUrlPart) {
        pageManager.getMainPage().open()
                .isPageOpened()
                .moveToElements();
        pageManager.getElementsPage().isPageOpened()
                .useLinks(linkText, expectedUrlPart);

    }

    @Test(dataProvider = "responseAnswers", dataProviderClass = NavigationData.class)
    public void testOfResponse(String linkText, String expectedStatus) {
        pageManager.getMainPage().open()
                .isPageOpened()
                .moveToElements();
        pageManager.getElementsPage().isPageOpened()
                .useResponse(linkText, expectedStatus);

    }
}
