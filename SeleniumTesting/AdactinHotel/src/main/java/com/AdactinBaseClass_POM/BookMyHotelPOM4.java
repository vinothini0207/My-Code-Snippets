package com.AdactinBaseClass_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookMyHotelPOM4 {
	
	WebDriver driver;
	@FindBy(name="first_name")
	private WebElement firstName;
	@FindBy(name="last_name")
	private WebElement lastName;
	@FindBy(id="address")
	private WebElement address;
	@FindBy(id="cc_num")
	private WebElement creditCardNo;
	@FindBy(id="cc_type")
	private WebElement creditCardType;
	@FindBy(id="cc_exp_month")
	private WebElement expiryMonth;
	@FindBy(id="cc_exp_year")
	private WebElement expiryYear;
	@FindBy(name="cc_cvv")
	private WebElement cvvNo;
	@FindBy(id="book_now")
	private WebElement bookNowBtn;
	@FindBy(id="cancel")
	private WebElement cancelBtn;
	
	public WebElement getFirstName() {
		return firstName;
	}
	public WebElement getLastName() {
		return lastName;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCreditCardNo() {
		return creditCardNo;
	}
	public WebElement getCreditCardType() {
		return creditCardType;
	}
	public WebElement getExpiryMonth() {
		return expiryMonth;
	}
	public WebElement getExpiryYear() {
		return expiryYear;
	}
	public WebElement getCvvNo() {
		return cvvNo;
	}
	public WebElement getBookNowBtn() {
		return bookNowBtn;
	}
	public WebElement getCancelBtn() {
		return cancelBtn;
	}
	
	public BookMyHotelPOM4(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
