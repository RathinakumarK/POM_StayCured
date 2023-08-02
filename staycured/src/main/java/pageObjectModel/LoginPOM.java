package pageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPOM {
	@FindBy(xpath = "//input[@id='txtLoginUsername']")
	public static WebElement userName;
	
	@FindBy(xpath = "//input[@id='btnregister']")
	public static WebElement register;
	
	@FindBy(xpath = "//input[@id='txtLoginPassword']")
	public static WebElement password;
	
	@FindBy(xpath = "//input[@id='btnLogin']")
	public static WebElement signIn;
	
	@FindBy(xpath = "//input[@id='btnback']")
	public static WebElement signInPageBack;

}
