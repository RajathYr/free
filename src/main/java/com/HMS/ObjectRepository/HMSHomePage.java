package com.HMS.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HMSHomePage 
{
	
	//declaration
	@FindBy(xpath="//a[.='Click Here']")
	private WebElement patientLoginPage;
	
	@FindBy(xpath="(//a[.='Click Here'])[2]")
	private WebElement DoctorLoginPage;
	
	@FindBy(xpath="(//a[.='Click Here'])[3]")
	private WebElement AdminLoginPage;
	
	@FindBy(xpath="//a[.='Home']")
	private WebElement HomeLink;
	
	@FindBy(xpath="//a[.='contact']")
	private WebElement contactLink;
	
	
	
	//Initialization
	public HMSHomePage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	

	//Utilization
	public WebElement getPatientLoginPage() {
		return patientLoginPage;
	}

	public WebElement getDoctorLoginPage() {
		return DoctorLoginPage;
	}

	public WebElement getAdminLoginPage() {
		return AdminLoginPage;
	}

	public WebElement getHomeLink() {
		return HomeLink;
	}

	public WebElement getContactLink() {
		return contactLink;
	}
	
	
	
	//Business library

	public void PatientLogin()
	{
		patientLoginPage.click();
	}
	public void DoctorLogin()
	{
		DoctorLoginPage.click();
	}
	public void AdminLogin()
	{
		AdminLoginPage.click();
	}
	public void HomeLink()
	{
		HomeLink.click();
	}
	public void ContactLink()
	{
		contactLink.click();
	}

}
