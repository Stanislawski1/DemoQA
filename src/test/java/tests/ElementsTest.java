package tests;

import org.testng.annotations.Test;
import tests.base.BaseTest;

public class ElementsTest extends BaseTest {

    @Test
    public void testOfOpen() {
    mainPage.open()
            .isPageOpened()
            .moveToElements();
    elementsPage.isPageOpened();
    }
}
