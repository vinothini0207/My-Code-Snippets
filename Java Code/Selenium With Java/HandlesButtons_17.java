package com.let_code_kaushik;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlesButtons_17 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		// launch chrome browser
		ChromeDriver driver=new ChromeDriver();
		
		//load letcode buttons url
		driver.get("https://letcode.in/buttons");
		
		// Get the X & Y co-ordinates
		WebElement element=driver.findElementById("position");
		Point point=element.getLocation();
		int x=point.getX();
		int y= point.getY();
		System.out.println("X => "+x+" Y => "+y);
		
		
		// Find the color of the button
	    WebElement element2=	driver.findElementById("color");
		String colorString=element2.getCssValue("background-color");
		System.out.println(colorString);
		
		// Find the height & width of the button
		 WebElement element3= driver.findElementById("property");
		 Dimension dimension= element3.getSize();
		 System.out.println(dimension);
		 System.out.println("Height:"+dimension.getHeight());
		 System.out.println("Width:"+dimension.getWidth());
		
		 
		 // Confirm button is disabled
		 boolean isEnable= driver.findElementById("isDisabled").isEnabled();
		 System.out.println("is enable:"+isEnable); 
		
		
		  driver.quit();
	}

}
