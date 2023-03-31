package techproed.utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

public class Listeners implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Her bir test anotationdan önce bir kez çalışır " + result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Pass eden testten sonra bir kez çalışır " + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Fail eden testten sonra bir kez çalışır " + result.getName());
        try {
            ReusableMethods.getScreenshot("Test-Case-FAİL-"+ result.getName());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("Skip eden testten sonra bir kez çalışır " + result.getName());
    }

    @Override
    public void onStart(ITestContext context) {
        System.out.println("Tüm Testlerden önce bir kez çalışır " + context.getName());
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("Tüm Testlerden sonra bir kez çalışır " + context.getName());
    }

}
