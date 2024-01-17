package com.AdactinBaseClass_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelPOM3 {

	WebDriver driver;
	@FindBy(id="radiobutton_0")
	private WebElement select;
	@FindBy(id="continue")
	private WebElement continueBtn;
	
	public WebElement getSelect() {
		return select;
	}

	public WebElement getContinueBtn() {
		return continueBtn;
	}

	public SelectHotelPOM3(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	 
}
