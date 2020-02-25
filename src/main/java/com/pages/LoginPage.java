package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	private WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// Login Page Objects

	By emailIDField = By.id("loginEmail");
	By passwordField = By.id("loginPassword");
	By loginButton = By.id("loginSubmit");
	By forgotPasswordLink = By.id("forgotPassword");
	By loginErrorText = By.xpath("//div[contains(@class,'login-page--login-alert login-page--login-error')]");

	// Login Page Interactions

	public void setEmailID(String emailID) {
		driver.findElement(emailIDField).clear();
		driver.findElement(emailIDField).sendKeys(emailID);
	}

	public void setPassword(String password) {
		driver.findElement(passwordField).clear();
		driver.findElement(passwordField).sendKeys(password);
	}

	public StudiesPage clickLoginButton() {
		driver.findElement(loginButton).click();
		return new StudiesPage(driver);
	}

	public boolean isLoginButtonEnabled() {
		return driver.findElement(loginButton).isEnabled();
	}

	public String getLoginErrorText() {
		return driver.findElement(loginErrorText).getText();
	}

	public boolean is_EmailID_Field_Displayed() {
		return driver.findElement(emailIDField).isDisplayed();
	}

	public boolean is_Password_Field_Displayed() {
		return driver.findElement(passwordField).isDisplayed();
	}

	public boolean is_Login_Button_Displayed() {
		return driver.findElement(passwordField).isDisplayed();
	}

	public boolean is_ForgotPasswordLink_Displayed() {
		return driver.findElement(forgotPasswordLink).isDisplayed();
	}

}
