import org.testng.annotations.Test;

import testBase.TestBase;

public class SignUpTest extends TestBase{
   @Test
   public void Signup() {
	   home.NavigateSignUp();
	   signUp.InputFirstName();
	   signUp.InputLastName();
	   signUp.InputEmail();
   }

}
