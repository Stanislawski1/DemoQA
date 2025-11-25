package wrappers;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Buttons {
    WebDriver driver;
    String label;
    WebDriverWait wait;

    public Buttons(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public void click() {
        WebElement labelElement = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath(String.format("//button[normalize-space(text())='%s']", label))
        ));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", labelElement);
    }
    public void doubleClick() {
        WebElement labelElement = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath(String.format("//button[normalize-space(text())='%s']", label))
        ));
        Actions actions = new Actions(driver);
        actions.doubleClick(labelElement).perform();
    }
    public void rightClick() {
        Actions actions = new Actions(driver);
        WebElement labelElement = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath(String.format("//button[normalize-space(text())='%s']", label))
        ));
        actions.contextClick(labelElement).perform();
    }
}