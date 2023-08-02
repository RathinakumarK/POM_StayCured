package testCases;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IrbTc1 {

	public static void main(String[] args) {
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--disable-notifications");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		driver.get("https://qa.oneaegis.dev/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.xpath("//input[@id='txtUserName']")).sendKeys("justinlanger");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("tech@123");
		driver.findElement(By.xpath("//input[@id='c_btnLogin']")).click();
		WebElement topBar = driver.findElement(By.xpath("//span[@class='pageTitle']"));
		System.out.println(topBar.getText());
		driver.findElement(By.xpath("//a[normalize-space()='Contacts']")).click();
		driver.findElement(By.xpath("//a[@id='p_a_hlNewContact']")).click();
		
		
		
		/*
		 * driver.findElement(By.xpath("//input[@id='p_c_tbPrefix']")).sendKeys("Mafioo"
		 * ); driver.findElement(By.xpath("//input[@id='p_c_tbFirstName']")).sendKeys(
		 * "Gokul");
		 * driver.findElement(By.xpath("//input[@id='p_c_tbLastName']")).sendKeys(
		 * "Medical");
		 * driver.findElement(By.xpath("//input[@id='p_c_tbDegree']")).sendKeys("MBBS");
		 * driver.findElement(By.xpath("//input[@id='p_c_tbEmail']")).sendKeys(
		 * "gokulmafs@test.com"); WebElement department =
		 * driver.findElement(By.xpath("//select[@id='p_c_ddlDepartment']")); Select
		 * select = new Select(department); select.selectByIndex(8); WebElement
		 * selectFiles = driver.findElement(By.xpath("//input[@id='cUpload_file']"));
		 * selectFiles.sendKeys("C:\\Users\\TechUnity\\Downloads\\26-JPG.jpg");
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 * 
		 * WebElement AaddressType = driver.findElement(By.xpath(
		 * "//select[@id='p_c_ctlAddressBook_ddlAddressType']")); Select select1 = new
		 * Select(AaddressType); select1.selectByIndex(2);
		 * 
		 * WebElement country =
		 * driver.findElement(By.xpath("//select[@id='ddlCountry']")); Select select2 =
		 * new Select(country); select2.selectByVisibleText("United Kingdom");
		 * 
		 * driver.findElement(By.xpath(
		 * "//input[@id='p_c_ctlAddressBook_txtStreetAddress']")).
		 * sendKeys("148-149, Tank Road, opposite to HDFC Bank, Sivananda Colony, Tatabad, Coimbatore, Tamil Nadu 641012"
		 * ); driver.findElement(By.xpath("//input[@id='p_c_ctlAddressBook_txtCity']")).
		 * sendKeys("Fargo");
		 * 
		 * WebElement stateProvince =
		 * driver.findElement(By.xpath("//select[@id='p_c_ctlAddressBook_ddlState']"));
		 * Select select3 = new Select(stateProvince);
		 * select3.selectByVisibleText("ND - North Dakota");
		 * driver.findElement(By.xpath("//input[@id='p_c_ctlAddressBook_txtZipCode']")).
		 * sendKeys("58104");
		 * 
		 * WebElement phoneType=
		 * driver.findElement(By.xpath("//select[@id='p_c_ctlPhoneBook_ddlPhoneType']"))
		 * ; Select select4 = new Select(phoneType);
		 * select4.selectByVisibleText("Mobile");
		 * 
		 * driver.findElement(By.xpath("//input[@id='p_c_ctlPhoneBook_txtPhone']")).
		 * sendKeys("9999999999");
		 * driver.findElement(By.xpath("//input[@id='p_c_btnAddUpdate']")).click();
		 * WebElement topBaradd =
		 * driver.findElement(By.xpath("//span[@class='pageTitle']"));
		 * System.out.println(topBaradd.getText());
		 * 
		 * driver.findElement(By.xpath("//a[normalize-space()='Contacts']")).click();
		 * driver.findElement(By.xpath("//input[@id='p_c_tbSearch']")).sendKeys("gokul"+
		 * Keys.ENTER); driver.findElement(By.xpath("//img[@title='Edit']")).click();
		 * driver.findElement(By.xpath("//input[@id='p_c_cmContactInfo_ctl08']")).click(
		 * ); driver.findElement(By.xpath("//input[@id='p_c_tbFirstName']")).sendKeys(
		 * "Krishnan");
		 * driver.findElement(By.xpath("//input[@id='p_c_btnAddUpdate']")).click();
		 * WebElement topBaraddEdit =
		 * driver.findElement(By.xpath("//span[@class='pageTitle']"));
		 * System.out.println(topBaraddEdit.getText());
		 * 
		 * driver.findElement(By.xpath("//a[normalize-space()='Contacts']")).click();
		 * driver.findElement(By.xpath("//input[@id='p_c_tbSearch']")).sendKeys("gokul"+
		 * Keys.ENTER); driver.findElement(By.xpath("//img[@title='Edit']")).click();
		 * driver.findElement(By.xpath("//a[@id='p_a_cmdDeleteContact']")).click();
		 * driver.switchTo().alert().accept(); WebElement deletedText =
		 * driver.findElement(By.xpath("//div[@id='p_c_divIsDeleted']"));
		 * System.out.println(deletedText.getText());
		 */
		
	}

}
