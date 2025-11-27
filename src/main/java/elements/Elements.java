package elements;

import org.openqa.selenium.By;

public class Elements {

    //Elements locators
    public static final By ELEMENTS_TITLE = By.xpath("//div[@class='header-wrapper']//div[contains(text(), 'Elements')]");
    public static final By TEXT_BOX_BUTTON = By.xpath("//span[contains(text(),'Text Box')]");
    public static final By SUBMIT_BUTTON = By.xpath("//button[@id='submit']");
    public static final By SUCCESS_MESSAGE = By.xpath("//div[@class='border col-md-12 col-sm-12']");
    public static final By SHOW_ALL_BUTTON = By.xpath("//button[@title='Toggle']");
    public static final By CHECKBOX_BUTTON = By.xpath("//span[contains(text(), 'Check Box')]");
    public static final By RADIO_BUTTON_SECTION = By.xpath("//span[contains(text(),'Radio Button')]");
    public static final By WEB_TABLES_BUTTON = By.xpath("//span[contains(text(), 'Web Tables')]");
    public static final By FORM_PAGE_BUTTON = By.xpath("//div[@class='header-wrapper']//div[contains(text(), 'Forms')]");
    public static final By FORM_TITLE = By.xpath("//h5[contains(text(), 'Student Registration Form')]");
    public static final By COMPLETE_FORM_MESSAGE = By.xpath("//div[contains(text(), 'Thanks for submitting the form')]");
    public static final By SUBMIT_FORM_BUTTON = By.xpath("//button[@type='submit']");
    public static final By SUCCESS_FORM_MESSAGE = By.xpath("//div[contains(text(), 'Thanks for submitting the form')]");
    public static final By BUTTONS = By.xpath("//span[contains(text(),'Buttons')]");
    public static final By LINKS = By.xpath("//span[contains(text(),'Links')]");
    public static final By PRACTICE_FORM = By.xpath("//span[contains(text(),'Practice Form')]");

    //Main Page locators
    public static final By TITLE = By.xpath("//div[@class='card-body']//h5[contains(text(), 'Elements')]");
    public static final By ELEMENTS_BUTTON = By.xpath("//div[@class='card-body']//h5[contains(text(), 'Elements')]");

    public static final By ALERTS_PAGE_BUTTON = By.xpath("//div[contains(text(), 'Alerts, Frame & Windows')]");
    public static final By WINDOWS_BUTTON = By.xpath("//span[contains(text(), 'Browser Windows')]");
    public static final By WINDOWS_TITLE = By.xpath("//h1[contains(text(), 'Browser Windows')]");
    public static final By NEW_TAB_BUTTON = By.xpath("//button[contains(text(), 'New Tab')]");
    public static final By NEW_TAB_TITTLE = By.xpath("//h1[@id='sampleHeading']");
    public static final By NEW_WINDOW_BUTTON = By.xpath("//button[@id='windowButton']");
    public static final By NEW_WINDOW_MESSAGE_BUTTON = By.xpath("//button[@id='messageWindowButton']");

    public static final By ALERTS_BUTTON = By.xpath("//span[contains(text(), 'Alerts')]");
    public static final By ALERTS_TITLE = By.xpath("//h1[contains(text(), 'Alerts')]");
    public static final By FIRST_ALERT_BUTTON = By.xpath("//button[@id='alertButton']");
    public static final By SECOND_ALERT_BUTTON = By.xpath("//button[@id='timerAlertButton']");
    public static final By THIRD_ALERT_BUTTON = By.xpath("//button[@id='confirmButton']");
    public static final By FOURTH_ALERT_BUTTON = By.xpath("//button[@id='promtButton']");
    public static final By CONFIRM_RESULT_TEXT = By.xpath("//span[@id='promptResult']");

    public static final By WIDGETS_BUTTON = By.xpath("//div[contains(text(), 'Widgets')]");
    public static final By ACCORDIAN_BUTTON = By.xpath("//span[contains(text(), 'Accordian')]");
    public static final By ACCORDIAN_TITLE = By.xpath("//h1[contains(text(), 'Accordian')]");

    public static final By ACCORDIAN_FIRST_SECTION = By.id("section1Heading");
    public static final By ACCORDIAN_FIRST_SECTION_CONTENT = By.id("section1Content");
    public static final By ACCORDIAN_SECOND_SECTION = By.id("section2Heading");
    public static final By ACCORDIAN_SECOND_SECTION_CONTENT = By.id("section2Content");
    public static final By ACCORDIAN_THIRD_SECTION = By.id("section3Heading");
    public static final By ACCORDIAN_THIRD_SECTION_CONTENT = By.id("section3Content");

    public static final By AUTO_COMPLETE_BUTTON = By.xpath("//span[contains(text(), 'Auto Complete')]");
    public static final By AUTO_COMPLETE_TITLE = By.xpath("//h1[contains(text(), 'Auto Complete')]");

    public static final By MULTI_COLOR_INPUT = By.id("autoCompleteMultipleInput");
    public static final By SINGLE_COLOR_INPUT = By.id("autoCompleteSingleInput");
    public static final By END_OF_PAGE = By.xpath("//div[contains(text(), 'Select State')]");

    //INTERACTION PAGE
    public static final By INTERACTIONS_PAGE_BUTTON = By.xpath("//div[@class='header-text'][contains(text(), 'Interactions')]");
    public static final By SORTABLE_PAGE_BUTTON = By.xpath("//span[contains(text(), 'Sortable')]");
    public static final By SOURCE_ITEM = By.xpath("//div[@class='vertical-list-container mt-4']//div[@class='list-group-item list-group-item-action' and text()='One']");
    public static final By TARGET_ITEM = By.xpath("//div[@class='vertical-list-container mt-4']//div[@class='list-group-item list-group-item-action' and text()='Six']");
    public static final By GRID_BUTTON = By.xpath("//a[@id='demo-tab-grid']");
    public static final By GRID_SOURCE_ITEM = By.xpath("//div[@class='create-grid']//div[@class='list-group-item list-group-item-action' and text()='One']");
    public static final By GRID_TARGET_ITEM = By.xpath("//div[@class='create-grid']//div[@class='list-group-item list-group-item-action' and text()='One']");
    public static final By SELECTABLE_BUTTON = By.xpath("//span[contains(text(), 'Selectable')]");
    public static final String SELECTABLE_ITEM = "//ul[@id='verticalListContainer']//li[contains(text(), '%s')]";
    public static final By RESIZABLE_BUTTON = By.xpath("//span[normalize-space()='Resizable']");
    public static final By RESIZABLE_BOX_HANDLE = By.xpath("//div[@id='resizableBoxWithRestriction']//span[@class='react-resizable-handle react-resizable-handle-se']");
    public static final By RESIZABLE_BOX = By.xpath("//div[@id='resizableBoxWithRestriction']");
    public static final By POST_RESIZABLE_BOX = By.xpath("//div[@class='constraint-area']");
    public static final By BOOK_STORE_BUTTON = By.xpath("//div[contains(text(), 'Book Store Application')]");

    //WIDGETS LOCATORS
    public static final By INPUT_RESULT = By.xpath("//div[@class='css-12jo7m5 auto-complete__multi-value__label']");
    public static final By SINGLE_INPUT_RESULT = By.xpath("//div[@class='auto-complete__single-value css-1uccc91-singleValue']");
}
