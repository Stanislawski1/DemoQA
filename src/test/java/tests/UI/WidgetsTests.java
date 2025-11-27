package tests.UI;

import org.testng.annotations.Test;
import steps.WidgetsStep;
import tests.BaseTest;

public class WidgetsTests extends BaseTest {

    @Test
    public void testOfAccordians() {
        widgetsStep.goToAccordianPage();
    }

    @Test
    public void testOfAutoComplete() {
        widgetsStep.goToAutoComplete();
    }
}
