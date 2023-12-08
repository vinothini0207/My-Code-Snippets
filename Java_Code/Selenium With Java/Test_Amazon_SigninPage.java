package com.classWork;

import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Amazon_SigninPage {

	public static void main(String[] args) throws InterruptedException {
		// launch chrome browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		// load URL
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		
		// click signin btn
		driver.findElementByXPath("//div[.='Hello, sign in']").click();
		Thread.sleep(3000);
		// Enter email or mobile number
		driver.findElementById("ap_email").sendKeys("vinivino098@gmail.com");// your mail id
		Thread.sleep(3000);
		//click Continue btn
		driver.findElementById("continue").click();
		Thread.sleep(3000);
		// Enter password
		driver.findElementById("ap_password").sendKeys("12345678");
		Thread.sleep(3000);
		// click sign in button
		driver.findElementById("signInSubmit").click();
	}

}
