package com.bunnycart.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.bunnycart.Browser.Browser;

public class Page4objects extends Browser {
    
    // Locators for various elements on the page using XPath
    public static By signinlink = By.xpath("//*[@id=\'html-body\']/div[2]/header/div[1]/div/div/div/div/ul/li[5]/a");
    public static By email = By.xpath("//input[@id='email-login']");
    public static By password = By.xpath("//input[@id='pass-login']");
    public static By signinbutton = By.xpath("//button[@class='action login primary']");
    public static By searchproduct1 = By.xpath("//input[@id='search']");
    public static By addtocart = By.xpath("//button[@class='action primary tocart']");
    public static By searchproduct2 = By.xpath("//input[@id='search']");
    
    
    // Method to get the Sign-In link
    public static WebElement signin() {
        return driver.findElement(signinlink); // Returns the sign-in link element
    }

    // Method to get the email input field for sign-in
    public static WebElement enteremailfield() {
        return driver.findElement(email); // Returns the input field for email during sign-in
    }

    // Method to get the password input field for sign-in
    public static WebElement enterpasswordfield() {
        return driver.findElement(password); // Returns the input field for password during sign-in
    }

    // Method to get the Sign-In button
    public static WebElement buttonsigin() {
        return driver.findElement(signinbutton); // Returns the sign-in button element
    }

    // Method to get the first product search input field
    public static WebElement searchproduct1() {
        return driver.findElement(searchproduct1); // Returns the first product search input field
    }

    // Method to get the "Add to Cart" button
    public static WebElement addcart() {
        return driver.findElement(addtocart); // Returns the "Add to Cart" button element
    }

    // Method to get the second product search input field
    public static WebElement Searchproduct2() {
        return driver.findElement(searchproduct2); // Returns the second product search input field
    }

    

   
}
