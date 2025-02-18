package testBase;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pageObjects.CategoryDropdown;
import pageObjects.Home;
import pageObjects.Login;
import pageObjects.SignUp;
import pageObjects.TopProductDropdown;

public class ObjectsRepo {
	 public static WebDriver driver;
	  public static ExtentReports extent;
	  public static ExtentTest test;
	  public static TopProductDropdown topProduct;
	  public static SignUp signUp;
	  public static Home home;
	  public static Login logIn;
	  public static CategoryDropdown category;
	  
	 // public static SignUp vehecalData;
	  
}
