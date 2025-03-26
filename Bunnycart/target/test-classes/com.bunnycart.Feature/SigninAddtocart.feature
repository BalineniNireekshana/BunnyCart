Feature: 
Scenario: To sign in and add a product to cart
Given User opens the Browser
And User navigates to the "https://www.bunnycart.com/aquatic-plants/duckweed" webpage
When User clicks on Sign in link
And User enters the Sign in credentials
|Bunntcartdata.xlsx|
And User clicks on Sign in button
And User search for a product "aquatic Plants"
And User select a product
And user selects  quantity of "Pack of 50 Stems"
And User add a product to cart
And User close the browser