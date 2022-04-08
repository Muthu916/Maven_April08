Feature: Hotel Booking In Adactin Application
Scenario: Login_Page
Given user Launch the Application
When user Enter The Username In Username Field
And user Enter the Password In Password Field
Then user Click On the Login Button And It Navigates To The Search Hotel Page

Scenario: Search Hotel Page
When user Enter The Hotel Location
And user Select The Hotel
And user Select The Room Type
And user Select The Number Of Rooms
And user Fill The Check-In Date
And user Fill The Check-Out Date
And user Select How Many Adults In Per Room
And user Select How Many Children In Per Room
Then user Click On the Search Button And It Navigates To The Select Hotel Page

Scenario: Select Hotel Page
When user Click The Radio Button For Selected Hotel
Then user Click On the Continue Button And It Navigates To The Book Hotel Page

Scenario: Book Hotel Page
When user Enter The First Name
And user Enter The Last Name
And user Enter The Billing Address
And user Enter The Credit Card Number
And user Select The Credit Card Type
And user Select The Month And Year In Expiry Date
And user Select The CVV Number
Then user Click On The Book Now Button And It Navigates To The Booking Confirmation Page

Scenario: Hotel Booking Confirmation Page
When user Click The My Itinerary Button And It Navigates To The Booked Itinerary Page

Scenario: Logout_Page
When user Click The Logout Button And It Navigates To The Logout Page