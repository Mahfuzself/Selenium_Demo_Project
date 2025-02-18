import org.testng.annotations.Test;

import pageObjects.Home;
import testBase.TestBase;

public class HomepageTest extends TestBase{
	private static final Home HOME2 = home;

	@Test
	public void NavigateHomePage() {
//		home.NavigateSignUp();
//		home.NavigateLogIn();
//		home.NavigateContactUs();
//		home.NavigateFAQ();
//		home.ClickFindMyTreatment();
		home.ClickAddToCart();
		home.ClickCart();
	}

}
