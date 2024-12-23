package pageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class enterInsuranceData extends TestBase{
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
	//@FindBy(id="nextenterproductdata")
	// WebElement btn_next;
//  enterInsuranceData() {
//	 PageFactory.initElements(driver, this);
// }
}
