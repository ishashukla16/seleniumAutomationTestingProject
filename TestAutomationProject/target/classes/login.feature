Feature: Login Feature
Scenario: positive login scenario
Given user is on main page
When user clicks on shop icon
And user clicks on home btn
Then user has three sliders

Scenario: for arrivals
Given user is on main page
When user clicks on shop icon
And user clicks on home btn
Then user has three arrivals

Scenario: for navigating
Given user is on main page
When user clicks on shop icon
And user clicks on home btn
Then user has three arrivals
And page is navigating so user can add book


Scenario: for discription
Given user is on main page
When user clicks on shop icon
And user clicks on home btn
Then user has three arrivals
And page is navigating so user can add book
Then click on description 
And there should be a description about book

Scenario: for review
Given user is on main page
When user clicks on shop icon
And user clicks on home btn
Then user has three arrivals
And page is navigating so user can add book
Then click on description 
And there should be a description about book
Then click on review 
And review of book is present

