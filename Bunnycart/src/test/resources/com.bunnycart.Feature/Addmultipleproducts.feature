Feature: Sign In and Add Multiple Products to Cart
Scenario: Add multiple products to the cart after logging in
Given the user is on the homepage
And User clicks the signin link
And User enters the email "<Email>"
And User enters the password "<Password>"
And User clicks the sign-in button
When User searches for "<Product1>" in the search bar
And User clicks "Add to Cart" button.
When User search for "<Product2>" in the search bar
And User clicks "Add to Cart" button.
And User verifies the products and close cart

Examples:
|Email|Password|Product1|Product2|
|nireekshanabalineni3019@gmail.com|Niree@579|Red Water Lily|Water Lettuce|
    