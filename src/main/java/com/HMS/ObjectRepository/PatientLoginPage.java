package com.HMS.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PatientLoginPage 
{
	
	//declaration
	@FindBy(xpath="//input[@name='username']")
	private WebElement Patientusername;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement PatientPassword;
	
	@FindBy(xpath="//button[@name='submit']")
	private WebElement PatientSubmitButton;
	
	

	//Initialization
	public PatientLoginPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	//Utilization
	public WebElement getPatientusername() {
		return Patientusername;
	}

	public WebElement getPatientPassword() {
		return PatientPassword;
	}

	public WebElement getPatientSubmitButton() {
		return PatientSubmitButton;
	}
	
	//Business library
	public void PatientLogin(String username,String password)
	{
		Patientusername.sendKeys(username);
		PatientPassword.sendKeys(password);
		PatientSubmitButton.click();
	}

}
