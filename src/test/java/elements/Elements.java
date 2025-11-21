package elements;

import org.openqa.selenium.By;

public class Elements {

    //Elements locators
    public static final By ELEMENTS_TITLE = By.xpath("//div[@class='header-wrapper']//div[contains(text(), 'Elements')]");
    public static final By TEXT_BOX_BUTTON = By.xpath("//span[contains(text(),'Text Box')]");
    public static final By SUBMIT_BUTTON = By.xpath("//button[@id='submit']");
    public static final By SUCCESS_MESSAGE = By.xpath("//p[@id='email']");
    public static final By SHOW_ALL_BUTTON = By.xpath("//button[@title='Toggle']");
    public static final By CHECKBOX_BUTTON = By.xpath("//span[contains(text(), 'Check Box')]");
    public static final By RADIO_BUTTON_SECTION = By.xpath("//span[contains(text(),'Radio Button')]");
    public static final By WEB_TABLES_BUTTON = By.xpath("//span[contains(text(), 'Web Tables')]");

    //Main Page locators
    public static final By TITLE = By.xpath("//div[@class='card-body']//h5[contains(text(), 'Elements')]");
    public static final By ELEMENTS_BUTTON = By.xpath("//div[@class='card-body']//h5[contains(text(), 'Elements')]");
}
