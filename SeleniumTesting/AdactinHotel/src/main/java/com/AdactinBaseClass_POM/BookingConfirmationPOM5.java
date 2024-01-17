package com.AdactinBaseClass_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirmationPOM5 {
	WebDriver driver;
	@FindBy(id="search_hotel")
	private WebElement searchElement;
	
	public WebElement getSearchElement() {
		return searchElement;
	}
	public BookingConfirmationPOM5(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
}
