package manager;

import org.openqa.selenium.WebDriver;
import pages.Alerts.AlertsFrameWindowPage;
import pages.Elements.ElementsPage;
import pages.Form.FormPage;
import pages.Main.MainPage;
import pages.Widgets.WidgetsPage;

public class PageManager {

    private final WebDriver driver;

    private MainPage mainPage;
    private FormPage formPage;
    private ElementsPage elementsPage;
    private AlertsFrameWindowPage alertsFrameWindowPage;
    private WidgetsPage widgetsPage;

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
}