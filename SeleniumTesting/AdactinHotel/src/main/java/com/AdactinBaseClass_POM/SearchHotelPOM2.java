package com.AdactinBaseClass_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPOM2 {
	WebDriver driver;
	@FindBy(id="location")
	private WebElement location;
	@FindBy(id="hotels")
	private WebElement hotelsType;
	@FindBy(id="room_type")
	private	WebElement roomType;
	@FindBy(id="room_nos")
	private WebElement numberOfRooms;
	@FindBy(id="datepick_in")
	private WebElement checkInDate;
	@FindBy(id="datepick_out")
	private WebElement checkOutDate;
	@FindBy(id="adult_room")
	private WebElement adultPerRoom;
	@FindBy(name="child_room")
	private WebElement chilrenPerRoom;
	@FindBy(name="Submit")
	private WebElement searchRoom;
	
	public WebElement getLocation() {
		return location;
	}
	public WebElement getHotelsType() {
		return hotelsType;
	}
	public WebElement getRoomType() {
		return roomType;
	}
	public WebElement getNumberOfRooms() {
		return numberOfRooms;
	}
	public WebElement getCheckInDate() {
		return checkInDate;
	}
	public WebElement getCheckOutDate() {
		return checkOutDate;
	}
	public WebElement getAdultPerRoom() {
		return adultPerRoom;
	}
	public WebElement getChilrenPerRoom() {
		return chilrenPerRoom;
	}
	public WebElement getSearchRoomButton() {
		return searchRoom;
	}
	public SearchHotelPOM2(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


}
