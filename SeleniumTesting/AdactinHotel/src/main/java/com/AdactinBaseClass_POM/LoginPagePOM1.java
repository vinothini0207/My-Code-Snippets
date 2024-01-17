package com.AdactinBaseClass_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePOM1 {
	WebDriver driver;
	@FindBy(id="username")
  	  private WebElement userName;
	@FindBy(id="password")
    private WebElement password;
	@FindBy(id="login")
    private WebElement login;
	public WebElement getUserName() {
		return userName;
	}
	public WebElement getPassword() {
		return password;
}
	public WebElement getLogin() {
		return login;
	}
    public LoginPagePOM1(WebDriver driver) {
    	this.driver=driver;
    	PageFactory.initElements(driver,this);
    }

}
