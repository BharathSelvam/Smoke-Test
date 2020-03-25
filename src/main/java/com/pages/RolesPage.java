package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RolesPage {
	private WebDriver driver;

	public RolesPage(WebDriver driver) {
		this.driver = driver;
	}

	// Locators

	By RoleCreate = By.xpath("//i[contains(@class,'material-icons app-section-action-link-icon')]/"
			+ "..//span[contains(text(),'Create')]");

	public CreateRolePage clickRoleCreate() {
		driver.findElement(RoleCreate).click();
		return new CreateRolePage(driver);
	}

}
