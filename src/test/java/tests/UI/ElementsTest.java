package tests.UI;

import dto.FormData;
import dto.FormFactory;
import dto.NavigationData;
import org.testng.annotations.Test;
import tests.BaseTest;

public class ElementsTest extends BaseTest {

    @Test
    public void testOfTextBox() {
        FormData form = FormFactory.getTextBox();
        elementsSteps.goToElements();
        pageManager.getElementsPage().isPageOpened()
                .useTextBox(form);
    }

    @Test
    public void testOfCheckBox() {
        elementsSteps.goToElements();
        pageManager.getElementsPage().isPageOpened()
                .useCheckBox();
    }

    @Test
    public void testOfRadioButton() {
        elementsSteps.goToElements();
        pageManager.getElementsPage().isPageOpened()
                .useRadioButton();
    }

    @Test
    public void testOfWebTables() {
        FormData form = FormFactory.getWebPages();
        elementsSteps.goToElements();
        pageManager.getElementsPage().isPageOpened()
                .useWebTables(form);
    }

    @Test
    public void testOfButtons() {
        elementsSteps.goToElements();
        pageManager.getElementsPage().isPageOpened()
                .useButtons();
    }

    @Test(dataProvider = "navigationData", dataProviderClass = NavigationData.class)
    public void testOfLinks(String linkText, String expectedUrlPart) {
        elementsSteps.goToElements();
        pageManager.getElementsPage().isPageOpened()
                .useLinks(linkText, expectedUrlPart);

    }

    @Test(dataProvider = "responseAnswers", dataProviderClass = NavigationData.class)
    public void testOfResponse(String linkText, String expectedStatus) {
        elementsSteps.goToElements();
        pageManager.getElementsPage().isPageOpened()
                .useResponse(linkText, expectedStatus);

    }
}
