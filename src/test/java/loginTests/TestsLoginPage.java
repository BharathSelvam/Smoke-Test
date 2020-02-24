package loginTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import basetest.BaseTests;
import com.altavoz.pages.LoginPage;

public class TestsLoginPage extends BaseTests {
	
	@Test
	public void testLoginWithInvalidCredentials() {
		loginpage.setEmailID("incorrect_username");
		loginpage.setPassword("incorrect_password");
		loginpage.clickLoginButton();
		Assert.assertEquals(loginpage.getLoginErrorText(), "Incorrect username or password",
				"Error message for invalid login credentials in incorrect");
	}
	
	@Test
	public void testLoginWithValidCredentials() {
		loginpage.setEmailID("bselvam@agatisys.com");
		loginpage.setPassword("Welcome3#");
		loginpage.clickLoginButton();
	}
}