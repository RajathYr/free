package GenericUtilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.HMS.ObjectRepository.AdminHomePage;
import com.HMS.ObjectRepository.AdminLoginPage;
import com.HMS.ObjectRepository.PatientHomePage;
import com.HMS.ObjectRepository.PatientLoginPage;
import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass 
{
	public DataBaseUtility dLib=new DataBaseUtility();
	public ExcelUtility eLib=new ExcelUtility();
	public JavaUtility jLib=new JavaUtility();
	public PropertyFileUtility pLib=new PropertyFileUtility();
	public WebDriverUtility wLib=new WebDriverUtility();
	public WebDriver driver;
	public static WebDriver sDriver;
	
	@BeforeSuite(groups = {"smoke","regression"})
	public void ConnectToDB()
	{
		System.out.println("-----connection to the DataBase-----");
	}
	//@org.testng.annotations.Parameters("BROWSER")
	@BeforeClass(groups = {"smoke","regression"})
	public void LaunchBrowser() throws Throwable  //(String BROWSER)
	{
		System.out.println("-----Launch Browser-----");
		String BROWSER = pLib.readDataFromPropertyFile("browser");
		
		if(BROWSER.equalsIgnoreCase("chrome"))
		{
		//	WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(BROWSER.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else
		{
			driver=new InternetExplorerDriver();
		}
		sDriver=driver;
		wLib.waitForPageLoad(driver);
		wLib.maximizeWindow(driver);
	}
	
	@BeforeMethod(groups = {"smoke","regression"})
	public void Login() throws Throwable 
	{
		
	//String URL1 = pLib.readDataFromPropertyFile("url");
	//driver.get(URL1);
	//String USERNAME1 = pLib.readDataFromPropertyFile("username1");
	//String PASSWORD1 = pLib.readDataFromPropertyFile("password1");
	
	
	
	String URL2=pLib.readDataFromPropertyFile("url2");
	driver.get(URL2);
	//String USERNAME2 = pLib.readDataFromPropertyFile("username2");
	//String PASSWORD2 = pLib.readDataFromPropertyFile("password2");
	
	
	
	
	
	//PatientLoginPage PHP=new PatientLoginPage(driver);
	//PHP.PatientLogin(USERNAME1, PASSWORD1);
	
	
	//AdminLoginPage ALP=new AdminLoginPage(driver);
	//ALP.AdminLogin(USERNAME2, PASSWORD2);
	
	}
	
	
	
	@AfterMethod(groups = {"smoke","regression"})
	public void Logout()
	{
		//PatientHomePage PHP=new PatientHomePage(driver);
		//PHP.getPatientDashboardButton();
		//PHP.getLogoutDropdowm();
		//PHP.getLogoutButton();
		
		AdminHomePage AHP=new AdminHomePage(driver);
		AHP.getDashboardBNT();
		AHP.getLogoutDropdown();
		AHP.getLogoutBTN();
	}
	
	@AfterClass(groups = {"smoke","regression"})
	public void CloseBrowser()
	{
		driver.quit();
	}
	
	@AfterSuite(groups = {"smoke","regression"})
	public void  CloseDB() throws Throwable
	{
		dLib.closeDB();
		System.out.println("-----Database Disconnected-----");
	}


}
