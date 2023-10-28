package com.let_code_kaushik;

import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation_Letcode_16 {

	public static void main(String[] args) throws InterruptedException {
	 // launch Chrome browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
//		// load buttons page URL
//		driver.get("https://letcode.in/buttons");
//		Thread.sleep(3000);  // waiting same URL in 30sec
//		
//		// get current URL
//		String url =driver.getCurrentUrl();
//		System.out.println("Button page url:"+url);
//		Thread.sleep(3000);
//		
//		// click goto home button
//		driver.findElementById("home").click();
//		
//		// Goto Home and come back here using driver command
//		String homeURl= driver.getCurrentUrl();
//		System.out.println("Home page url:"+homeURl);
//		Thread.sleep(3000);
//		
//		// click back button navigate to button page
//		driver.navigate().back();
//		System.out.println("Returns to button page:"+driver.getCurrentUrl());
//		
//		// refresh the page
//		driver.navigate().refresh();
//		
//		// go to another url
		driver.navigate().to("https://letcode.in/signin");
		driver.navigate().forward();
	}

}
