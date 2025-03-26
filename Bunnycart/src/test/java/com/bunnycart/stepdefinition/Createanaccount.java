package com.bunnycart.stepdefinition;
import org.testng.Assert;

import com.bunnycart.Browser.Browser;
import com.bunnycart.Locators.Page1objects;
import com.bunnycart.Pages.Page1;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Createanaccount {

@Given("User opens the browser")
public void user_opens_the_browser() throws Exception {
	Browser.init("Create an account");
    Browser.openBrowser("chrome");
}
@And("User navigates to the application Url {string}")
public void user_navigates_to_the_application_url(String string) throws Exception {
    Browser.navigateToUrl("https://www.bunnycart.com/");
}
@When("User clicks the link Create an account")
public void user_clicks_the_link_create_an_account() {
    Page1.clickCreateAccount();
}
@And("User enters the valid {string} in firstname textbox")
public void user_enters_the_valid_in_firstname_textbox(String string) {
    Page1.firstName("Balineni");
}
@And("User enters the valid {string} in lastname textbox")
public void user_enters_the_valid_in_1stname_textbox(String string) {
    Page1.lastName("Nireekshana");
}
@And("User enters the invalid {string} in email textbox")
public void user_enters_the_invalid_in_email_textbox(String string) {
    Page1.emailField("nireekshanabalinenigmail.com");
}
@And("User enters the valid {string} in password textbox")
public void user_enters_the_valid_in_password_textbox(String string) {
    Page1.password("Niree@579");
}
@And("User enters the valid {string} in confirm password textbox")
public void user_enters_the_valid_in_confirm_password_textbox(String string) {
    Page1.confirmPassword("Niree@579");
}
@And("User enters the valid {string} number")
public void user_enters_the_valid_number(String string) {
   Page1.mobileNumber("9121916535");
}
@And("User clicks Create an account button.")
public void user_clicks_create_an_account_button() {
    Page1.create();
}
@Then("User verifies the error message displayed under the email textbox")
public void user_verifies_the_error_message_displayed_under_the_email_textbox() throws InterruptedException {
	String errorMessage=Page1objects.geterrorMessage().getText();
	Assert.assertTrue(errorMessage.contains("Please enter a valid email address")); 

}
@When("User re-enters the email with valid data {string}")
public void user_re_enters_the_email_with_valid_data(String string) {
   Page1.emailField("nireekshanabalineni193@gmail.com");
}
@And("User closes the browser")
public void user_closes_the_browser() throws InterruptedException {
	
    Browser.closeBrowser();
}

}