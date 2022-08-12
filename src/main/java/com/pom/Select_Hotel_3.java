package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel_3 {
	public static WebDriver driver;

	@FindBy(id = "radiobutton_0")
	private WebElement Click_Radio_Button;

	@FindBy(xpath = "//input[@id='continue']")
	private WebElement Continue_Button;

	public Select_Hotel_3(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getClick_Radio_Button() {
		return Click_Radio_Button;
	}

	public WebElement getContinue_Button() {
		return Continue_Button;
	}

}
