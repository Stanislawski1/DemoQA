package plugins;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

public class TestListener implements ITestListener {

    private static final Logger log = LoggerFactory.getLogger(TestListener.class);

    @Override
    public void onTestStart(ITestResult iTestResult) {
        log.info("======================================== STARTING TEST {} ========================================", iTestResult.getName());
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        log.info("======================================== FINISHED TEST {} Duration: {}s ========================================",
                iTestResult.getName(), getExecutionTime(iTestResult));
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        log.error("======================================== FAILED TEST {} Duration: {}s ========================================",
                iTestResult.getName(), getExecutionTime(iTestResult));
        WebDriver driver = (WebDriver) iTestResult.getTestContext().getAttribute("driver");
        AllureUtils.takeScreenshot(driver);
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        log.warn("======================================== SKIPPING TEST {} ========================================", iTestResult.getName());
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
        // можно добавить лог при необходимости
    }

    @Override
    public void onStart(ITestContext iTestContext) {
        log.info("======================================== TEST SUITE START ========================================");
    }

    @Override
    public void onFinish(ITestContext iTestContext) {
        log.info("======================================== TEST SUITE FINISH ========================================");
    }

    private long getExecutionTime(ITestResult iTestResult) {
        return TimeUnit.MILLISECONDS.toSeconds(iTestResult.getEndMillis() - iTestResult.getStartMillis());
    }
}
