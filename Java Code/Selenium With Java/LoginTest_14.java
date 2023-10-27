package com.let_code_kaushik;

import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest_14 {

	public static void main(String[] args) {
		// launch browser
		System.setProperty("webdriver.chrome.driver", 
				"./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		// load URL
			driver.get("https://letcode.in/");
			
		// click login button
			driver.findElementByLinkText("Log in").click();
			
		//  enter email
			driver.findElementByName("email")
			  .sendKeys("abc@gmail.com"); // like vinothini21@gmail.com
			
		// enter password
			driver.findElementByName("password").sendKeys("your password"); // like vino123
			
		//CLick login button
			driver.findElementByXPath("//button[text()='LOGIN']").click();
	}

}
