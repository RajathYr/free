package com.HMS.ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericUtilities.WebDriverUtility;

public class UserPatientBookAppointment  extends WebDriverUtility
{
	//Declaration
	
	@FindBy(xpath="//select[@name='Doctorspecialization']")
	private WebElement DoctorSpecializationDropdown;
	
	@FindBy(xpath="//select[@id='doctor']")
	private WebElement SelectDoctorDropdown;
	
	@FindBy(xpath="//input[@name='appdate']")
	private WebElement DatePopup;
	
	@FindBy(xpath="//input[@name='apptime']")
	private WebElement TimePopup;
	
	@FindBy(xpath="//button[@name='submit']")
	private WebElement UserSubmitButton;
	
	@FindBy(xpath="//img[@src='assets/images/images.jpg']")
	private WebElement LogoutDropdowm;
	
	@FindBy(xpath="")
	private WebElement LogoutButton;
	
	
	//Initialization
	public UserPatientBookAppointment(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
	
	
	//Utilization


	public WebElement getDoctorSpecializationDropdown() {
		return DoctorSpecializationDropdown;
	}


	public WebElement getSelectDoctorDropdown() {
		return SelectDoctorDropdown;
	}


	public WebElement getDatePopup() {
		return DatePopup;
	}


	public WebElement getTimePopup() {
		return TimePopup;
	}


	public WebElement getUserSubmitButton() {
		return UserSubmitButton;
	}


	public WebElement getLogoutDropdowm() {
		return LogoutDropdowm;
	}


	public WebElement getLogoutButton() {
		return LogoutButton;
	}
	

	
	//Business Library
	public void ToBookAppointment(WebDriver driver,String DropdownText,String DocotorDropdown)
	{
		DoctorSpecializationDropdown.click();
		selectByVisibleText(DoctorSpecializationDropdown, DropdownText);
		
		SelectDoctorDropdown.click();
		selectByVisibleText(SelectDoctorDropdown,DocotorDropdown);
		
		driver.findElement(By.xpath("//input[@name='appdate']")).click();
		driver.findElement(By.xpath("//td[.='27']")).click();
		UserSubmitButton.click();
		
		

	
}
	

}
