package loginTests;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.titleContains(pageTitle));
		Assert.assertEquals(pageTitle, "IQVIA: Organizations", "Wrong page is displayed");
	}
}