package com.bunnycart.stepdefinition;

import com.bunnycart.Browser.Browser;
import com.bunnycart.Pages.Page5;

import io.cucumber.java.en.And;

public class Signout {
	@And("User clicks on signout button")
	public void user_clicks_on_signout_button() throws Exception {
		Browser.init("Signout");
		
	    Page5.signoutlink();
	    Browser.closeBrowser();
	}
}
