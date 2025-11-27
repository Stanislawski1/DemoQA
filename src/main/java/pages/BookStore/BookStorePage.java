package pages.BookStore;

import org.aspectj.apache.bcel.ExceptionConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;
import wrappers.Input;

public class BookStorePage extends BasePage {

    public static final By NEW_USER_BUTTON = By.xpath("//button[contains(text(), 'New User')]");
    public static final By CAPTCHA = By.xpath("//div[@class='recaptcha-checkbox-border']");
    public static final By REGISTER_BUTTON = By.id("register");

    public BookStorePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public BookStorePage isPageOpened() {
        waitForPageLoaded();
        return this;
    }

    public BookStorePage useRegistration() throws InterruptedException {
        Actions actions = new Actions(driver);
        driver.findElement(NEW_USER_BUTTON).click();
        new Input (driver, "First Name").write("John");
        new Input(driver, "Last Name").write("Doe");
        new Input (driver, "UserName").write("JohnDoe69");
        new Input(driver, "Password").write("test1111@");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript(
                "document.getElementById('g-recaptcha-response').value='TEST_TOKEN_OK';"
        );
        org.openqa.selenium.WebElement el = driver.findElement(REGISTER_BUTTON);
        ((org.openqa.selenium.JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", el);
        el.click();
        Thread.sleep(2000);
        driver.switchTo().alert().getText().contains("User Register Successfully.");
        driver.switchTo().alert().accept();
        return this;
    }
}
