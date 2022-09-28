package Patient_module_integration;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import GenericUtilities.ExcelUtility;
import GenericUtilities.JavaUtility;
import GenericUtilities.PropertyFileUtility;
import GenericUtilities.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Patient_to_Book_Appointment 
{
	public static void main(String[] args) throws Throwable 
	{
		//create object for propertyfile
		PropertyFileUtility pLib=new PropertyFileUtility();
		WebDriverUtility wLib=new WebDriverUtility();
        
		
		// Create object for sourcefile
		//FileInputStream fis=new FileInputStream("src\\test\\resources\\CommonDataForPatientAdmin.properties");

		//create object for propertyfile
		//Properties pObj=new Properties();

		//load the properties
		//pObj.load(fis);

		//get the data from commondata file
		//String BROWSER= pObj.getProperty("browser");
		//String URL = pObj.getProperty("url");
		//String USERNAME = pObj.getProperty("username");
		//String PASSWORD = pObj.getProperty("password");
		
		String BROWSER=pLib.readDataFromPropertyFile("browser");
		String URL = pLib.readDataFromPropertyFile("url");
		String USERNAME = pLib.readDataFromPropertyFile("username1");  
		String PASSWORD = pLib.readDataFromPropertyFile("password1"); 
		
		WebDriver driver=null;
		if(BROWSER.contains("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else if(BROWSER.contains("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else
		{
			System.out.println("invalid browser");
		}

		driver.get(URL); //url
		wLib.maximizeWindow(driver); //maximize window
		wLib.waitForPageLoad(driver);//implictlywait

		//WebDriverManager.firefoxdriver().setup();
		//WebDriver driver=new FirefoxDriver();
		//driver.get("http://192.168.0.231/domain/Hospital_Management_System/");
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[.='Click Here']")).click();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(USERNAME);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(PASSWORD);
		driver.findElement(By.xpath("//button[@name='submit']")).click();

		driver.findElement(By.xpath("//span[.=' Book Appointment ']")).click();

		WebElement ele = driver.findElement(By.xpath("//Select[@name='Doctorspecialization']"));
		ele.click();
		//Select s=new Select(ele);
		//s.selectByVisibleText("Dentist");

		wLib.selectByVisibleText(ele, "Dentist");

		WebElement ele1 = driver.findElement(By.xpath("//Select[@name='doctor']"));
		ele1.click();
		//Select s1=new Select(ele1);
		//s1.selectByVisibleText("adaaa");
		wLib.selectByVisibleText(ele1, "adaaa");

		driver.findElement(By.xpath("//input[@name='appdate']")).click();
		driver.findElement(By.xpath("//td[.='19']")).click();

		driver.findElement(By.xpath("//input[@name='apptime']")).click();
		driver.findElement(By.xpath("//a[@data-action='incrementHour']")).click();
		driver.findElement(By.xpath("//a[@data-action='decrementMinute']")).click();
		driver.findElement(By.xpath("//a[@data-action='toggleMeridian']")).click();
		driver.findElement(By.xpath("//button[@name='submit']")).click();
		
		wLib.acceptAlert(driver);
		//Alert a = driver.switchTo().alert();  //to click on OK pop-up
		//a.accept();

		driver.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();
		driver.findElement(By.xpath("//a[@href='logout.php']")).click();
		
		
		//get the data from commondata file for ADMIN as for Patient
		driver.findElement(By.xpath("//a[@href='hms/admin']")).click();
		String USERNAME1 = pLib.readDataFromPropertyFile("username2");  //for Admin USERNAME
		String PASSWORD1 = pLib.readDataFromPropertyFile("password2");  //for Admin PASSWORD
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(USERNAME1);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(PASSWORD1);
		driver.findElement(By.xpath("//button[@name='submit']")).click();
		driver.findElement(By.xpath("//span[.=' Appointment History ']")).click();
		driver.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();
		driver.findElement(By.xpath("//a[@href='logout.php']")).click();
		driver.close();

	}

}
