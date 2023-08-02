package testCases;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFiles.CommonFunctions;
import pageObjectModel.LoginPOM;

public class UpdateProfile extends CommonFunctions{
	
	@Test
	public static void updateProfile() {
		PageFactory.initElements(driver, LoginPOM.class);
		LoginPOM.userName.sendKeys(properties.getProperty("username"));
		LoginPOM.register.click();
		LoginPOM.password.sendKeys(properties.getProperty("password"));
		LoginPOM.signIn.click();
		
		WebElement button=driver.findElement(By.xpath("//li[@id='doctorsPage']//a"));
		button.click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='₹ 200'])[1]/following::*[name()='svg'][1]")).click();
	    driver.findElement(By.linkText("View Details")).click();
	    driver.findElement(By.id("txtSymptoms")).click();
	    driver.findElement(By.id("txtSymptoms")).clear();
	    driver.findElement(By.id("txtSymptoms")).sendKeys("fever");
	    driver.findElement(By.id("txtSymptomsDescription")).click();
	}

}
