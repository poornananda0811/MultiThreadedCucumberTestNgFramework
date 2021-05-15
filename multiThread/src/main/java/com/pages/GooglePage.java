package com.pages;

import org.openqa.selenium.WebDriver;

import com.locators.PageLocators;

public class GooglePage {
	
	private WebDriver driver;
	
	/**
	 * I have created the locators in separate class
	 */
	
	public GooglePage(WebDriver driver) {
		this.driver = driver;
	}

	// 3. page actions: features(behaviour) of the page the form of methods:
	
	public String getLoginPageTitle() {
		return driver.getTitle();
	}
	
	
	
	
	
}
