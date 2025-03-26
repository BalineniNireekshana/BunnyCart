package com.bunnycart.Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.Status;
import com.bunnycart.Browser.Browser;
import com.bunnycart.Locators.Page5objects;
import com.bunnycart.Screenshot.Capture;

public class Page5 extends Browser {
    
    // Method to open the Sign In page by clicking the Sign In link on the homepage
    public static void homepagesignin() {
    	extent.attachReporter(reporter);
		logger1=extent.createTest("Open Signin Page");
		logger1.log(Status.INFO,"Opening the signin page");
        try {
            // Create a WebDriverWait to wait for the Sign In link to be clickable
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            // Wait until the Sign In link is clickable, then click it
            WebElement homepagesigninlink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='panel header']//a[@class='customer-login-link'][normalize-space()='Sign In']")));
            homepagesigninlink.click();
            // Call the homepagesignin() method from Page5objects
            Page5objects.homepagesignin();
            logger1.log(Status.PASS,"Clicking signin successfully");
        } catch (Exception e) {
            System.out.println("Error in homepagesignin: " + e.getMessage()); // Logs any exception that occurs
            logger1.log(Status.FAIL,"Sigin getting fail ");
        }
        extent.flush();
    }

    // Method to click the Sign In button
    public static void buttonsigin() {
    	extent.attachReporter(reporter);
		logger1=extent.createTest("Click Signin Button");
		logger1.log(Status.INFO,"Cliking the signin button");
        try {
            Page5objects.signinbutton().click(); // Clicking the Sign In button
            logger1.log(Status.PASS,"Cliked signin button successfully");
        } catch (Exception e) {
            System.out.println("Error clicking Sign In button: " + e.getMessage()); // Logs any exception that occurs
            logger1.log(Status.FAIL,"Clicking the signin button is fail");
        }
        extent.flush();
    }

    // Method to enter the email address in the Sign In form
    public static void signinemail(String data) {
    	extent.attachReporter(reporter);
		logger1=extent.createTest("Enter the Email");
		logger1.log(Status.INFO,"Entering the Email");
        try {
            Page5objects.signinmail().sendKeys(data); // Entering the provided email address into the email field
            logger1.log(Status.PASS,"Entered Email successfully");
            
        } catch (Exception e) {
            System.out.println("Error entering email: " + e.getMessage()); // Logs any exception that occurs
            logger1.log(Status.FAIL,"Email getting fail to enter the data");
        }
        extent.flush();
    }

    // Method to enter the password in the Sign In form
    public static void signinpassword(String data) {
    	extent.attachReporter(reporter);
		logger1=extent.createTest("Enter the Password");
		logger1.log(Status.INFO,"Entering the Password");
        try {
            Page5objects.signinpass().sendKeys(data); // Entering the provided password into the password field
            logger1.log(Status.PASS,"Entered password successfully");
        } catch (Exception e) {
            System.out.println("Error entering password: " + e.getMessage()); // Logs any exception that occurs
            logger1.log(Status.FAIL,"password getting fail to enter the data");
        }
        extent.flush();
    }

    // Method to log out by clicking the Sign Out link
    public static void signoutlink() {
    	extent.attachReporter(reporter);
		logger1=extent.createTest("Click SignOut Link");
		logger1.log(Status.INFO,"Clicking signout link");
        try {
        	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
             WebElement signOutLink = wait.until(ExpectedConditions.elementToBeClickable(Page5objects.signout()));
             signOutLink.click();
            logger1.log(Status.PASS,"Clicking signout successfully");
            logger1.addScreenCaptureFromPath(Capture.screenShot("SignOut Link"));
        } catch (Exception e) {
            System.out.println("Error clicking Sign Out link: " + e.getMessage()); // Logs any exception that occurs
            logger1.log(Status.FAIL,"Clicking signout is getting failed");
        }
        extent.flush();
    }
}
