package com.bunnycart.Pages;

import com.bunnycart.Browser.Browser;
import com.aventstack.extentreports.Status;
import com.bunnycart.Locators.Page1objects;
import com.bunnycart.Screenshot.Capture;

public class Page1 extends Browser {

    // Method to click the "Create Account" link on the page
    public static void clickCreateAccount() {
        extent.attachReporter(reporter);  
        logger1 = extent.createTest("Click create account link");  
        logger1.log(Status.INFO, "Clicking create account link");  
        
        try {
            // Clicks the "Create Account" link from the Page1objects locator
            Page1objects.clickcreateAccount().click();
            logger1.log(Status.INFO, "Successfully clicked the create account link");
        } catch (Exception e) {
           
            System.out.println(e);
            logger1.log(Status.FAIL, "Failed to click the create account link");
        }
        extent.flush();  
    }

    // Method to enter the first name in the form
    public static void firstName(String data) {
        extent.attachReporter(reporter); 
        logger1 = extent.createTest("Enter the First Name");  
        logger1.log(Status.INFO, "Entering the First Name");  
        
        try {
            // Clears the first name input field and enters the provided data
            Page1objects.enterFirstName().clear();
            Page1objects.enterFirstName().sendKeys(data);
            logger1.log(Status.PASS, "Successfully entered the first name");
        } catch (Exception e) {
           
            System.out.println(e);
            logger1.log(Status.FAIL, "Failed to enter the first name");
        }
        extent.flush();  
    }

    // Method to enter the last name in the form
    public static void lastName(String str) {
        extent.attachReporter(reporter);  
        logger1 = extent.createTest("Enter the Last Name");  
        logger1.log(Status.INFO, "Entering the Last Name"); 
        
        try {
            // Clears the last name input field and enters the provided data
            Page1objects.enterlastName().clear();
            Page1objects.enterlastName().sendKeys(str);
            logger1.log(Status.PASS, "Successfully entered the last name");
        } catch (Exception e) {
           
            System.out.println(e);
            logger1.log(Status.FAIL, "Failed to enter the last name");
        }
        extent.flush();  
    }

    // Method to enter the email address in the form
    public static void emailField(String str) {
        extent.attachReporter(reporter);  
        logger1 = extent.createTest("Enter the Email");  
        logger1.log(Status.INFO, "Entering the Email");  
        
        try {
            // Clears the email input field and enters the provided email address
            Page1objects.enterEmail().clear();
            Page1objects.enterEmail().sendKeys(str);
            logger1.log(Status.PASS, "Successfully entered the email");
        } catch (Exception e) {
           
            System.out.println("Email " + e);
            logger1.log(Status.FAIL, "Failed to enter the email address");
        }
        extent.flush();  
    }

    // Method to enter the password in the form
    public static void password(String str) {
        extent.attachReporter(reporter);  
        logger1 = extent.createTest("Enter the Password");  
        logger1.log(Status.INFO, "Entering the Password");  
        
        try {
            // Enters the provided password in the password input field
            Page1objects.enterPassword().sendKeys(str);
            logger1.log(Status.PASS, "Successfully entered the password");
        } catch (Exception e) {
            
            System.out.println("Password " + e);
            logger1.log(Status.FAIL, "Failed to enter the password");
        }
        extent.flush();  
    }

    // Method to enter the confirmation password in the form
    public static void confirmPassword(String str) {
        extent.attachReporter(reporter);  
        logger1 = extent.createTest("Enter the Confirm Password");  
        logger1.log(Status.INFO, "Entering the Confirm Password");  
        
        try {
            // Enters the provided confirmation password in the confirm password field
            Page1objects.enterConfirmPassword().sendKeys(str);
            logger1.log(Status.PASS, "Successfully entered the confirmation password");
        } catch (Exception e) {
           
            System.out.println("ConfirmPassword " + e);
            logger1.log(Status.FAIL, "Failed to enter the confirmation password");
        }
        extent.flush(); 
    }

    // Method to enter the mobile number in the form
    public static void mobileNumber(String str) {
        extent.attachReporter(reporter);  
        logger1 = extent.createTest("Enter the Mobile Number");  
        logger1.log(Status.INFO, "Entering the Mobile Number");  
        
        try {
            // Enters the provided mobile number in the mobile number input field
            Page1objects.enterNumber().sendKeys(str);
            logger1.log(Status.PASS, "Successfully entered the mobile number");
        } catch (Exception e) {
            
            System.out.println("Mobile number " + e);
            logger1.log(Status.FAIL, "Failed to enter the mobile number");
        }
        extent.flush();  
    }

    // Method to click the "Create Account" button and submit the form
    public static void create() {
        extent.attachReporter(reporter);  
        logger1 = extent.createTest("Click Create Button");  
        logger1.log(Status.INFO, "Clicking Create Button");  
        
        try {
            // Clicks the "Create Account" button to submit the form
            Page1objects.create().click();
            logger1.log(Status.PASS, "Successfully clicked the create button");
            
            // Captures a screenshot after clicking the create button
            logger1.addScreenCaptureFromPath(Capture.screenShot("Create Button"));
        } catch (Exception e) {
           
            System.out.println("Page1 - Create Account");
            logger1.log(Status.FAIL, "Failed to click the create button");
        }
        extent.flush();  
    }

    // Method to print a generic error message (for error handling)
    public static void errorMessage() {
    	
        // Prints a general error message and logs it
        System.out.println("Error in the text");
        logger1.log(Status.FAIL, "Error in the text");
    }
}
