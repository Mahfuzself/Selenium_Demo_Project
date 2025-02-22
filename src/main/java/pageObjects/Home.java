package pageObjects;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import testBase.TestBase;

public class Home extends TestBase{
	@FindBy(id="firstname")
	WebElement txt_firstname;
	@FindBy(id="lastname")
	WebElement txt_lastname;
	@FindBy(id="birthdate")
	WebElement date_birthdate;
	@FindBy(xpath = "//input[@name='Gender']/parent::label")
	List <WebElement> rdo_gender;
	@FindBy(id="country")
	WebElement dd_country;
	@FindBy(id="zipcode")
	WebElement txt_zipcode;
	@FindBy(id="city")
	WebElement txt_city;
	@FindBy(id="occuption")
	WebElement dd_occupation;
	@FindBy(id="website")
	WebElement txt_website;
	@FindBy(id="open")
	WebElement btn_PictureOpenButton;
	@FindBy(xpath = "//input[@name='Hobbies']/parent::label")
	List <WebElement> chk_hobbiesElements;
	@FindBy(id="nextenterproductdata")
	WebElement btn_next;
	@FindBy(xpath = "(//div[@class='loginGroup register'])[1]")
	WebElement SignUp;
	@FindBy(xpath = "(//a[@class='LoginLink'])[1]")
	WebElement LogIn;
	@FindBy( id = "themeContactUs")
	WebElement ContactUs;
	@FindBy( id = "themeFaqs")
	WebElement FAQ;
	@FindBy( xpath = "(//button[contains(@class,'dnn-btn dnn-btn__primary')])[1]")
	WebElement Treatment;
	@FindBy( xpath = "(//i[@class=\"icon-cart\"])[1]//following-sibling::span[1]")
	WebElement Cart;
	@FindBy( xpath = " (//span[text()=\" Add to Cart \"])[1]")
	WebElement ADDToCart;
	@FindBy( xpath = "//div[@class='container']//h1[1]")
	WebElement CompleteYourOrderText;
	
	
  public Home() {
	 PageFactory.initElements(driver, this);
	 
 }
//  private void waitForPageToLoad() {
//	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//	    wait.until(driver -> ((JavascriptExecutor) driver)
//	            .executeScript("return document.readyState").toString().equals("complete"));
//	}
	@SuppressWarnings("deprecation")
	public void NavigateSignUp() {
		  try {
			  SignUp.click();
//			  waitForPageToLoad();
//			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
//			  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//			  driver.navigate().back();
		} catch (Exception e) {
			System.out.println("SignUp is not navigated");
			// TODO: handle exception
		}
		 
		  
		
	}
	  @SuppressWarnings("deprecation")
	public void NavigateLogIn() {
		  try {
			  LogIn.click();
//			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
			  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			  driver.navigate().back();
		} catch (Exception e) {
			System.out.println("LogIn is not navigated");
			// TODO: handle exception
		}
		  
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		  
		
	}
	  @SuppressWarnings("deprecation")
	public void NavigateContactUs() {
		  try {
			  ContactUs.click();
//			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
			  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			  driver.navigate().back();
		} catch (Exception e) {
			System.out.println("Contact Us is not navigated");
			// TODO: handle exception
		}
		
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		  
		
	}
	  @SuppressWarnings("deprecation")
	public void NavigateFAQ() {
		  try {
			  FAQ.click();
//			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
			  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			  driver.navigate().back();
		} catch (Exception e) {
			System.out.println("FAQ is not navigated");
			// TODO: handle exception
		}
		 
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	}
	  @SuppressWarnings("deprecation")
	public void ClickFindMyTreatment() {
		  try {
             Treatment.click();
			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(400));
			  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		} catch (Exception e) {
			System.out.println("Find My Treatment is not functional");
			// TODO: handle exception
		}
		  driver.navigate().back();
		  
	}
	  @SuppressWarnings("deprecation")
	public void ClickCart() {
		  try {
             Cart.click();
			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40000));
			  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		} catch (Exception e) {
			System.out.println("Cart is not functional");
			// TODO: handle exception
		}
//		  driver.navigate().back();
		  
	}
	  @SuppressWarnings("deprecation")
	public void ClickAddToCart() {
		  try {
             ADDToCart.click();
			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40000));
			  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		} catch (Exception e) {
			System.out.println("Add To Cart is not functional");
			// TODO: handle exception
		}
		 //driver.navigate().back();
		  
	}
	  public void verifyCompleteOrderText() {
		  String actualText = CompleteYourOrderText.getText();
		  String acceptedText = "Complete Your Order";
		  try {
			  Assert.assertEquals(actualText,acceptedText);
			  System.out.println(actualText);
            
			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40000));
		} catch (Exception e) {
			System.out.println("Text is not matched!");
			// TODO: handle exception
		}
		 //driver.navigate().back();
		  
	}
}
