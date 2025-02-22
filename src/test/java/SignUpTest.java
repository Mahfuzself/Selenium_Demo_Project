import org.testng.annotations.Test;

import testBase.TestBase;

public class SignUpTest extends TestBase{
   @Test
   public void Signup() {
	   fakename.fetchFakeName();
	   String firstname = fakename.firstName;
	   String lastname = fakename.lastName;
	   home.NavigateSignUp();
	   signUp.InputEmail(firstname,lastname);
	   signUp.InputFirstName(firstname);
	   signUp.InputLastName(lastname);
	   signUp.InputdisplayName(firstname, lastname);
	   signUp.InputPhoneNumber();
	   signUp.EnterdateofBirth();
	   signUp.InputPassword();
	   signUp.InputConfirmPassword();
	   signUp.EnterRegister();
	  
   }

}
