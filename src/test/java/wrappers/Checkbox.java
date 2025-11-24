package wrappers;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Checkbox {
    WebDriver driver;
    String label;
    WebDriverWait wait;

    public Checkbox(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public void select() {
        WebElement labelElement = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath(String.format("//span[contains(text(),'%s')]", label))
        ));
        scrollToElement(labelElement);
        labelElement.click();
    }

    private void scrollToElement(WebElement element) {
        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView({block: 'center', behavior: 'smooth'});", element
        );
        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView({block: 'end', behavior: 'smooth'});", element
        );
    }

}