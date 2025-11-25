package wrappers;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TextArea {

    WebDriver driver;
    String label;

    public TextArea(WebDriver driver ,String label) {
        this.driver = driver;
        this.label = label;
    }

    public void write(String text) {
        scrollToElement(driver.findElement(By.xpath(String.format("//label[text()='%s']//following::textarea", label))));
        driver.findElement(By.xpath(String.format("//label[text()='%s']//following::textarea", label)))
                .sendKeys(text);
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
