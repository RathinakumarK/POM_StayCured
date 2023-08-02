package pageObjectModel;



import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookAppointmentPOM {
	
	@FindBy(xpath = "//*[@id='menu']/li")
	public static List< WebElement>doctorsTab;
	
	@FindBy(xpath =  "//span[text()='DashBoard']")
	public static WebElement dashBoard;
	
	@FindBy(xpath="//tr[@id='123']//div[@class='btnmore btn-primary']//*[name()='svg']")
	public static WebElement threeDotGP;
	
	@FindBy(xpath="//div[@class='dropdown-menu dropdown-menu-right show']//a[@class='dropdown-item'][normalize-space()='View Details']")
	public static WebElement viewDetails;
	
	@FindBy(xpath="//input[@id='txtSymptoms']")
	public static WebElement reasonForAppoint;
	
	@FindBy(xpath="//textarea[@id='txtSymptomsDescription']")
	public static WebElement symptom;
	
	@FindBy(xpath="//td[@class='day'][normalize-space()='25']")
	public static WebElement datePicker;
	
	@FindBy(xpath="//button[normalize-space()='06:00 PM']")
	public static WebElement time;
	
	@FindBy(xpath="//button[@id='btnsave']")
	public static WebElement schedule;
	
	@FindBy(xpath="//button[@id='btnbyCash']")
	public static WebElement payByCash;
	
	
}

