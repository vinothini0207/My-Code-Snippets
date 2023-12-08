package com.let_code_kaushik;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome_11{
	
	public static void main(String[]args) {
		//// launch chrome browser
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		//load google url, copy the url and paste it.
		driver.get("https://google.com/");
		
	}
}
