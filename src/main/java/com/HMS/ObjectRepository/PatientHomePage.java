package com.HMS.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PatientHomePage
{
	
	//Declaration
	@FindBy(xpath="//span[.=' Dashboard ']")
	private WebElement PatientDashboardButton;
	
	@FindBy(xpath="//span[.=' Book Appointment ']")
	private WebElement BookAppointmentButton;
	
	@FindBy(xpath=" Appointment History ")
	private WebElement AppointmentHistoryButton;
	
	@FindBy(xpath="//span[.=' Medical History ']")
	private WebElement MedicalHistoryButton; 
	
	@FindBy(xpath="//img[@src='assets/images/images.jpg']")
	private WebElement LogoutDropdowm;
	
	@FindBy(xpath="//a[contains(.,'Log Out')]")
	private WebElement LogoutButton;
	
	
	//Initialization
	public PatientHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	


	//Utilization

	public WebElement getPatientDashboardButton() {
		return PatientDashboardButton;
	}


	public WebElement getBookAppointmentButton() {
		return BookAppointmentButton;
	}


	public WebElement getAppointmentHistoryButton() {
		return AppointmentHistoryButton;
	}


	public WebElement getMedicalHistoryButton() {
		return MedicalHistoryButton;
	}


	public WebElement getLogoutDropdowm() {
		return LogoutDropdowm;
	}


	public WebElement getLogoutButton() {
		return LogoutButton;
	}
	
	
	//Business Library empty for HomePage Because Only Click Action is Performed
	
	
	

}
