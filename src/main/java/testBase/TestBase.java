package testBase;

import java.security.PublicKey;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.Home;
import pageObjects.Login;
import pageObjects.SignUp;
import pageObjects.TopProductDropdown;
import reusableComponents.propertiesOperations;

public class TestBase extends ObjectsRepo{
	public static WebDriver driver = null;
//	 private Properties properties;
	
	public void LunchBrowserAndNavigate() throws Exception {
		
		String browser = propertiesOperations.getPropertyValueByKey("browser");
		String url = propertiesOperations.getPropertyValueByKey("url");
//		String email1 = propertiesOperations.getPropertyValueByKey("username");
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("ie")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}
		   driver.manage().window().maximize();
		   driver.get(url);
		  
	}
//	 public String getPropertyValueByKey(String username) {
//	    String name =  properties.getProperty(username);
//	        System.out.println("username"+name);
//	        return name;
//	    }
//	
	@BeforeMethod
	public void setupMethod() throws Exception {
		LunchBrowserAndNavigate();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		home = new TopProductDropdown();
		 logIn = new Login();
		 home = new Home();
//		vehecalData = new SignUp();
	}
	@AfterMethod
	public void clearup() {
		driver.quit();
	}
	
	   
	   

}
