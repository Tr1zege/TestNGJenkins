package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import pages.EligibilityPage;

public class MyListener extends EligibilityPage implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Test get started");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("The test is finished successfully");
    }

    @Override
    public void onTestFailure(ITestResult result) {
    }

    @Override
    public void onTestSkipped(ITestResult result) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {

    }

    @Override
    public void onStart(ITestContext context) {
        System.out.println("Test execution has started");
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("All the test are finished");
    }
}
