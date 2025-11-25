package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class Elements {

    //Elements locators
    public static final By ELEMENTS_TITLE = By.xpath("//div[@class='header-wrapper']//div[contains(text(), 'Elements')]");
    public static final By TEXT_BOX_BUTTON = By.xpath("//span[contains(text(),'Text Box')]");
    public static final By SUBMIT_BUTTON = By.xpath("//button[@id='submit']");
    public static final By SUCCESS_MESSAGE = By.xpath("//div[contains(text(), 'Thanks for submitting the form')]");
    public static final By SHOW_ALL_BUTTON = By.xpath("//button[@title='Toggle']");
    public static final By CHECKBOX_BUTTON = By.xpath("//span[contains(text(), 'Check Box')]");
    public static final By RADIO_BUTTON_SECTION = By.xpath("//span[contains(text(),'Radio Button')]");
    public static final By WEB_TABLES_BUTTON = By.xpath("//span[contains(text(), 'Web Tables')]");
    public static final By FORM_PAGE_BUTTON = By.xpath("//div[@class='header-wrapper']//div[contains(text(), 'Forms')]");
    public static final By FORM_TITLE = By.xpath("//h5[contains(text(), 'Student Registration Form')]");
    public static final By COMPLETE_FORM_MESSAGE = By.xpath("//div[contains(text(), 'Thanks for submitting the form')]");
    public static final By SUBMIT_FORM_BUTTON = By.xpath("//button[@type='submit']");
    public static final By SUCCESS_FORM_MESSAGE = By.xpath("//div[contains(text(), 'Thanks for submitting the form')]");

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
}
