package com.HMS.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminHomePage 
{
	
	@FindBy(xpath="//span[.=' Dashboard ']")
	private WebElement DashboardBNT;
	
	@FindBy(xpath="//span[.=' Doctors ']")
	private WebElement DoctorDropdown;
	
	@FindBy(xpath="//span[.=' Doctor Specialization ']")
	private WebElement DoctorSpecializationBTN;
	
	@FindBy(xpath="//span[.=' Add Doctor']")
	private WebElement AddDoctorBTN;
	
	@FindBy(xpath="//span[.=' Manage Doctors ']")
	private WebElement ManageDoctorsBTN;
	
	@FindBy(xpath="//span[.=' Users ']")
	private WebElement UsersDropdown;
	
	@FindBy(xpath="//span[.=' Manage Users ']")
	private WebElement ManageUsers;
	
	@FindBy(xpath="//span[.=' Patients ']")
	private WebElement PatientDropdown;
	
	@FindBy(xpath="//span[.=' Manage Patients ']")
	private WebElement ManagePatient;
	
	@FindBy(xpath="//span[.=' Appointment History ']")
	private WebElement AppointmentHistoryBTN;
	
	@FindBy(xpath="//span[.=' Conatctus Queries ']")
	private WebElement ContactQueriesDropdown;
	
	@FindBy(xpath="//span[.=' Unread Query ']")
	private WebElement UnreadQueriesBTN;
	
	@FindBy(xpath="//span[.=' Read Query ']")
	private WebElement ReadQueryBTN;
	
	@FindBy(xpath="//span[.=' Doctor Session Logs ']")
	private WebElement DoctorSessionLogsBTN;
	
	@FindBy(xpath="//span[.=' User Session Logs ']")
	private WebElement UserSessionLogsBTN;
	
	@FindBy(xpath="//span[.=' Reports ']")
	private WebElement ReportDropdown;
	
	@FindBy(xpath="//span[.='B/w dates reports ']")
	private WebElement BetweenDatesReportsBTN;
	
	@FindBy(xpath="//span[.=' Patient Search ']")
	private WebElement PatientSearchBTN;
	
	@FindBy(xpath="//img[@src='assets/images/images.jpg']")
	private WebElement LogoutDropdown;
	
	@FindBy(xpath="//a[contains(.,'Log Out')]")
	private WebElement LogoutBTN;
	
	@FindBy(xpath="//a[contains(.,'Total Users')]")
	private WebElement TotalUsersLink;
	
	@FindBy(xpath="//a[contains(.,'Total Doctors')]")
	private WebElement TotalDoctorsLink;
	
	@FindBy(xpath="//a[contains(.,'Total Patients')]")
	private WebElement TotalPatientsLink;
	
	@FindBy(xpath="//a[contains(.,'Total Appointments')]")
	private WebElement TotalAppointmentsLink;
	
	@FindBy(xpath="//a[contains(.,'Total New Queries')]")
	private WebElement TotalNewQueriesLink;

	
	
	
	//Initialization
	public AdminHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
	
	//Utilization

	public WebElement getDashboardBNT() {
		return DashboardBNT;
	}

	public WebElement getDoctorDropdown() {
		return DoctorDropdown;
	}

	public WebElement getDoctorSpecializationBTN() {
		return DoctorSpecializationBTN;
	}

	public WebElement getAddDoctorBTN() {
		return AddDoctorBTN;
	}

	public WebElement getManageDoctorsBTN() {
		return ManageDoctorsBTN;
	}

	public WebElement getUsersDropdown() {
		return UsersDropdown;
	}

	public WebElement getManageUsers() {
		return ManageUsers;
	}

	public WebElement getPatientDropdown() {
		return PatientDropdown;
	}

	public WebElement getManagePatient() {
		return ManagePatient;
	}

	public WebElement getAppointmentHistoryBTN() {
		return AppointmentHistoryBTN;
	}

	public WebElement getContactQueriesDropdown() {
		return ContactQueriesDropdown;
	}

	public WebElement getUnreadQueriesBTN() {
		return UnreadQueriesBTN;
	}

	public WebElement getReadQueryBTN() {
		return ReadQueryBTN;
	}

	public WebElement getDoctorSessionLogsBTN() {
		return DoctorSessionLogsBTN;
	}

	public WebElement getUserSessionLogsBTN() {
		return UserSessionLogsBTN;
	}

	public WebElement getReportDropdown() {
		return ReportDropdown;
	}

	public WebElement getBetweenDatesReportsBTN() {
		return BetweenDatesReportsBTN;
	}

	public WebElement getPatientSearchBTN() {
		return PatientSearchBTN;
	}

	public WebElement getLogoutDropdown() {
		return LogoutDropdown;
	}

	public WebElement getLogoutBTN() {
		return LogoutBTN;
	}

	public WebElement getTotalUsersLink() {
		return TotalUsersLink;
	}

	public WebElement getTotalDoctorsLink() {
		return TotalDoctorsLink;
	}

	public WebElement getTotalPatientsLink() {
		return TotalPatientsLink;
	}

	public WebElement getTotalAppointmentsLink() {
		return TotalAppointmentsLink;
	}

	public WebElement getTotalNewQueriesLink() {
		return TotalNewQueriesLink;
	}

	

	

	
	
	
	//Business Library empty for HomePage Because Only Click Action is Performed
	
	
	

}
