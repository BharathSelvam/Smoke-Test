package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateStudyPage {
	private WebDriver driver;

	public CreateStudyPage(WebDriver driver) {
		this.driver = driver;
	}

	By studyIDField = By.xpath("//input[@placeholder='ID']");
	By studyNameField = By.xpath("//input[@placeholder='Name']");
	By sponsorNameField = By.xpath("//input[@placeholder='Sponsor Name']");
	By protocolNumberField = By.xpath("//input[@placeholder='Protocol Number']");
	By therapeuticAreaField = By.xpath("//input[@placeholder='Therapeutic Area']");
	By protocolTitleField = By.xpath("//input[@placeholder='Protocol Title']");
	By descriptionField = By.xpath("//input[@placeholder='Description']");
	By clickSaveButton = By.id("createStudySaveButton");

	public void setstudyIDField(String studyID) {
		driver.findElement(studyIDField).sendKeys(studyID);
	}

	public void setstudyNameField(String studyname) {
		driver.findElement(studyNameField).sendKeys(studyname);
	}

	public void setsponsorNameField(String sponsorname) {
		driver.findElement(sponsorNameField).sendKeys(sponsorname);
	}

	public void setprotocolNumberField(String protocolNumber) {
		driver.findElement(protocolNumberField).sendKeys(protocolNumber);
	}

	public void settherapeuticAreaField(String therapeuticarea) {
		driver.findElement(therapeuticAreaField).sendKeys(therapeuticarea);
	}

	public void setprotocolTitleField(String protocolTitle) {
		driver.findElement(protocolTitleField).sendKeys(protocolTitle);
	}

	public void setdescriptionField(String description) {
		driver.findElement(descriptionField).sendKeys(description);
	}

	public void clickSaveButton() {
		driver.findElement(clickSaveButton).click();
	}
}
