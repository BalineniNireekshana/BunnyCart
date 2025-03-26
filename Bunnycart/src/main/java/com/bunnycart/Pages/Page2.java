package com.bunnycart.Pages;

import org.openqa.selenium.support.ui.WebDriverWait;
import com.aventstack.extentreports.Status;
import com.bunnycart.Browser.Browser;
import com.bunnycart.Locators.Page2objects;
import com.bunnycart.Screenshot.Capture;

public class Page2 extends Browser {
	static WebDriverWait wait; 
	
    // Method to open the Sign In page
    public static void openSignInPage() {
    	extent.attachReporter(reporter);
		logger1=extent.createTest("Click Signin Link");
		logger1.log(Status.INFO,"clicking the signin link");
        try {
            Page2objects.signin().click(); // Clicking on the Sign In link
            logger1.log(Status.PASS,"Clicking signin successfully");
        } catch (Exception e) {
            System.out.println("Error opening Sign In page: " + e.getMessage());
            logger1.log(Status.FAIL,"Sigin getting fail ");
        }
        extent.flush();
    }

    // Method to input the email in the email field
    public static void inputEmail(String email) {
    	extent.attachReporter(reporter);
		logger1=extent.createTest("Enter the Email");
		logger1.log(Status.INFO,"Entering the Email");
        try {
            Page2objects.enteremailfield().sendKeys(email); // Entering email into the email field
            logger1.log(Status.PASS,"Entered Email successfully");
        } catch (Exception e) {
            System.out.println("Error entering email: " + e.getMessage());
            logger1.log(Status.FAIL,"Email getting fail to enter the data");
        }
        extent.flush();
    }

    // Method to input the password in the password field
    public static void inputPassword(String password) {
    	extent.attachReporter(reporter);
		logger1=extent.createTest("Enter the Password");
		logger1.log(Status.INFO,"Entering the Password");
        try {
            Page2objects.enterpasswordfield().sendKeys(password); // Entering password into the password field
            logger1.log(Status.PASS,"Entered password successfully");
        } catch (Exception e) {
            System.out.println("Error entering password: " + e.getMessage());
            logger1.log(Status.FAIL,"password getting fail to enter the data");
        }
        extent.flush();
    }

    // Method to click the Sign In button
    public static void clickSignInButton() {
    	extent.attachReporter(reporter);
		logger1=extent.createTest("Click Signin Button");
		logger1.log(Status.INFO,"Cliking the signin button");
        try {
            Page2objects.buttonsigin().click(); // Clicking the Sign In button
            logger1.log(Status.PASS,"Cliked signin button successfully");
        } catch (Exception e) {
            System.out.println("Error clicking Sign In button: " + e.getMessage());
            logger1.log(Status.FAIL,"Clicking the signin button is fail");
        }
        extent.flush();
    }

    // Method to search for a product
    public static void searchForProduct(String product) {
    	extent.attachReporter(reporter);
		logger1=extent.createTest("Search for Product");
		logger1.log(Status.INFO,"Searching the product");
        try {
            Page2objects.searchproduct().sendKeys(product); // Typing the product name in the search field
            logger1.log(Status.PASS,"searched the product successfully");
        } catch (Exception e) {
            System.out.println("Error searching product: " + e.getMessage());
            logger1.log(Status.FAIL,"Searching the product getting fail ");
        }
        extent.flush();
    }

    // Method to select a product from the search results
    public static void selectFirstProduct() {
    	extent.attachReporter(reporter);
		logger1=extent.createTest("Select First product");
		logger1.log(Status.INFO,"Selcteing the first product");
        try {
            Page2objects.selectProduct().click();// Selecting the first product in the results
            logger1.log(Status.PASS,"selected first product successfully");
        } catch (Exception e) {
            System.out.println("Error selecting product: " + e.getMessage());
            logger1.log(Status.FAIL,"selecting the first product is getting failed");
        }
        extent.flush();
    }

    // Method to click on the product quantity (if applicable)
    public static void selectProductQuantity() {
    	extent.attachReporter(reporter);
		logger1=extent.createTest("Select the Quantity");
		logger1.log(Status.INFO,"Selecting the quantity");
        try {
            Page2objects.clickquantity().click(); // Clicking on the quantity field
            logger1.log(Status.PASS,"Selected the quantity successfully");
        } catch (Exception e) {
            System.out.println("Error selecting quantity: " + e.getMessage());
            logger1.log(Status.FAIL,"Selecting the quantity is getting failed");
        }
        extent.flush();
    }

    // Method to add the selected product to the cart
    public static void addProductToCart() {
    	extent.attachReporter(reporter);
		logger1=extent.createTest("Click Add To cart");
		logger1.log(Status.INFO,"Click the add to cart");
        try {
            Page2objects.addcart().click(); // Clicking on the "Add to Cart" button
            logger1.log(Status.PASS,"Clicked add to cart button successfully");
            logger1.addScreenCaptureFromPath(Capture.screenShot("Add To Cart"));
            
        } catch (Exception e) {
            System.out.println("Error adding product to cart: " + e.getMessage());
            logger1.log(Status.FAIL,"Clicking add to cart button is getting failed");
        }
        extent.flush();
    }

}
