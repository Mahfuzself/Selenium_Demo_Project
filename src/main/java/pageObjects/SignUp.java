package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class SignUp extends TestBase{
	@FindBy(id="make")
	WebElement dd_make;
	@FindBy(id ="model")
	WebElement dd_model;
	@FindBy(xpath ="//input[@id=\"cylindercapacity\"]")
	WebElement txt_cylendercapacity;
	@FindBy(xpath = "//input[@id=\"engineperformance\"]")
	WebElement txt_enginecapacityElement;
	@FindBy(id = "dateofmanufacture")
	WebElement date_dateofmanufacture;
	@FindBy(id = "numberofsets")
	WebElement dd_numberofsets;
	@FindBy(id = "listprice")
	WebElement txt_listprice;
	@FindBy(id = "annualmileage")
	WebElement txt_annualmileage;
	@FindBy(id="nextenterinsurantdata")
	WebElement btn_next;
	@FindBy(xpath = "//a[contains(@class,'btn btn-secondary')]") WebElement book;
	@FindBy (xpath = "(//img[@alt='muslim-couple-retreat'])[2]") WebElement link_mensRetreat;
	
	@FindBy(xpath = "//span[normalize-space(text())='Must be a number between 1 and 2000']")
	WebElement cylender_capacity_Error;
	
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
