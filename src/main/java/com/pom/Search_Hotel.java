package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {
	public static WebDriver driver;

	@FindBy(id = "location")
	private WebElement Hotel_Location;
	
	@FindBy(id = "hotels")
	private WebElement Hotel_Name;
	
	@FindBy(id = "room_type")
	private WebElement Room_Type;
	
	@FindBy(id = "room_nos")
	private WebElement No_Of_Rooms;
	
	@FindBy(xpath = "//input[@id='datepick_in']")
	private WebElement Checkin_Date;
	
	@FindBy(xpath = "//input[@id='datepick_out']")
	private WebElement Checkout_Date;
	
	@FindBy(id = "adult_room")
	private WebElement Adults_Per_Room;
	
	@FindBy(id = "child_room")
	private WebElement Chilld_Per_Room;
	
	@FindBy(xpath = "(//input[@class='reg_button'])[1]")
	private WebElement Search_Button;

	public Search_Hotel(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getHotel_Location() {
		return Hotel_Location;
	}

	public WebElement getHotel_Name() {
		return Hotel_Name;
	}

	public WebElement getRoom_Type() {
		return Room_Type;
	}

	public WebElement getNo_Of_Rooms() {
		return No_Of_Rooms;
	}

	public WebElement getCheckin_Date() {
		return Checkin_Date;
	}

	public WebElement getCheckout_Date() {
		return Checkout_Date;
	}

	public WebElement getAdults_Per_Room() {
		return Adults_Per_Room;
	}

	public WebElement getChilld_Per_Room() {
		return Chilld_Per_Room;
	}

	public WebElement getSearch_Button() {
		return Search_Button;
	}
	
	
	
	
}
