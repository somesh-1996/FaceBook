Feature: Try to create an account in social media
Scenario: Login page

Given type the URL of the application
When type the username
And type the password
Then click the login button

Scenario: Create New Account

When click the create new Account
And click the firstname
And click the lastname
And click the phonenumber
And click the password
And click the date for the date of birth
And click the month for the date of birth
And click the year for the date of birth
And click the gender
Then click the login button