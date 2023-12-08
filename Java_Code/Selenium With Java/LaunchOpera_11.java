package com.classWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class LaunchOpera_11 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.opera.driver","./drivers/operadriver.exe");
		
		WebDriver driver=new OperaDriver();
	}
	
}
