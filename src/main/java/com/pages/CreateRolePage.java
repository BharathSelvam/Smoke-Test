package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateRolePage {
	private WebDriver driver;

	public CreateRolePage(WebDriver driver) {
		this.driver = driver;
	}

	// Locators
	
	By roleNameField = By.xpath("//input[@placeholder='Role Name']");
	
	By roleDescField = By.xpath("//input[@placeholder='Role Description']");
	
	By selectAll = By.xpath("(//span[@class='checkbox-element'])[1]");
	
	By cancelButton = By.xpath("//button[text()='Cancel']");
	
	By saveButton = By.xpath("//button[text()='Save']");

	public void setroleNameField(String roleName) {
		driver.findElement(roleNameField).sendKeys(roleName);
	}
	
	public void setroleDescField(String roleDesc) {
		driver.findElement(roleDescField).sendKeys(roleDesc);
	}
	
	public void selectAllPermissions() {
		driver.findElement(selectAll).click();
	}
	
	public void clickCancelButton() {
		driver.findElement(cancelButton).click();
	}
	
	public void clickSaveButton() {
		driver.findElement(saveButton).click();
	}
	
}
