package imt.demo.OrangeHRM.GenricLibrary;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListnersClass extends BaseClass implements ITestListener {
	ExtentReports report;
	ExtentTest test;
	JavaUtility jutil = new JavaUtility();	
	
	@Override
	public void onTestStart(ITestResult result) {
		String methodnname = result.getName();
		test = report.createTest(methodnname);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String methodname = result.getName();
		test.log(Status.PASS, methodname + "passes");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String name = result.getName();
		String dateAndTime = jutil.dateAndTime();
		SeleniumUtility sutil = new SeleniumUtility();
		try {
			sutil.takeScreenshot(driver, name+dateAndTime);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		String dateAndTime = jutil.dateAndTime();
		ExtentSparkReporter esr = new ExtentSparkReporter("./ExtentReport/report"+dateAndTime+".html");
		esr.config().setReportName("report.html");
		esr.config().setDocumentTitle("orangeHrm");
		esr.config().setTheme(Theme.DARK);
		report = new ExtentReports();
		report.attachReporter(esr);
		report.setSystemInfo("OS", "Windows");
		report.setSystemInfo("Browser", "Chrome");
		report.setSystemInfo("url", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@Override
	public void onFinish(ITestContext context) {
		report.flush();
	}

}
