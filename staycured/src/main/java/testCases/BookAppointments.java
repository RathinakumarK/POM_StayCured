package testCases;

import java.time.Duration;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFiles.CommonFunctions;
import pageObjectModel.BookAppointmentPOM;
import pageObjectModel.LoginPOM;

public class BookAppointments extends CommonFunctions{
	
	public static void updateProfile() {
		PageFactory.initElements(driver, LoginPOM.class);
		LoginPOM.userName.sendKeys(properties.getProperty("username"));
		LoginPOM.register.click();
		LoginPOM.password.sendKeys(properties.getProperty("password"));
		LoginPOM.signIn.click();
		}
	
	@Test
	public static void bookAppointments() {
		updateProfile();
		PageFactory.initElements(driver, BookAppointmentPOM.class);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		/*
		 * Actions actions=new Actions(driver);
		 * 
		 * actions.click(BookAppointmentPOM.dashBoard).build().perform();
		 */
		BookAppointmentPOM.dashBoard.click();
		BookAppointmentPOM.threeDotGP.click();
		BookAppointmentPOM.viewDetails.click();
		BookAppointmentPOM.reasonForAppoint.sendKeys("Fever");
		BookAppointmentPOM.symptom.sendKeys("Cold and Cough");
		/*
		 * BookAppointmentPOM.datePicker.click(); BookAppointmentPOM.time.click();
		 * BookAppointmentPOM.schedule.click(); BookAppointmentPOM.payByCash.click();
		 */
	}

}
