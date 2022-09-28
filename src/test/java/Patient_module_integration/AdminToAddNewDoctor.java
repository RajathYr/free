package Patient_module_integration;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.HMS.ObjectRepository.AddDoctorPage;
import com.HMS.ObjectRepository.AdminHomePage;
import com.HMS.ObjectRepository.AdminLoginPage;
import com.HMS.ObjectRepository.HMSHomePage;

import GenericUtilities.BaseClass;
import GenericUtilities.ExcelUtility;
import GenericUtilities.JavaUtility;
import GenericUtilities.PropertyFileUtility;
import GenericUtilities.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AdminToAddNewDoctor extends BaseClass
{
	@Test(groups = {"smoke"})
	public void AddDoctor() throws Throwable 
	{
		//create object for propertyfile
		//PropertyFileUtility pLib=new PropertyFileUtility();
		//ExcelUtility eLib=new ExcelUtility();
		//JavaUtility jLib=new JavaUtility();
		//WebDriverUtility wLib=new WebDriverUtility();

		int random = jLib.randomNumber();

		//create random object
		//Random r=new Random();
		//int random = r.nextInt(2000);

		//Fetch data from excel
		//FileInputStream fi=new  FileInputStream("src\\test\\resources\\admin_module_add_doctor_credentials.xlsx");
		//Workbook wb = WorkbookFactory.create(fi);
		//Sheet shee = wb.getSheet("sheet1");

		//String BROWSER=pLib.readDataFromPropertyFile("browser");
		//String URL2 = pLib.readDataFromPropertyFile("url2");


		String USERNAME2 = pLib.readDataFromPropertyFile("username2");  //adminusername
		String PASSWORD2 = pLib.readDataFromPropertyFile("password2");  //adminpassword
		HMSHomePage H=new HMSHomePage(driver);
		H.AdminLogin();

		AdminLoginPage ALP=new AdminLoginPage(driver);
		ALP.AdminLogin(USERNAME2,PASSWORD2);		

		AdminHomePage AHP=new AdminHomePage(driver);
		AHP.getDoctorDropdown().click();
		AHP.getAddDoctorBTN().click();


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

		//driver.get(URL2); //url
		//wLib.maximizeWindow(driver); //maximize window
		//wLib.waitForPageLoad(driver);//implictlywait




		//create object for sourcefile
		//FileInputStream fis=new FileInputStream("src\\test\\resources\\commonDataForAdmin.properties");


		//create object for propertyfile
		//Properties pOBJ=new Properties();


		//load the properties
		//pOBJ.load(fis);


		//WebDriver driver=new FirefoxDriver();
		//driver.get("http://192.168.0.231/domain/Hospital_Management_System/");
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//a[@href='hms/admin']")).click();
		//driver.findElement(By.xpath("//input[@name='username']")).sendKeys(USERNAME2);
		//driver.findElement(By.xpath("//input[@type='password']")).sendKeys(PASSWORD2);
		//driver.findElement(By.xpath("//button[@name='submit']")).click();
		//driver.findElement(By.xpath("//span[.=' Doctors ']")).click();
		//driver.findElement(By.xpath("//span[.=' Add Doctor']")).click();


		//WebElement ele = driver.findElement(By.xpath("//Select[@name='Doctorspecialization']"));
		//Select s=new Select(ele);
		//s.selectByVisibleText("Dentist");
		//wLib.selectByVisibleText(ele, "Dentist");

		//driver.findElement(By.xpath("//input[@placeholder='Enter Doctor Name']")).sendKeys(eLib.readDataFromExcelFile("sheet1",0,1));
		//driver.findElement(By.xpath("//textarea[@placeholder='Enter Doctor Clinic Address']")).sendKeys(eLib.readDataFromExcelFile("sheet1",1,1));
		//driver.findElement(By.xpath("//input[@placeholder='Enter Doctor Consultancy Fees']")).sendKeys(eLib.readDataFromExcelFile("sheet1",2,1));
		//driver.findElement(By.xpath("//input[@placeholder='Enter Doctor Contact no']")).sendKeys(eLib.readDataFromExcelFile("sheet1",3,1));
		//driver.findElement(By.xpath("//input[@placeholder='Enter Doctor Email id']")).sendKeys(eLib.readDataFromExcelFile("sheet1",4,1)+random);
		//driver.findElement(By.xpath("//input[@placeholder='New Password']")).sendKeys(eLib.readDataFromExcelFile("sheet1",5,1));
		//driver.findElement(By.xpath("//input[@placeholder='Confirm Password']")).sendKeys(eLib.readDataFromExcelFile("sheet1",6,1));
		//driver.findElement(By.xpath("//button[@name='submit']")).click();

		String Docname=eLib.readDataFromExcelFile("sheet1",0,1);
		String DocAddress=eLib.readDataFromExcelFile("sheet1",1,1);
		String DocContact=eLib.readDataFromExcelFile("sheet1",3,1);
		String DoctorContFee=eLib.readDataFromExcelFile("sheet1",3,1);
		String DocEmail=eLib.readDataFromExcelFile("sheet1",4,1)+random;
		String Pass=eLib.readDataFromExcelFile("sheet1",5,1);
		String ConfoPass=eLib.readDataFromExcelFile("sheet1",6,1);

		AddDoctorPage ADP1=new AddDoctorPage(driver);
		ADP1.ToAddDoctor("Dentist",Docname,DocAddress,DocContact,DoctorContFee,DocEmail,Pass,ConfoPass);

		wLib.acceptAlert(driver);
		//Alert a = driver.switchTo().alert();  //to click on OK pop-up
		//a.accept();

		//driver.findElement(By.xpath("//span[.=' Doctors ']")).click();
		//driver.findElement(By.xpath("//span[.=' Manage Doctors ']")).click();
		//driver.findElement(By.xpath("(//td[.='General Physician']/../td[5]/div//a[@tooltip='Remove'])[1]")).getLocation();


		//Alert a1 = driver.switchTo().alert();
		//a1.accept();
	}

}
