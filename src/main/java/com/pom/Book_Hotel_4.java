package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Hotel_4 {
public static WebDriver driver;

@FindBy(xpath = "//input[@id='first_name']")
private WebElement First_Name;

@FindBy(id = "last_name")
private WebElement Last_Name;

@FindBy(id = "address")
private WebElement Address_Of_The_Hotel;

@FindBy(id = "cc_num")
private WebElement Credit_Card_Number;

@FindBy(id = "cc_type")
private WebElement Credit_Card_Type;

@FindBy(id = "cc_exp_month")
private WebElement Expiry_Date;

@FindBy(id = "cc_exp_year")
private WebElement Expiry_Year;

@FindBy(id = "cc_cvv")
private WebElement CVV;

@FindBy(id = "book_now")
private WebElement Book_Now_Button;

public Book_Hotel_4(WebDriver driver2) {
this.driver=driver2;
PageFactory.initElements(driver, this);
}

public WebElement getFirst_Name() {
	return First_Name;
}

public WebElement getLast_Name() {
	return Last_Name;
}

public WebElement getAddress_Of_The_Hotel() {
	return Address_Of_The_Hotel;
}

public WebElement getCredit_Card_Number() {
	return Credit_Card_Number;
}

public WebElement getCredit_Card_Type() {
	return Credit_Card_Type;
}

public WebElement getExpiry_Date() {
	return Expiry_Date;
}

public WebElement getExpiry_Year() {
	return Expiry_Year;
}

public WebElement getCVV() {
	return CVV;
}

public WebElement getBook_Now_Button() {
	return Book_Now_Button;
}

}
