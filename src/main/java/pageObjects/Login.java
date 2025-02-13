package pageObjects;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class Login  extends TestBase{
	@FindBy (id="dnn_ctr_Login_Login_DNN_txtUsername")
	WebElement inputEmailAddress;
	@FindBy (id="dnn_ctr_Login_Login_DNN_txtPassword")
	WebElement inputPasswordt;
	
	
 public	Login (){
		PageFactory.initElements(driver, this);
	}

}
