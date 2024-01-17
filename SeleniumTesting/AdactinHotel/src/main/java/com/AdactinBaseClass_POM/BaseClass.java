package com.AdactinBaseClass_POM;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import javax.swing.JScrollBar;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.github.dockerjava.api.command.InspectExecResponse.Container;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice.Return;

public class BaseClass {
	public static WebDriver driver;
	static Actions action ;
	static Robot robot;
	static Select select;
	static JavascriptExecutor js = (JavascriptExecutor) driver;
     static WebDriverWait wait;
public static void Browser_Launch(String type) {
		if (type.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (type.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (type.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver();
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
	}

	public static void Get(String urlString) {
		driver.get(urlString);
	
	}

	public static void SendKeys(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static void Click(WebElement button) {
//		wait=new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.visibilityOf(button)).click();
//		
		button.click();
	}

	public static void Close() {
		driver.close();
	}

	public static void Quit() {
		driver.quit();
	}

	public static void NavigateTo(String url) {
		driver.navigate().to(url);
	}

	public static void NavigateBack() {
		driver.navigate().back();
		
	}

	public static void NavigateForward() {
		driver.navigate().forward();
		
	}

	public static void NavigateRefresh() {
		driver.navigate().refresh();
		
	}

	public static void TakeScreenShot(String path) throws IOException {
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
		File destFile = new File(path);
		FileHandler.copy(srcFile, destFile);
	}

	public static void Wait(int time) throws InterruptedException {
		driver.wait(time);
	}

	public static void ActionsClick() {
		action = new Actions(driver);
		action.click().build().perform();
	}

	public static void ActionsClick(WebElement clickElement) {
		action = new Actions(driver);
		action.click(clickElement).build().perform();
		
	}

	public static void ActionsContextClick(WebElement clickElement) {
		action = new Actions(driver);
		action.contextClick(clickElement).build().perform();
	}

	public static void ActionsDoubleClick(WebElement clickElement) {
		action = new Actions(driver);
		action.doubleClick(clickElement).build().perform();
	}

	public static void ActionsMoveElement(WebElement moveElement) {
		action = new Actions(driver);
		action.moveToElement(moveElement).build().perform();
	}

	public static void ActionsDragDrop(WebElement source, WebElement destination) {
		action = new Actions(driver);
		action.dragAndDrop(source, destination);
	}

	public static void ActionsSendKeys(String value) {
		action = new Actions(driver);
		action.sendKeys(value);
	}

	public static void ActionsClickHold(WebElement clickElement) {
		action = new Actions(driver);
		action.clickAndHold(clickElement).build().perform();
	}

	public static void ActionsMoveElementRange(WebElement targetElement, int xValue, int yValue) {
		action = new Actions(driver);
		action.moveToElement(targetElement, xValue, yValue).build().perform();
	}

	public static String GetCurrentUrl() {
		return driver.getCurrentUrl();
	}

	public static void Alerts(String type) {
		if(type.equalsIgnoreCase("accept")) {
            driver.switchTo().alert().accept();
		}

		else if(type.equalsIgnoreCase("dismiss")) {
			 driver.switchTo().alert().dismiss();
		}

		else if(type.equalsIgnoreCase("getText")) {
			String text =  driver.switchTo().alert().getText();
			System.out.println(text);
		}
	}
	public static void AlertSendKeys(String sendElement) {
			driver.switchTo().alert().sendKeys(sendElement);
		}

	public static String GetPageTitle() {
			return driver.getPageSource();
		}
	public static Robot RobotMethod() throws AWTException {
		Robot robot = new Robot();
		return robot;
	}

	public static void RobotKeyPress(int keyCode) throws AWTException {
		Robot robot = RobotMethod();
		robot.keyPress(keyCode);
	}

	public static void RobotKeyRelease(int keycode) throws AWTException {
		Robot rb = RobotMethod();
		rb.keyRelease(keycode);
	}

	public static void Sleep(int time) throws InterruptedException {
		Thread.sleep(time);
	}

	public static void Maximize() {
		driver.manage().window().maximize();
	}

	public static String GetTitle() {
		return driver.getTitle();
	}

	public static void FrameIndex(int index) {
		driver.switchTo().frame(index);
	}

	public static void FrameId_Name(String value) {
		driver.switchTo().frame(value);
	}

	public static void FrameWebElement(WebElement element) {
		driver.switchTo().frame(element);
	}

	public static void HomeFrame() {
		driver.switchTo().defaultContent();
	}

	public static void ParentFrame() {
		driver.switchTo().parentFrame();
	}

	public static void ExecuteJsScript(String string, WebElement scrollElement) {
		js.executeScript(string, scrollElement);
	}

	public static void ExecuteJsScript(String string) {
		js.executeScript(string);
	}
	

	public static void DropDownSelect(WebElement element,String type, String value) {
		Select select=new Select(element);
		if(type.equalsIgnoreCase("index")){
			Integer integer=Integer.parseInt(value);
			select.selectByIndex(integer);
		}
		else if(type.equalsIgnoreCase("value")){
			select.selectByValue(value);
		}

		else if(type.equalsIgnoreCase("visibletext")){
			select.selectByVisibleText(value);
		}
		
	}
	public static void DropDownDeSelect(WebElement element,String type, String value) {
		 select=new Select(element);
		if(type.equalsIgnoreCase("index")){
			Integer integer=Integer.parseInt(value);
			select.deselectByIndex(integer);
		}
		else if(type.equalsIgnoreCase("value")){
			select.deselectByValue(value);
		}

		else if(type.equalsIgnoreCase("visibletext")){
			select.deselectByVisibleText(value);
		}
		else if(type.equalsIgnoreCase("all")){
			select.deselectAll();
		}
		
	}
	public static Set<String> GetWindowHandles() {
		return driver.getWindowHandles();
	}

	public static boolean IsMultiple() {
		return select.isMultiple();
	}

	public static List<WebElement> GetOptions() {
		return select.getOptions();
	}

	public static WebElement GetFirstSelectedOptions() {
		return select.getFirstSelectedOption();
	}

	public static List<WebElement> GetAllSelectedOptions() {
		return select.getAllSelectedOptions();
	}

	public static boolean IsSelected(WebElement element) {
		return element.isSelected();
	}

	public static boolean IsDisplayed(WebElement displayElement) {
		return displayElement.isDisplayed();
	}

	public static boolean IsEnabled(WebElement enableElement) {
		return enableElement.isEnabled();
	}

	public static String GetText(WebElement textElement) {
		return textElement.getText();
	}

	public static String GetAttribute(WebElement element, String value) {
		return element.getAttribute(value);
	}

	public static void ScrollUp() {
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
	}

	public static void ScrollDown() {
		js.executeScript("window.scrollTo(0, 0);");
	}
	public static void ScrollDown(WebElement scroll) {
	   js.executeScript("arguments[0].scrollIntoView();", scroll);
	}
	public static void ScrollRange(String scrollPath) {
		js.executeScript(scrollPath);
	}
	
}
