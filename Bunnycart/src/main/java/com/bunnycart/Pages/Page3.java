package com.bunnycart.Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.Status;
import com.bunnycart.Browser.Browser;
import com.bunnycart.Locators.Page3objects;
import com.bunnycart.Screenshot.Capture;

public class Page3 extends Browser {

    // Method to click the home page sign-in button
    public static void homepagesignin() {
    	extent.attachReporter(reporter);
		logger1=extent.createTest("Open Signin Page");
		logger1.log(Status.INFO,"Opening the signin page");
        try {
            // Set up WebDriverWait to wait for the home page sign-in button to be clickable
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            // Wait until the element is clickable and assign it to the WebElement
            WebElement homepagesigninbtn = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//*[@id=\'html-body\']/div[2]/header/div[1]/div/div/div/div/ul/li[5]/a")));
            // Click the home page sign-in button
            homepagesigninbtn.click();
            // Calls the homepagesignin method from the Page3objects class (though this line may not be necessary)
            Page3objects.homepagesignin();
            logger1.log(Status.PASS,"Clicking signin successfully");
        } catch (Exception e) {
            // Prints the exception message if an error occurs
            System.out.println(e.getMessage());
            logger1.log(Status.FAIL,"Sigin getting fail ");
        }
        extent.flush();
    }

    // Method to click the sign-in button
    public static void signinbutton() {
    	extent.attachReporter(reporter);
		logger1=extent.createTest("Click Signin Button");
		logger1.log(Status.INFO,"Cliking the signin button");
        try {
            // Clicks the sign-in button from Page3objects
            Page3objects.signinbutton().click();
            Thread.sleep(6000);
            logger1.log(Status.PASS,"Cliked signin button successfully");
            logger1.addScreenCaptureFromPath(Capture.screenShot("Sign In Button"));
        } catch (Exception e) {
            // Prints the exception message if an error occurs
            System.out.println(e.getMessage());
            logger1.log(Status.FAIL,"Clicking the signin button is fail");
        }
        extent.flush();
    }

    // Method to enter the email for sign-in
    public static void signinmail(String data) {
    	extent.attachReporter(reporter);
		logger1=extent.createTest("Enter the Email");
		logger1.log(Status.INFO,"Entering the Email");
        try {
            // Enters the email provided in the parameter into the sign-in email field
            Page3objects.signinmail().sendKeys(data);
            logger1.log(Status.PASS,"Entered Email successfully");
        } catch (Exception e) {
            // Prints the exception message if an error occurs
            System.out.println(e.getMessage());
            logger1.log(Status.FAIL,"Email getting fail to enter the data");
        }
        extent.flush();
    }

    // Method to enter the password for sign-in
    public static void signinpass(String data) {
    	extent.attachReporter(reporter);
		logger1=extent.createTest("Enter the Password");
		logger1.log(Status.INFO,"Entering the Password");
        try {
            // Enters the password provided in the parameter into the sign-in password field
            Page3objects.signinpass().sendKeys(data);
            logger1.log(Status.PASS,"Entered password successfully");
        } catch (Exception e) {
            // Prints the exception message if an error occurs
            System.out.println(e.getMessage());
            logger1.log(Status.FAIL,"password getting fail to enter the data");
        }
        extent.flush();
    }
   
}
