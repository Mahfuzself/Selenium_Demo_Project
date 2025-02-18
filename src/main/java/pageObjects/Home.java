package pageObjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
	@FindBy( xpath = "(//a[@class='nav-link cart'])[2]")
	WebElement Cart;
	@FindBy( xpath = " (//span[text()=\" Add to Cart \"])[1]")
	WebElement ADDToCart;
	
  public Home() {
	 PageFactory.initElements(driver, this);
	 
 }
	  public void NavigateSignUp() {
		  try {
			  SignUp.click();
			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		} catch (Exception e) {
			System.out.println("SignUp is not navigated");
			// TODO: handle exception
		}
		  driver.navigate().back();
		  
		
	}
	  public void NavigateLogIn() {
		  try {
			  LogIn.click();
			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		} catch (Exception e) {
			System.out.println("LogIn is not navigated");
			// TODO: handle exception
		}
		  driver.navigate().back();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		  
		
	}
	  public void NavigateContactUs() {
		  try {
			  ContactUs.click();
			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		} catch (Exception e) {
			System.out.println("Contact Us is not navigated");
			// TODO: handle exception
		}
		  driver.navigate().back();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		  
		
	}
	  public void NavigateFAQ() {
		  try {
			  FAQ.click();
			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		} catch (Exception e) {
			System.out.println("FAQ is not navigated");
			// TODO: handle exception
		}
		  driver.navigate().back();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	}
	  public void ClickFindMyTreatment() {
		  try {
             Treatment.click();
			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(400));
		} catch (Exception e) {
			System.out.println("Find My Treatment is not functional");
			// TODO: handle exception
		}
		  driver.navigate().back();
		  
	}
	  public void ClickCart() {
		  try {
             Cart.click();
			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40000));
		} catch (Exception e) {
			System.out.println("Cart is not functional");
			// TODO: handle exception
		}
//		  driver.navigate().back();
		  
	}
	  public void ClickAddToCart() {
		  try {
             ADDToCart.click();
			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40000));
		} catch (Exception e) {
			System.out.println("Add To Cart is not functional");
			// TODO: handle exception
		}
		 //driver.navigate().back();
		  
	}
}
