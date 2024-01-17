package com.Runner;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.AdactinBaseClass_POM.BaseClass;
import com.AdactinBaseClass_POM.BookMyHotelPOM4;
import com.AdactinBaseClass_POM.BookingConfirmationPOM5;
import com.AdactinBaseClass_POM.LoginPagePOM1;
import com.AdactinBaseClass_POM.SearchHotelPOM2;
import com.AdactinBaseClass_POM.SelectHotelPOM3;

public class RunnerClass extends BaseClass {
	public static void main(String[] args) throws InterruptedException, IOException {

		// login

		Browser_Launch("chrome");
		LoginPagePOM1 pom = new LoginPagePOM1(driver);
		Get("https://adactinhotelapp.com/");
		Sleep(2000);
		SendKeys(pom.getUserName(), "Mathushri");
		SendKeys(pom.getPassword(), "CO4UHO");
		Click(pom.getLogin());

		// search hotel
		
		SearchHotelPOM2 searchHotel2 = new SearchHotelPOM2(driver);
		DropDownSelect(searchHotel2.getLocation(), "value", "New York");
		DropDownSelect(searchHotel2.getHotelsType(), "value", "Hotel Sunshine");
		DropDownSelect(searchHotel2.getRoomType(), "value", "Double");
		DropDownSelect(searchHotel2.getNumberOfRooms(), "visibletext", "2 - Two");
		SendKeys(searchHotel2.getCheckInDate(), "20/01/2024");
		SendKeys(searchHotel2.getCheckOutDate(), "22/01/2024");
		DropDownSelect(searchHotel2.getAdultPerRoom(), "index", "1");
		DropDownSelect(searchHotel2.getChilrenPerRoom(), "visibletext", "0 - None");
		Click(searchHotel2.getSearchRoomButton());
		
		// select hotel
		
		SelectHotelPOM3 selectHotelPOM3= new SelectHotelPOM3(driver);
		Click(selectHotelPOM3.getSelect());
		Click(selectHotelPOM3.getContinueBtn());
		
		// book my hotel
		
		BookMyHotelPOM4 bookMy= new BookMyHotelPOM4(driver);
		SendKeys(bookMy.getFirstName(),"Mathushri");
		SendKeys(bookMy.getLastName(),"Mathu");
		SendKeys(bookMy.getAddress(), "no.23 Shanthi Colony,Anna Nagar-636095,TamilNaduN");
		SendKeys(bookMy.getCreditCardNo() ,"1234 1234 1234 1234");
		SendKeys(bookMy.getCreditCardType() ,"VISA");
	   DropDownSelect(bookMy.getExpiryMonth(), "index", "6");
	   DropDownSelect(bookMy.getExpiryYear(), "value", "2026");
	   SendKeys(bookMy.getCvvNo(), "450");
	   Click(bookMy.getBookNowBtn());
	   Thread.sleep(5000);
	   // bookingConfirmation

	   TakeScreenShot("./Screenshots/bookingScreensht.png");
	    
	   System.out.println("Take Screenshot Successfully :)   ");
		
	}

}


//BookingConfirmationPOM5 booking= new BookingConfirmationPOM5(driver);
//ScrollDown(booking.getSearchElement());
//ScrollRange("\"window.scrollBy(0,-1000);\""); //-->  "window.scrollBy(0,-1000);"