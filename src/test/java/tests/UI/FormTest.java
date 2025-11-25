package tests.UI;

import org.testng.annotations.Test;
import tests.BaseTest;

public class FormTest extends BaseTest {

    @Test
    public void testOfPracticeForm() {
        pageManager.getMainPage().open()
                .isPageOpened()
                        .moveToElements();
        pageManager.getElementsPage().goToFormPage();
        pageManager.getFormPage().isPageOpened()
                .fillOutForm();
    }

}
