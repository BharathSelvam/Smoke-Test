package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StudiesPage {
	private WebDriver driver;
	
	public StudiesPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//Studies Page Locators
	
	By userMenu = By.id("leftNavUsers");
	By roleMenu = By.id("leftNavRoles");
	By groupMenu = By.id("leftNavGroups");
	By reportMenu = By.id("leftNavReporting");
	
	
}
