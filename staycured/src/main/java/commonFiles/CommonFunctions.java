package commonFiles;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonFunctions {
	public static Properties properties=null;
	public static WebDriver driver=null;
	
	public Properties loadPropertyFile() throws IOException {
		FileInputStream fileInputStream=new FileInputStream("config.properties");
		properties=new Properties();
		properties.load(fileInputStream);
		return properties;
	}


	@BeforeSuite
	public void launchBrowser() throws IOException {
		loadPropertyFile();
		String browser=properties.getProperty("browser");
		String url=properties.getProperty("url");
		
		if(browser.equalsIgnoreCase("chrome")) {
			ChromeOptions chromeOptions = new ChromeOptions(); 
			chromeOptions.addArguments("--disable-notifications");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(chromeOptions);
		}else if(browser.equalsIgnoreCase("firefox")){
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();	
		} else if(browser.equalsIgnoreCase("edge")){
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		

	}
	
	
	
	@AfterSuite
	public void teardown() {
		
	}
}
