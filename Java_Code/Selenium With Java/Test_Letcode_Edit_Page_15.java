package com.let_code_kaushik;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Letcode_Edit_Page_15 {

	public static void main(String[] args) {
		// launch chrome browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		
		// load edit page URL
		driver.get("https://letcode.in/edit");
		
		// enter full name
		driver.findElementById("fullName").sendKeys("Vinothini");
		
		// append a text and press keyboard tab
		driver.findElementById("join").sendKeys(" Girl",Keys.TAB);
		
		// what is inside the text box
		String insideText=driver.findElementById("getMe").getAttribute("value");
		System.out.println(insideText);
		
		// clear the text
		driver.findElementById("clearMe").clear();
		
		//confirm edit field is disabled
		boolean isDisabled=driver.findElementById("noEdit").isEnabled();
		System.out.println(isDisabled);
		
		// confirm text is readonly
		String isReadonly=driver.findElementById("dontwrite").getAttribute("readonly");
		System.out.println(isReadonly);
		
	//	Quit the browser
		driver.quit();
	}

}
