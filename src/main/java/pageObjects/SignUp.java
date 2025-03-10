package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class SignUp extends TestBase{
	
	@FindBy(xpath = "//input[@aria-label='Email']")
	WebElement user_email;
	@FindBy(xpath ="(//input[@class='dnnFormInput'])[1]")
	WebElement First_Name;
	@FindBy(xpath  ="(//input[@class='dnnFormInput'])[2]")
	WebElement Last_Name;
	@FindBy(xpath  = "//input[@aria-label='DisplayName']")
	WebElement display_Name;
	@FindBy(xpath = "//input[@inputmode='text']")
	WebElement Phone_Number;
	@FindBy(xpath  = "(//label[contains(.,'Date of birth')]/following::input)[1]")
	WebElement date_of_birth;
	@FindBy(id = "listprice")
	WebElement txt_listprice;
	@FindBy(xpath = "//input[@aria-label='Password']")
	WebElement password;
	@FindBy(xpath ="//input[@aria-label='PasswordConfirm']")
	WebElement Confirm_Password;
	@FindBy(xpath = "//a[contains(@class,'btn btn-secondary')]") WebElement book;
	@FindBy (xpath = "(//img[@alt='muslim-couple-retreat'])[2]") WebElement link_mensRetreat;
	
	@FindBy(id = "#dnn_ctr_Register_registerButton")
	WebElement register;
	
	public SignUp() {
		 PageFactory.initElements(driver, this);	 
	 }
	
	
	
	public void InputFirstName(String firstname) {
	
//		String firstname = fakename.firstName;
		First_Name.sendKeys(firstname);
		System.out.println(firstname);
		
	}
	public void InputLastName(String lastname) {
		fakename.fetchFakeName();
//			String lastname = fakename.lastName;
			Last_Name.sendKeys(lastname);
			System.out.println(lastname);
			
		}
	public void InputEmail(String firstname, String lastname) {
		fakename.fetchFakeName();
//			String lastname = fakename.lastName;
//			String firstname = fakename.firstName;
			String email = firstname+lastname+"@yopmail.com";
			user_email.click();
			user_email.sendKeys(email);
			System.out.println(email);
			
		}
	public void InputdisplayName(String firstname,String lastname) {
		display_Name.click();
		display_Name.sendKeys((firstname+lastname));
	}
	public void InputPhoneNumber() {
		Phone_Number.click();
		Phone_Number.sendKeys("4133248551");
	}
	public void InputPassword() {
		password.click();
	   password.sendKeys("Test@1234");
	}
	public void InputConfirmPassword() {
		    Confirm_Password.click();
		   Confirm_Password.sendKeys("Test@1234");
		}
	public void EnterRegister() {
		   register.click();
		}
	public void EnterdateofBirth() {
		date_of_birth.click();
		date_of_birth.sendKeys("Feb 01, 2007");
	}

}
