package com.classWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchIE_11 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver","./drivers/IEDriverServer.exe");
		
       WebDriver driver=new InternetExplorerDriver();
       
	}
}
