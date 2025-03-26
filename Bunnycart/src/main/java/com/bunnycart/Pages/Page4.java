package com.bunnycart.Pages;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.Status;
import com.bunnycart.Browser.Browser;

import com.bunnycart.Locators.Page4objects;
import com.bunnycart.Screenshot.Capture;

public class Page4 extends Browser {
	static WebDriver wait;

    // Method to open the Sign In page by clicking the Sign In link
    public static void openSignInPage() {
    	extent.attachReporter(reporter);
		logger1=extent.createTest("Click Signin Link");
		logger1.log(Status.INFO,"clicking the signin link");
        try {
            Page4objects.signin().click(); // Clicking on the Sign In link
            logger1.log(Status.PASS,"Clicking signin successfully");
        } catch (Exception e) {
            System.out.println("Error opening Sign In page: " + e.getMessage()); // Prints error message if any occurs
            logger1.log(Status.FAIL,"Sigin getting fail ");
        }
        extent.flush();
    }

    // Method to input the email into the email field for login
    public static void inputEmail(String email) {
    	extent.attachReporter(reporter);
		logger1=extent.createTest("Enter the Email");
		logger1.log(Status.INFO,"Entering the Email");
        try {
            Page4objects.enteremailfield().sendKeys(email); // Entering email into the email field
            logger1.log(Status.PASS,"Entered Email successfully");
        } catch (Exception e) {
            System.out.println("Error entering email: " + e.getMessage()); // Prints error message if any occurs
            logger1.log(Status.FAIL,"Email getting fail to enter the data");
        }
        extent.flush();
    }

    // Method to input the password into the password field for login
    public static void inputPassword(String password) {
    	extent.attachReporter(reporter);
		logger1=extent.createTest("Enter the Password");
		logger1.log(Status.INFO,"Entering the Password");
        try {
            Page4objects.enterpasswordfield().sendKeys(password); // Entering password into the password field
            logger1.log(Status.PASS,"Entered password successfully");
        } catch (Exception e) {
            System.out.println("Error entering password: " + e.getMessage()); // Prints error message if any occurs
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
            Page4objects.buttonsigin().click(); // Clicking the Sign In button
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            // Wait until the search field is visible after login (to ensure successful login)
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='search']"))); 
            logger1.log(Status.PASS,"Cliked signin button successfully");
        } catch (Exception e) {
            System.out.println("Error clicking Sign In button: " + e.getMessage()); // Prints error message if any occurs
            logger1.log(Status.FAIL,"Clicking the signin button is fail");
        }
        extent.flush();
    }

    // Method to search for a product by typing its name in the search field
    public static void searchForProduct1(String product) {
    	extent.attachReporter(reporter);
		logger1=extent.createTest("Search for Product1");
		logger1.log(Status.INFO,"Searching the product1");
        try {
            Page4objects.searchproduct1().sendKeys(product); // Typing the product name in the search field
            Page4objects.searchproduct1().submit(); // Pressing Enter to search for the product
            WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));  // 10 seconds timeout
            WebElement addtocart = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='action primary tocart']"))); // Replace with the actual ID or locator of the Add to Cart button
            addtocart.click();
            logger1.log(Status.PASS,"searched the product successfully");
            logger1.addScreenCaptureFromPath(Capture.screenShot("Add Multiple Products"));
        } catch (Exception e) {
            System.out.println("Error searching product: " + e.getMessage()); // Prints error message if any occurs
            logger1.log(Status.FAIL,"Searching the product getting fail ");
        }
        extent.flush();
    }

    // Method to add the selected product to the cart
    public static void addProductToCart() {
    	extent.attachReporter(reporter);
		logger1=extent.createTest("Click Add To cart");
		logger1.log(Status.INFO,"Click the add to cart");
        try {
            Page4objects.addcart().click(); // Clicking on the "Add to Cart" button
            logger1.log(Status.PASS,"Clicked add to cart button successfully");
        } catch (Exception e) {
            System.out.println("Error adding product to cart: " + e.getMessage()); // Prints error message if any occurs
            logger1.log(Status.FAIL,"Clicking add to cart button is getting failed");
        }
        extent.flush();
    }

    // Method to search for a second product
    public static void SearchForProduct2(String product) {
    	extent.attachReporter(reporter);
		logger1=extent.createTest("Search for Product2");
		logger1.log(Status.INFO,"Searching the product2");
        try {
            Page4objects.Searchproduct2().sendKeys(product); // Searching for the second product
            logger1.log(Status.PASS,"searched the product successfully");
        } catch (Exception e) {
            System.out.println("Error searching product: " + e.getMessage()); // Prints error message if any occurs
            logger1.log(Status.FAIL,"Searching the product getting fail ");
        }
        extent.flush();
    }   
    
}
