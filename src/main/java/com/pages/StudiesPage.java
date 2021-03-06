package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StudiesPage {
	private WebDriver driver;

	public StudiesPage(WebDriver driver) {
		this.driver = driver;
	}

	// Studies Page Locators

	By userMenu = By.id("leftNavUsers");
	By roleMenu = By.id("leftNavRoles");
	By groupMenu = By.id("leftNavGroups");
	By reportMenu = By.id("leftNavReporting");
	By filter = By.id("grid-table-filter-input");

	By studyCreate = By.xpath(
			"//i[contains(@class,'material-icons app-section-action-link-icon')]/..//span[contains(text(),'Create')]");

	public CreateStudyPage clickStudyCreate() {
		driver.findElement(studyCreate).click();
		return new CreateStudyPage(driver);
	}

	public void searchStudy(String searchstring) {
		driver.findElement(filter).sendKeys(searchstring);
	}

	public RolesPage clickRoleMenu() {
		driver.findElement(roleMenu).click();
		return new RolesPage(driver);
	}
}