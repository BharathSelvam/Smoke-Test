package loginTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import basetest.BaseTests;
import io.qameta.allure.Description;

public class TestsLoginPage extends BaseTests {

	@Test
	@Description("Test Login with Invalid Login credentials")
	public void testLoginWithInvalidCredentials() {
		loginpage.setEmailID("incorrect_username");
		loginpage.setPassword("incorrect_password");
		loginpage.clickLoginButton();
		Assert.assertEquals(loginpage.getLoginErrorText(), "Incorrect username or password",
				"Error message for invalid login credentials in incorrect");
	}

	@Test
	@Description("Test Login with Valid Login credentials")
	public void testLoginWithValidCredentials() {
		loginpage.userLogin("bselvam@agatisys.com", "Welcome3#");
		String pageTitle = driver.getTitle();
		System.out.println("before test" + driver.getTitle());
		waitForElementToBeDisplayed(driver, pageTitle);
		Assert.assertEquals(pageTitle, "IQVIA: Organizations", "Wrong page is displayed");
		System.out.println("After test" + driver.getTitle());
	}
}