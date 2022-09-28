package Admin_module_system;

import static org.testng.Assert.fail;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.http.conn.ssl.BrowserCompatHostnameVerifier;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Assert.*;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.HMS.ObjectRepository.AddDoctorPage;
import com.HMS.ObjectRepository.AdminHomePage;
import com.HMS.ObjectRepository.AdminLoginPage;
import com.HMS.ObjectRepository.HMSHomePage;

import GenericUtilities.BaseClass;

//@Listeners(GenericUtilities.ListnerImplementationClass.class)//
//@Listeners(GenericUtilities.ExtentReportIImplementationClass.class)
public class To_Add_Doctor_System extends BaseClass
{@Test(groups = {"smoke"})

	public void  AddDoctor() throws Throwable 
{
	int random = jLib.randomNumber();

	String USERNAME2 = pLib.readDataFromPropertyFile("username2");  //adminusername
	String PASSWORD2 = pLib.readDataFromPropertyFile("password2");  //adminpassword

	HMSHomePage H=new HMSHomePage(driver);
	H.AdminLogin();


	AdminLoginPage ALP=new AdminLoginPage(driver);
	ALP.AdminLogin(USERNAME2,PASSWORD2);		

	AdminHomePage AHP=new AdminHomePage(driver);
	AHP.getDoctorDropdown().click();
	AHP.getAddDoctorBTN().click();



	String Docname=eLib.readDataFromExcelFile("sheet1",0,1);
	String DocAddress=eLib.readDataFromExcelFile("sheet1",1,1);
	String DocContact=eLib.readDataFromExcelFile("sheet1",3,1);
	String DoctorContFee=eLib.readDataFromExcelFile("sheet1",3,1);
	String DocEmail=eLib.readDataFromExcelFile("sheet1",4,1)+random;
	String Pass=eLib.readDataFromExcelFile("sheet1",5,1);
	String ConfoPass=eLib.readDataFromExcelFile("sheet1",6,1);

	AddDoctorPage ADP1=new AddDoctorPage(driver);
	ADP1.ToAddDoctor("Dentist",Docname,DocAddress,DocContact,DoctorContFee,DocEmail,Pass,ConfoPass);
	

	Assert.fail();

	wLib.acceptAlert(driver);
}

//@Test(groups = {"regression"})
//public void doc() {
	//System.out.println("doctrs added");
//}

}
