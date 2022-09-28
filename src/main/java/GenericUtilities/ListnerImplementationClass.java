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

import GenericUtilities.BaseClass;
import GenericUtilities.JavaUtility;

public class ListnerImplementationClass implements ITestListener {
	
	public void onTestStart(ITestResult result)
	{
		String MethodName = result.getMethod().getMethodName();
		Reporter.log(MethodName+"--TestScript execution started--");
	}
	public void onTestSucess(ITestResult result)
	{
		String MethodName = result.getMethod().getMethodName();
		Reporter.log(MethodName+"--TestScript Execution Successful--");
	}
	public void onTestFailure(ITestResult result)
	{
		String FailedScript = result.getMethod().getMethodName();
		String Fscript = FailedScript+ new JavaUtility().randomNumber();
		EventFiringWebDriver eDriver= new EventFiringWebDriver(BaseClass.sDriver);
		File src = eDriver.getScreenshotAs(OutputType.FILE);
		File dst = new File(".\\screenshot\\"+FailedScript+".png");
			try {
				FileUtils.copyFile(src, dst);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
	}
	public void onTestSkipped(ITestResult result)
	{
		String MethodName = result.getMethod().getMethodName();
		Reporter.log(MethodName+"--TestScript Execution Skipped--");
	}
	public void onStart(ITestContext context)
	{
		
	}

}
