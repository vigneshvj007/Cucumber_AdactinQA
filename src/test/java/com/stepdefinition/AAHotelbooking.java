package com.stepdefinition;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.baseclass.Base_Class;
import com.config.helper.fileReaderManager;
import com.pageobjectmanager.PageObjectManager;
import com.runner.Test_Runner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AAHotelbooking extends Base_Class {

	public static WebDriver driver = Test_Runner.driver;

	PageObjectManager pom = new PageObjectManager(driver);

	@Given("User launches the application")
	public void user_launches_the_application() throws IOException {
//		url("http://adactinhotelapp.com/");
		url(fileReaderManager.getinstanceFRM().getInstanceCR().geturl());
	}

	@When("User enter the username in the username field")
	public void user_enter_the_username_in_the_username_field() throws IOException {
		sendkeys(pom.getLoging1().getUsername(), fileReaderManager.getinstanceFRM().getInstanceCR().getusername());

	}

	@When("User enter the password in the password field")
	public void user_enter_the_password_in_the_password_field() throws IOException {
		sendkeys(pom.getLoging1().getPassword(), fileReaderManager.getinstanceFRM().getInstanceCR().getpassword());
	}

	@Then("User clicks the login button and navigate to search hotel page")
	public void user_clicks_the_login_button_and_navigate_to_search_hotel_page() {
		(pom.getLoging1().getLoginbutton()).click();
	}

	@When("User select the location from the dropdown")
	public void user_select_the_location_from_the_dropdown() {
		dropdown(pom.getSearch_Hotel().getHotel_Location(), "New York");
	}

	@When("User select the hotel from the dropdown")
	public void user_select_the_hotel_from_the_dropdown() {
		dropdown(pom.getSearch_Hotel().getHotel_Name(), "Hotel Sunshine");
	}

	@When("User select the room type from the dropdown")
	public void user_select_the_room_type_from_the_dropdown() {
		dropdown(pom.getSearch_Hotel().getRoom_Type(), "Standard");
	}

	@When("User select the number of rooms from the dropdown")
	public void user_select_the_number_of_rooms_from_the_dropdown() {
		dropdown(pom.getSearch_Hotel().getNo_Of_Rooms(), "7");
	}

	@When("User enter the check in date in the check in field")
	public void user_enter_the_check_in_date_in_the_check_in_field() {
		sendkeys(pom.getSearch_Hotel().getCheckin_Date(), "09/09/2024");
	}

	@When("User enter the check out date in the check out field")
	public void user_enter_the_check_out_date_in_the_check_out_field() {
		sendkeys(pom.getSearch_Hotel().getCheckout_Date(), "12/09/2024");
	}

	@When("User enter the number of adults per room in adults per room field")
	public void user_enter_the_number_of_adults_per_room_in_adults_per_room_field() {
		dropdown(pom.getSearch_Hotel().getAdults_Per_Room(), "2");
	}

	@When("User enter the number of children per room in children per room field")
	public void user_enter_the_number_of_children_per_room_in_children_per_room_field() {
		dropdown(pom.getSearch_Hotel().getChilld_Per_Room(), "1");
	}

	@Then("User clicks the search button")
	public void user_clicks_the_search_button() {
		(pom.getSearch_Hotel().getSearch_Button()).click();
	}

	@When("User click the radio button to select the hotel")
	public void user_click_the_radio_button_to_select_the_hotel() {
		click(pom.getSelect_Hotel_3().getClick_Radio_Button());
	}

	@Then("User click the continue button")
	public void user_click_the_continue_button() {
		click(pom.getSelect_Hotel_3().getContinue_Button());
	}

	@When("User enter his first name in the First name field")
	public void user_enter_his_first_name_in_the_first_name_field() {
		sendkeys(pom.getBook_Hotel_4().getFirst_Name(), "Vignesh");
	}

	@When("User enter his last name in the last name field")
	public void user_enter_his_last_name_in_the_last_name_field() {
		sendkeys(pom.getBook_Hotel_4().getLast_Name(), "J");
	}

	@When("User enter the required address in the Billing address field")
	public void user_enter_the_required_address_in_the_billing_address_field() {
		sendkeys(pom.getBook_Hotel_4().getAddress_Of_The_Hotel(), "New York, USA");
	}

	@When("User enter the {int} digit credit number in the Credit card number field")
	public void user_enter_the_digit_credit_number_in_the_credit_card_number_field(Integer int1) throws IOException {
		sendkeys(pom.getBook_Hotel_4().getCredit_Card_Number(),
				fileReaderManager.getinstanceFRM().getInstanceCR().getcreditscardno());
	}

	@When("User select the credit card type from the dropdown")
	public void user_select_the_credit_card_type_from_the_dropdown() {
		dropdown(pom.getBook_Hotel_4().getCredit_Card_Type(), "AMEX");
	}

	@When("User select the Expiry month of credit card from the dropdown")
	public void user_select_the_expiry_month_of_credit_card_from_the_dropdown() {
		dropdown(pom.getBook_Hotel_4().getExpiry_Date(), "9");
	}

	@When("User select the Expiry year of credit card from the dropdown")
	public void user_select_the_expiry_year_of_credit_card_from_the_dropdown() {
		dropdown(pom.getBook_Hotel_4().getExpiry_Year(), "2022");
	}

	@When("User enter the {int} digit CVV number in the CVV number field")
	public void user_enter_the_digit_cvv_number_in_the_cvv_number_field(Integer int1) throws IOException {
		sendkeys(pom.getBook_Hotel_4().getCVV(), fileReaderManager.getinstanceFRM().getInstanceCR().getcvv());
	}

	@Then("User clicks the Book Now button")
	public void user_clicks_the_book_now_button() {
		click(pom.getBook_Hotel_4().getBook_Now_Button());
	}

}
