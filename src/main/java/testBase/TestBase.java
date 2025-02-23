package testBase;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.FakeNameGenerator;
import pageObjects.Home;
import pageObjects.Login;
import pageObjects.SignUp;
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
	@FindBy(xpath = "//button[@class=\"btn-close\"]")
	WebElement closeCoupon;
	public void closeCouponPopup() throws InterruptedException {
		Thread.sleep(2000);
		closeCoupon.click();
	}
	@BeforeMethod
	public void setupMethod() throws Exception {
		LunchBrowserAndNavigate();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		home = new TopProductDropdown();
		 logIn = new Login();
		 home = new Home();
		 fakename = new FakeNameGenerator();
		 signUp = new SignUp();
//		vehecalData = new SignUp();
	}
	@AfterMethod
	public void clearup() {
		driver.quit();
	}
	
	   
	   

}
