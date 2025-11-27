package manager;

import org.openqa.selenium.WebDriver;
import pages.Alerts.AlertsFrameWindowPage;
import pages.BookStore.BookStorePage;
import pages.Elements.ElementsPage;
import pages.Form.FormPage;
import pages.Interactions.InteractionsPage;
import pages.Main.MainPage;
import pages.Widgets.WidgetsPage;

public class PageManager {

    private final WebDriver driver;

    private MainPage mainPage;
    private FormPage formPage;
    private ElementsPage elementsPage;
    private AlertsFrameWindowPage alertsFrameWindowPage;
    private WidgetsPage widgetsPage;
    private InteractionsPage interactionsPage;
    private BookStorePage bookStorePage;

    public PageManager(WebDriver driver) {
        this.driver = driver;
    }

    public  MainPage getMainPage() {
        if (mainPage == null) {
            mainPage = new MainPage(driver);
        }
        return mainPage;
    }

    public  FormPage getFormPage() {
        if (formPage == null) {
            formPage = new FormPage(driver);
        }
        return formPage;
    }

    public  ElementsPage getElementsPage() {
        if (elementsPage == null) {
            elementsPage = new ElementsPage(driver);
        }
        return elementsPage;
    }

    public  AlertsFrameWindowPage getAlertsFrameWindowPage() {
        if (alertsFrameWindowPage == null) {
            alertsFrameWindowPage = new AlertsFrameWindowPage(driver);
        }
        return alertsFrameWindowPage;
    }

    public  WidgetsPage getWidgetsPage() {
        if (widgetsPage == null) {
            widgetsPage = new WidgetsPage(driver);
        }
        return widgetsPage;
    }

    public  InteractionsPage getInteractionsPage() {
        if (interactionsPage == null) {
            interactionsPage = new InteractionsPage(driver);
        }
        return interactionsPage;
    }

    public  BookStorePage getBookStorePage() {
        if (bookStorePage == null) {
            bookStorePage = new BookStorePage(driver);
        }
        return bookStorePage;
    }
}