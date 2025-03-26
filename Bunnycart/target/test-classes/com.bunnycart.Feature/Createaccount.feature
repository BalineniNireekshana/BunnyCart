Feature: Checking User Registration
Scenario Outline: To check the Creating New customer account page with valid and invalid data
Given User opens the browser
And User navigates to the application Url "https://www.bunnycart.com"
When User clicks the link Create an account
And User enters the valid '<FirstName>' in firstname textbox
And User enters the valid '<LastName>' in lastname textbox
And User enters the invalid '<InvalidEmail>' in email textbox
And User enters the valid '<Password>' in password textbox
And User enters the valid '<ConfirmPassword>' in confirm password textbox
And User enters the valid '<Mobile Number>' number
And User clicks Create an account button.
Then User verifies the error message displayed under the email textbox
When User re-enters the email with valid data '<ValidEmail>'
And User clicks Create an account button.
And User closes the browser
Examples: 
|FirstName|LastName|InvalidEmail|Password|ConfirmPassword|Mobile Number|error|ValidEmail|
|Balineni|Nireekshana|nireee.com|Niree@579|Niree@579|9121916535|Please enter a valid email address (Ex: johndoe@domain.com).|nireekshanabalineni193@gmail.com|