package Patient_module_System;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.HMS.ObjectRepository.HMSHomePage;
import com.HMS.ObjectRepository.PatientHomePage;
import com.HMS.ObjectRepository.PatientLoginPage;
import com.HMS.ObjectRepository.UserPatientBookAppointment;

import GenericUtilities.BaseClass;
import GenericUtilities.ExcelUtility;
import GenericUtilities.JavaUtility;
import GenericUtilities.PropertyFileUtility;
import GenericUtilities.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Patient_to_book_appointment  extends BaseClass  
{
	@Test(groups = {"regression"})
	public void patientBookAppointment()throws Throwable 
	{
		// Create object for sourcefile
		//FileInputStream fis=new FileInputStream("src\\test\\resources\\CommonDataForPatientandtAdmin.properties");

		//PropertyFileUtility pLib=new PropertyFileUtility();
		//ExcelUtility eLib=new ExcelUtility();
		//JavaUtility jLib=new JavaUtility();
		//WebDriverUtility wLib=new WebDriverUtility();

		//create object for propertyfile
		//Properties pObj=new Properties();

		//load the properties
		//pObj.load(fis);

		//get the data from commondata file
		//String BROWSER= pObj.getProperty("browser");
		//String URL = pObj.getProperty("url");
		//String USERNAME = pObj.getProperty("username");
		//String PASSWORD = pObj.getProperty("password");

		String BROWSER= pLib.readDataFromPropertyFile("browser");
		String URL1 = pLib.readDataFromPropertyFile("url1");
		String USERNAME1 = pLib.readDataFromPropertyFile("username1");
		String PASSWORD1 = pLib.readDataFromPropertyFile("password1");

		//WebDriverManager.firefoxdriver().setup();
		//WebDriver driver=new FirefoxDriver();
		//driver.get("http://192.168.0.231/domain/Hospital_Management_System/");
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//WebDriver driver=null;
		//if(BROWSER.contains("firefox"))
		//{
		//	WebDriverManager.firefoxdriver().setup();
		//	driver=new FirefoxDriver();
		//}
		//else if(BROWSER.contains("chrome"))
		//{
		//	WebDriverManager.chromedriver().setup();
		//	driver=new ChromeDriver();
		//}
		//else
		//{
		//	System.out.println("invalid browser");
		//}
		driver.get(URL1);
		//wLib.maximizeWindow(driver);
		//wLib.waitForPageLoad(driver);


		HMSHomePage H=new HMSHomePage(driver);
		H.PatientLogin();


		PatientLoginPage PLP=new PatientLoginPage(driver);
		PLP.PatientLogin(USERNAME1, PASSWORD1);




		//driver.findElement(By.xpath("//a[.='Click Here']")).click();
		//driver.findElement(By.xpath("//input[@name='username']")).sendKeys(USERNAME1);
		//driver.findElement(By.xpath("//input[@name='password']")).sendKeys(PASSWORD1);
		//driver.findElement(By.xpath("//button[@name='submit']")).click();




		PatientHomePage PHP=new PatientHomePage(driver);
		PHP.getBookAppointmentButton().click();



		//driver.findElement(By.xpath("//span[.=' Book Appointment ']")).click();

		UserPatientBookAppointment Upba=new UserPatientBookAppointment(driver);
		Upba.ToBookAppointment(driver,"Dentist","adaaa");


		//WebElement ele = driver.findElement(By.xpath("//Select[@name='Doctorspecialization']"));
		//ele.click();
		//wLib.selectByVisibleText(ele, "Dentist");
		//Select s=new Select(ele);
		//s.selectByVisibleText("Dentist");


		//WebElement ele1 = driver.findElement(By.xpath("//Select[@name='doctor']"));
		//ele1.click();
		//Select s1=new Select(ele1);
		//s1.selectByVisibleText("adaaa");
		//wLib.selectByVisibleText(ele1, "adaaa");

		//driver.findElement(By.xpath("//input[@name='appdate']")).click();
		//driver.findElement(By.xpath("//td[.='19']")).click();

		//driver.findElement(By.xpath("//input[@name='apptime']")).click();
		//driver.findElement(By.xpath("//a[@data-action='incrementHour']")).click();
		//driver.findElement(By.xpath("//a[@data-action='decrementMinute']")).click();
		//driver.findElement(By.xpath("//a[@data-action='toggleMeridian']")).click();
		//driver.findElement(By.xpath("//button[@name='submit']")).click();

		//Alert a = driver.switchTo().alert();  //to click on OK pop-up
		//a.accept();

		//driver.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();
		//driver.findElement(By.xpath("//a[@href='logout.php']")).click();

		wLib.acceptAlert(driver);

		PHP.getPatientDashboardButton();
		PHP.getLogoutDropdowm().click();
		PHP.getLogoutButton().click();
	}
	@Test(groups = {"regression"})
	public void Book() 
	{
		System.out.println("patient Booked");
		
	}

}
