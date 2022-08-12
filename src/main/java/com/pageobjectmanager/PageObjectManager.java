package com.pageobjectmanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.pom.Book_Hotel_4;
import com.pom.Login1;
import com.pom.Search_Hotel;
import com.pom.Select_Hotel_3;

public class PageObjectManager {
	public static WebDriver driver;

	public PageObjectManager(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public static Login1 getLoging1() {
		Login1 l1 = new Login1(driver);
		return l1;
	}

	public static Search_Hotel getSearch_Hotel() {
		Search_Hotel sh2 = new Search_Hotel(driver);
		return sh2;
	}

	public static Select_Hotel_3 getSelect_Hotel_3() {
		Select_Hotel_3 sh3 = new Select_Hotel_3(driver);
		return sh3;
	}
	

	public Book_Hotel_4 getBook_Hotel_4() {
		Book_Hotel_4 bh4 = new Book_Hotel_4(driver);
		return bh4;
	}

}
