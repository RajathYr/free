package com.HMS.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class DoctorLoginPage 
{
	//Declaration

	@FindBy(xpath="//input[@name='username']")
	private WebElement DoctorUsername;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement DoctorPassword;
	
	@FindBy(xpath="//button[@name='submit']")
	private WebElement DoctorSubmitButton;

	
	//Initialization
	public DoctorLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


	//Utilization
	public WebElement getDoctorUsername() {
		return DoctorUsername;
	}


	public WebElement getDoctorPassword() {
		return DoctorPassword;
	}


	public WebElement getDoctorSubmitButton() {
		return DoctorSubmitButton;
	}
	
	
	//Business Library
		public void DoctorLogin(String username,String password)
		{
			DoctorUsername.sendKeys(username);
			DoctorPassword.sendKeys(password);
			DoctorSubmitButton.click();
		}
		
	
	
}
