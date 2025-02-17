import org.testng.annotations.Test;

import testBase.TestBase;

public class loginTest   extends TestBase{
@Test
	public void successfullyLogin () throws Exception {
	    logIn.clickLoginBtn();
//	logIn.clickMotorCycle();
		logIn.enterUserName_Password();
		logIn.ChecckedRememberLogin();
		logIn.clickLogin();
	}

}
