package com.let_code_kaushik;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Capture_Screenshot_18 {

	private static Object object;

	public static void main(String[] args) throws IOException {
	 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	 ChromeDriver driver = new ChromeDriver();
	 driver.get("https://letcode.in/buttons");
	 File firstSrcFile= driver.getScreenshotAs(OutputType.FILE);
	 File destFile=new File("./snaps/img1.png");
	 FileHandler.copy(firstSrcFile, destFile);
	 
	 // element screenshot
	 WebElement element= driver.findElementById("home");
	 File eleSrcFile= element.getScreenshotAs(OutputType.FILE);
	 File eledestFile=new File("./snaps/img2.png");
	 FileHandler.copy(eleSrcFile, eledestFile);
	 
	 // section screenshot
	 WebElement infoElement= driver.findElementByClassName("content");
	 File secSrcFile= infoElement.getScreenshotAs(OutputType.FILE);
	 File secdestFile=new File("./snaps/img3.png");
	 FileHandler.copy(secSrcFile, secdestFile);
	 
	 driver.quit();
	 
	}

}
