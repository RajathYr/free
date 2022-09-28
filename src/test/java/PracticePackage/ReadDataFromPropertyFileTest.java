package PracticePackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadDataFromPropertyFileTest {

	public static void main(String[] args) throws Throwable {
		// Create object for sourcefile
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\CommonData.properties");

		//create object for propertyfile
		Properties pObj=new Properties();

		//load the properties
		pObj.load(fis);

		//get the data from commondata file
		String BROWSER= pObj.getProperty("browser");
		String URL = pObj.getProperty("url");
		String USERNAME = pObj.getProperty("username");
		String PASSWORD = pObj.getProperty("password");

		System.out.println(BROWSER);
		System.out.println(URL);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);

		// firefox browser
		//WebDriverManager.firefoxdriver().setup();
		//WebDriver driver=new FirefoxDriver();
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//driver.get(URL);

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(URL);


		driver.findElement(By.name("username")).sendKeys("test@demo.com");
		driver.findElement(By.name("password")).sendKeys("Test@123");
		driver.findElement(By.name("submit")).click();



	}

}
