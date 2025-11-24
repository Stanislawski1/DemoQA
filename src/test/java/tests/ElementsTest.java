package tests;

import dto.NavigationData;
import org.testng.annotations.Test;
import tests.base.BaseTest;

public class ElementsTest extends BaseTest {

    @Test
    public void testOfTextBox() {
        mainPage.open()
                .isPageOpened()
                .moveToElements();
        elementsPage.isPageOpened()
                .useTextBox();
    }

    @Test
    public void testOfCheckBox() throws InterruptedException {
        mainPage.open()
                .isPageOpened()
                .moveToElements();
        elementsPage.isPageOpened()
                .useCheckBox();
    }

    @Test
    public void testOfRadioButton() {
        mainPage.open()
                .isPageOpened()
                .moveToElements();
        elementsPage.isPageOpened()
                .useRadioButton();
    }

    @Test
    public void testOfWebTables() {
        mainPage.open()
                .isPageOpened()
                .moveToElements();
        elementsPage.isPageOpened()
                .useWebTables();
    }

    @Test
    public void testOfButtons() {
        mainPage.open()
                .isPageOpened()
                .moveToElements();
        elementsPage.isPageOpened()
                .useButtons();
    }

    @Test(dataProvider = "navigationData", dataProviderClass = NavigationData.class)
    public void testOfLinks(String linkText, String expectedUrlPart) {
        mainPage.open()
                .isPageOpened()
                .moveToElements();
        elementsPage.isPageOpened()
                .useLinks(linkText, expectedUrlPart);

    }

    @Test(dataProvider = "responseAnswers", dataProviderClass = NavigationData.class)
    public void testOfResponse(String linkText, String expectedStatus) {
        mainPage.open()
                .isPageOpened()
                .moveToElements();
        elementsPage.isPageOpened()
                .useResponse(linkText, expectedStatus);

    }
}
