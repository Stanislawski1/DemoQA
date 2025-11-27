package tests.UI;

import org.testng.annotations.Test;
import tests.BaseTest;

public class InteractionsTests extends BaseTest {

    @Test
    public void verifySortablePageNavigation() {
        pageManager.getMainPage().open()
                .isPageOpened()
                        .moveToInteractions();
        pageManager.getInteractionsPage()
                .goToSortablePage()
                .useSortable();

    }

    @Test
    public void verifyGridSortable() {
        pageManager.getMainPage().open()
                .isPageOpened()
                .moveToInteractions();
        pageManager.getInteractionsPage()
                .goToSortablePage()
                .useGridSortable();
    }

    @Test
    public void testOfSelectable() {
        pageManager.getMainPage().open()
                .isPageOpened()
                .moveToInteractions();
        pageManager.getInteractionsPage()
                .goToSelectable()
                .useSelectableItem("Cras justo odio");
    }

    @Test
    public void testOfGridSelectable() {
        pageManager.getMainPage().open()
                .isPageOpened()
                .moveToInteractions();
        pageManager.getInteractionsPage()
                .goToSelectable()
                .useGridSelectableItem("One");
    }

    @Test
    public void testOfResizable() throws InterruptedException {
            pageManager.getMainPage().open()
                    .isPageOpened()
                    .moveToInteractions();
            pageManager.getInteractionsPage()
                    .goToResizable()
                    .useResizable();
    }


}
