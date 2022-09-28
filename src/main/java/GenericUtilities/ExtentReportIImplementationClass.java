package GenericUtilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportIImplementationClass implements ITestListener
{
	ExtentReports report;
	ExtentTest test;
	
	public void onTestStart(ITestResult result)
	{
		String MethodName = result.getMethod().getMethodName();
		test=report.createTest(MethodName);
		Reporter.log("--TestScript execution started--");
	}
	public void onTestSucess(ITestResult result)
	{
		String MethodName = result.getMethod().getMethodName();
		test.log(Status.PASS, MethodName+"----Passed");
		Reporter.log(MethodName+"--TestScript Execution Successful--");
	}
	public void onTestFailure(ITestResult result)
	{
		String MethodName = result.getMethod().getMethodName();
		 String path = null;
		String TestScriptName = MethodName+ new JavaUtility().randomNumber();
		EventFiringWebDriver eDriver= new EventFiringWebDriver(BaseClass.sDriver);
		File src = eDriver.getScreenshotAs(OutputType.FILE);
		path=".\\screenshot\\"+TestScriptName+".png";
		File dst = new File("path");
			try {
				FileUtils.copyFile(src, dst);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
			test.log(Status.FAIL,MethodName+"----Failed");
			
			//it will capture the exception and log it in the report
			test.log(Status.FAIL,result.getThrowable());
			test.addScreenCaptureFromPath(path);
	}
	public void onTestSkipped(ITestResult result)
	{
		String MethodName = result.getMethod().getMethodName();
		test.log(Status.FAIL,MethodName+"-- Skipped--");
		
		//it will capture the exception and log it in the group
		test.log(Status.SKIP,result.getThrowable());
		Reporter.log("testscript execution skipped");
	}
	public void onStart(ITestContext context)
	{
		/* Execution will start here
		   configure the report*/
		ExtentSparkReporter htmlReport=new ExtentSparkReporter(".\\ExtentReports\\Report.html");
		htmlReport.config().setDocumentTitle("SDET-41 Execution Report");
		htmlReport.config().setTheme(Theme.DARK);
		htmlReport.config().setReportName("Selenium Execution Report");
		
		report=new ExtentReports();
		report.attachReporter(htmlReport);
		report.setSystemInfo("Base-Browser","firefox");
		report.setSystemInfo("OS","Windows");
		report.setSystemInfo("base-url","http://192.168.0.231:8081");
		report.setSystemInfo("Reporter Name","Rajath.Y");
	}
	public void onFinish(ITestContext context)
	{
		//consolidate all the parameter
		report.flush();
	}


}
