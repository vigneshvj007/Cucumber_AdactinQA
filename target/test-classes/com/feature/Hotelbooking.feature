Feature: Hotel booking with adactin Application

Scenario: Login Functionality
Given User launches the application
When User enter the username in the username field
And User enter the password in the password field
Then User clicks the login button and navigate to search hotel page

Scenario: Search Hotel Page
When User select the location from the dropdown
And User select the hotel from the dropdown
And User select the room type from the dropdown
And User select the number of rooms from the dropdown
And User enter the check in date in the check in field
And User enter the check out date in the check out field
And User enter the number of adults per room in adults per room field
And User enter the number of children per room in children per room field
Then User clicks the search button

Scenario: Select the Hotel
When User click the radio button to select the hotel
Then User click the continue button

Scenario: Book A Hotel
When User enter his first name in the First name field
And User enter his last name in the last name field
And User enter the required address in the Billing address field
And User enter the 16 digit credit number in the Credit card number field
And User select the credit card type from the dropdown
And User select the Expiry month of credit card from the dropdown
And User select the Expiry year of credit card from the dropdown
And User enter the 3 digit CVV number in the CVV number field
Then User clicks the Book Now button

