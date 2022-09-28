package com.HMS.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericUtilities.WebDriverUtility;

public class AddDoctorPage extends WebDriverUtility{


	//Declaration
	@FindBy(xpath="//select[@name='Doctorspecialization']")
	private WebElement DoctorSpecializationDropdown;

	@FindBy(xpath="//input[@placeholder='Enter Doctor Name']")
	private WebElement DoctorNameTextFld;

	@FindBy(xpath="//textarea[@placeholder='Enter Doctor Clinic Address']")
	private WebElement DoctorClinicAddressTxtFld;

	@FindBy(xpath="//input[@placeholder='Enter Doctor Consultancy Fees']")
	private WebElement DoctorConsultancyFeesTxtFld;

	@FindBy(xpath="//input[@placeholder='Enter Doctor Contact no']")
	private WebElement DoctorContactNoTxtFld;

	@FindBy(xpath="//input[@placeholder='Enter Doctor Email id']")
	private WebElement DoctorEmailIdTxtFld;

	@FindBy(xpath="//input[@placeholder='New Password']")
	private WebElement NewPasswordTxtFld;

	@FindBy(xpath="//input[@placeholder='Confirm Password']")
	private WebElement ConfirmPasswordTxtFld;

	@FindBy(xpath="//button[@name='submit']")
	private WebElement SubmitBTN;



	//Initialization
	public AddDoctorPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}




	//Utilization

	public WebElement getDoctorSpecializationDropdown() {
		return DoctorSpecializationDropdown;
	}



	public WebElement getDoctorNameTextFld() {
		return DoctorNameTextFld;
	}



	public WebElement getDoctorClinicAddressTxtFld() {
		return DoctorClinicAddressTxtFld;
	}



	public WebElement getDoctorConsultancyFeesTxtFld() {
		return DoctorConsultancyFeesTxtFld;
	}



	public WebElement getDoctorContactNoTxtFld() {
		return DoctorContactNoTxtFld;
	}



	public WebElement getDoctorEmailIdTxtFld() {
		return DoctorEmailIdTxtFld;
	}



	public WebElement getNewPasswordTxtFld() {
		return NewPasswordTxtFld;
	}



	public WebElement getConfirmPasswordTxtFld() {
		return ConfirmPasswordTxtFld;
	}



	public WebElement getSubmitBTN() {
		return SubmitBTN;
	}


	//Business Library
	public void ToAddDoctor(String docSPL,String DoctorName,String  DoctorClinicAddress,String  DoctorConsultancyFees,String  DoctorContactno,String  DoctorEmail,String Password,String ConfirmPassword)
	{
		DoctorSpecializationDropdown.click();
		selectByVisibleText(DoctorSpecializationDropdown, "Dentist");

		DoctorNameTextFld.sendKeys(DoctorName);
		DoctorClinicAddressTxtFld.sendKeys(DoctorClinicAddress);
		DoctorConsultancyFeesTxtFld.sendKeys(DoctorConsultancyFees);
		DoctorContactNoTxtFld.sendKeys(DoctorContactno);
		DoctorEmailIdTxtFld.sendKeys(DoctorEmail);
		NewPasswordTxtFld.sendKeys(Password);
		ConfirmPasswordTxtFld.sendKeys(ConfirmPassword);
		SubmitBTN.click();
		
		


	}

}