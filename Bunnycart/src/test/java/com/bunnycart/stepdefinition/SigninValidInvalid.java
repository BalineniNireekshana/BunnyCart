package com.bunnycart.stepdefinition;

import com.bunnycart.Browser.Browser;
import com.bunnycart.Pages.Page3;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class SigninValidInvalid {
	
		@When("User clicks the link homepagesignin an account")
		public void user_clicks_the_link_homepagesignin_an_account() throws InterruptedException {
			Browser.init("Signin Button");
		    Page3.homepagesignin();
		}

		@And("User enters a invalid {string} in email textbox")
		public void user_enters_a_invalid_in_email_textbox(String string) throws InterruptedException {
			
			Page3.signinmail("");
		}

		@And("User enters a valid {string} in password textbox")
		public void user_enters_a_valid_in_password_textbox(String string) throws InterruptedException {
			
			Page3.signinpass("Niree@579");
		}

		@And("User clicks signin  account button.")
		public void user_clicks_signin_account_button() {
		    Page3.signinbutton();
		}
		
	     
		@When("User re-enters a email with valid data {string}")
		public void user_re_enters_a_email_with_valid_data(String string) {
			Page3.signinmail("nireekshanabalineni3019@gmail.com");
		}

		@And("User clicks signin button.")
		public void user_clicks_signin_button() {
			 Page3.signinbutton();
		}

	}

