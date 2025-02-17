package pageObjects;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import reusableComponents.propertiesOperations;
import testBase.TestBase;

public class Login  extends TestBase{
	@FindBy (xpath = "(//div[contains(@class,'loginGroup register')]//a)[2]")
	WebElement clickLogin;
	@FindBy (id="dnn_ctr_Login_Login_DNN_txtUsername")
	WebElement inputEmailAddress;
	@FindBy (id="dnn_ctr_Login_Login_DNN_txtPassword")
	WebElement inputPassword;
	@FindBy (xpath = "//input[@name='dnn$ctr$Login$Login_DNN$chkCookie']/following-sibling::span[1]")
	WebElement checkbox;
	@FindBy (xpath = "//a[@title='Login']")
	WebElement LoginBtn;
	
	
	
 public	Login  () throws Exception{
		PageFactory.initElements(driver, this);
	}
 public void clickLoginBtn() {
	clickLogin.click();
 }
 public void ChecckedRememberLogin() {
	 boolean isChecked = checkbox.isSelected();
	 if (!checkbox.isSelected()) {
		    checkbox.click();  // Select the checkbox if it is not already checked
		    System.out.println("Checkbox was not checked, now it is checked.");
		} else {
		    System.out.println("Checkbox is already checked.");
		}
	 }
 public void enterUserName_Password() throws Exception {
	 String email1 = propertiesOperations.getPropertyValueByKey("username");
	 String password = propertiesOperations.getPropertyValueByKey("password");
	 System.out.println("Name " +email1);
	 inputEmailAddress.sendKeys(email1);
	 inputPassword.sendKeys(password);
	 
 }
 public void clickLogin() {
		LoginBtn.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 }
 

}
