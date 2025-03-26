package com.bunnycart.stepdefinition;

import io.cucumber.java.en.Given;





import com.bunnycart.Browser.Browser;

import com.bunnycart.Pages.Page4;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;


public class Addmultipleproducts {
	@Given("the user is on the homepage")
	public void the_user_is_on_the_homepage() throws Exception {
		Browser.init("Add Multiple Products");
	    Browser.openBrowser("chrome");
	   
	    Browser.navigateToUrl("https://www.bunnycart.com/");
	}
	@And("User clicks the signin link")
	public void user_clicks_the_signin_link() {
	    Page4.openSignInPage();
	}
	@And("User enters the email {string}")
	public void user_enters_the_email(String string) {
	    Page4.inputEmail("nireekshanabalineni3019@gmail.com");
	}
	@And("User enters the password {string}")
	public void user_enters_the_password(String string) {
	    Page4.inputPassword("Niree@579");
	}
	@And("User clicks the sign-in button")
	public void user_clicks_the_sign_in_button() {
	    Page4.clickSignInButton();
	}
	@When("User searches for {string} in the search bar")
	public void user_searches_for_in_the_search_bar(String string) throws InterruptedException {
	    Page4.searchForProduct1("Red Water Lily");
	    
	    }

	@And("User clicks {string} button.")
	public void user_clicks_button(String string) throws InterruptedException {
	    Page4.addProductToCart();
	}
	@And("User search for {string} in the search bar")
	public void user_search_for_in_the_search_bar(String string) throws InterruptedException {
	    Page4.SearchForProduct2("Water Lettuce");
	    
	}

	@And("User verifies the products and close cart")
	public void user_verifies_the_products_and_close_cart() throws InterruptedException {
	   
	    Browser.closeBrowser();
	}
	


}
