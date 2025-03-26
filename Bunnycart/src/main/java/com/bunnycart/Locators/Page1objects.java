package com.bunnycart.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.bunnycart.Browser.Browser;

public class Page1objects extends Browser {

    // Locators for various elements on the page using XPath
    public static By createaccount = By.xpath("//*[@class='customer-register-link']");
    public static By firstname = By.xpath("//input[@id='firstname']");
    public static By lastname = By.xpath("//input[@id='lastname']");
    public static By email = By.xpath("//input[@id='popup-email_address']");
    public static By password = By.xpath("//input[@id='popupPassword']");
    public static By confirmpassword = By.xpath("//input[@id='password-confirmation']");
    public static By number = By.xpath("//input[@id='mobilenumber']");
    public static By createbutton = By.xpath("//button[@title='Create an Account']");
    public static By errormessage = By.xpath("//div[@id='popup-email_address-error' and contains(@class, 'mage-error')]");

    // Method to click the "Create Account" link
    public static WebElement clickcreateAccount() {
        return driver.findElement(createaccount); // Returns the element to click on
    }

    // Method to get the First Name input field
    public static WebElement enterFirstName() {
        return driver.findElement(firstname); // Returns the input field for the first name
    }

    // Method to get the Last Name input field
    public static WebElement enterlastName() {
        return driver.findElement(lastname); // Returns the input field for the last name
    }

    // Method to get the Email input field
    public static WebElement enterEmail() {
        return driver.findElement(email); // Returns the input field for the email
    }

    // Method to get the Password input field
    public static WebElement enterPassword() {
        return driver.findElement(password); // Returns the input field for the password
    }

    // Method to get the Confirm Password input field
    public static WebElement enterConfirmPassword() {
        return driver.findElement(confirmpassword); // Returns the input field for confirm password
    }

    // Method to get the Mobile Number input field
    public static WebElement enterNumber() {
        return driver.findElement(number); // Returns the input field for the mobile number
    }

    // Method to get the "Create" button element
    public static WebElement create() {
        return driver.findElement(createbutton); // Returns the "Create Account" button element
    }

    // Method to get the error message element when there is an error with the email
    public static WebElement geterrorMessage() {
        return driver.findElement(errormessage); // Returns the error message element
    }
}
