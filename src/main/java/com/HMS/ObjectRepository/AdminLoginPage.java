package com.HMS.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminLoginPage 
{
	//declaration
	
	@FindBy(xpath="//input[@name='username']")
	private WebElement AdminUsername;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement AdminPassword;
	
	@FindBy(xpath="//button[@name='submit']")
	private WebElement AdminSubmitButton;
	
	
	
	
	//Initialization
	
	public AdminLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


	
	
	//Utilization
	public WebElement getAdminUsername() {
		return AdminUsername;
	}


	public WebElement getAdminPassword() {
		return AdminPassword;
	}
	

	public WebElement getAdminSubmitButton() {
		return AdminSubmitButton;
	}
	

	

	//Business Library
	public void AdminLogin(String username2,String password2)
	{
		AdminUsername.sendKeys(username2);
		AdminPassword.sendKeys(password2);
		AdminSubmitButton.click();
	}
	
	
	

}
