package testCases;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFiles.CommonFunctions;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjectModel.LoginPOM;

public class Test2  {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://54.172.137.151/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(30));
	    driver.findElement(By.id("txtLoginUsername")).click();
	   // driver.findElement(By.id("txtLoginUsername")).click();
	   // driver.findElement(By.id("txtLoginUsername")).clear();
	    driver.findElement(By.id("txtLoginUsername")).sendKeys("7010881703");
	    driver.findElement(By.id("btnregister")).click();
	   // driver.findElement(By.id("txtLoginPassword")).clear();
	    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(30));
	    driver.findElement(By.id("txtLoginPassword")).sendKeys("121385");
	    driver.findElement(By.id("btnLogin")).click();
	
	
	
	
		driver.findElement(By.xpath("//li[@id='doctorsPage']/a/span")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='₹ 200'])[1]/following::*[name()='svg'][1]")).click();
	    driver.findElement(By.linkText("View Details")).click();
	    driver.findElement(By.id("txtSymptoms")).click();
	    driver.findElement(By.id("txtSymptoms")).clear();
	    driver.findElement(By.id("txtSymptoms")).sendKeys("fever");
	    driver.findElement(By.id("txtSymptomsDescription")).click();
	}
}
