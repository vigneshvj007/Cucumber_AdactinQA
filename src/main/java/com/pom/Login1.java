package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login1 {
public static WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"username\"]")
	private WebElement username;
	
	@FindBy (id = "password")
	private WebElement password;
	
	@FindBy(id = "login")
	private WebElement loginbutton;
	

	public Login1(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}
	
	
	
	
	
	
}
