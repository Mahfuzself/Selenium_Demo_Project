package reusableComponents;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;

import testBase.ObjectsRepo;
import testBase.TestBase;

public class ListenersImplementation extends ObjectsRepo implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		test = extent.createTest(result.getMethod().getMethodName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS,"Test Case : "+ result.getMethod().getMethodName()+ " is Passed");
	}

	@SuppressWarnings("deprecation")
	@Override
	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL,"Test Case : "+ result.getMethod().getMethodName()+ " is Failed");
		test.log(Status.FAIL , result.getThrowable());
		File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);  
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyy HH-mm-ss");
		Date date = new Date(0, 0, 0);
		String actualdate = format.format(date);
		String screenshotPath = System.getProperty("user.dir")+"/Reports/Screenshots/"+actualdate+".jpeg";
		File dest = new  File(screenshotPath);
		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			 test.addScreenCaptureFromPath(screenshotPath,"Test case failure screenshot");
		} catch (Exception e) { 
			// TODO: handle exception
			e.printStackTrace();
		}
       
			
	}
//	@Override
//	public void onTestSkipped(ITestResult result) {
//		
//	}
//
//	@Override
//	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
//		
//	}
//
//	@Override
//	public void onTestFailedWithTimeout(ITestResult result) {
//		
//	}

	@Override
	public void onStart(ITestContext context) { 
		//setup method call
		extent = ExtentSetup.setupExtentReport();
		
	}

	@Override
	public void onFinish(ITestContext context) {
		extent.flush();
	}

}
