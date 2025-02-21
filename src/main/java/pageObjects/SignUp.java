package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class SignUp extends TestBase{
	@FindBy(xpath = "//input[@data-gtm-form-interact-field-id='0']")
	WebElement user_email;
	@FindBy(xpath ="(//input[@class='dnnFormInput'])[1]")
	WebElement First_Name;
	@FindBy(id ="div#dnn_ctr_Register_userForm>div:nth-of-type(3)>input")
	WebElement Last_Name;
	@FindBy(xpath = "input[aria-label='DisplayName']")
	WebElement display_Name;
	@FindBy(xpath = "(//input[@class='dnnFormInput'])[3]")
	WebElement Phone_Number;
	@FindBy(xpath  = "//input[@aria-label='Use the arrow keys to pick a date']")
	WebElement date_of_birth;
	@FindBy(id = "listprice")
	WebElement txt_listprice;
	@FindBy(xpath = "//input[@class='password-strength validate-success']")
	WebElement password;
	@FindBy(xpath ="//input[@class='password-confirm unmatched']")
	WebElement Confirm_Password;
	@FindBy(xpath = "//a[contains(@class,'btn btn-secondary')]") WebElement book;
	@FindBy (xpath = "(//img[@alt='muslim-couple-retreat'])[2]") WebElement link_mensRetreat;
	
	@FindBy(id = "#dnn_ctr_Register_registerButton")
	WebElement register;
	
	public SignUp() {
		 PageFactory.initElements(driver, this);	 
	 }
	public  void inputCylenderCapacity() {
		txt_cylendercapacity.sendKeys("5000");
		System.out.println("Test1");
	}
	public String AssertCylenderCapacityErrorMessage() {
		return cylender_capacity_Error.getText();
	}
	public void ClickRetreat() throws InterruptedException {
		link_mensRetreat.click();
		Thread.sleep(1000);
	}
	public void ClickBook() {
		new Actions(driver).moveToElement(book).perform();  

        //Step 2
//        el.Click();
		book.click();
	}

}
