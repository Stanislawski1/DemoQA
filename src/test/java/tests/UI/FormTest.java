package tests.UI;

import dto.FormData;
import dto.FormFactory;
import org.testng.annotations.Test;
import tests.BaseTest;

public class FormTest extends BaseTest {

    @Test
    public void testOfPracticeForm() {
        FormData form = FormFactory.getForm("Male", "NCR");
        formsSteps.goToFormPage();
        pageManager.getFormPage().isPageOpened()
                .fillOutForm(form);
    }
}