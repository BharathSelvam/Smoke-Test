package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrganizationsPage {
	
	private WebDriver driver;
	
	public OrganizationsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By AltavozLink = By.linkText("Altavoz");
	
	public StudiesPage clickAltavozLink() {
		driver.findElement(AltavozLink).click();
		return new StudiesPage(driver);
	}
}
