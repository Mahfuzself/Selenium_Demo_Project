package pageObjects;

import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class Login  extends TestBase{
	
	
	
	
 public	Login (){
		PageFactory.initElements(driver, this);
	}

}
