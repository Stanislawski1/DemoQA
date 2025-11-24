package tests;

import com.fasterxml.jackson.databind.ser.Serializers;
import org.testng.annotations.Test;
import tests.base.BaseTest;

public class FormTest extends BaseTest {

    @Test
    public void testOfPracticeForm() {
        mainPage.open()
                .isPageOpened()
                        .moveToElements();
        elementsPage.goToFormPage();
        formPage.isPageOpened()
                .fillOutForm();
    }

}
