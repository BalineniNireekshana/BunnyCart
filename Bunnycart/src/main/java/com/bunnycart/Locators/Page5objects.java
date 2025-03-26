package com.bunnycart.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.bunnycart.Browser.Browser;

public class Page5objects extends Browser {
    
    // Locators for various elements on the page using XPath and CSS Selector
    public static By homepagesignin = By.xpath("//div[@class='panel header']//a[@class='customer-login-link'][normalize-space()='Sign In']");
    public static By signinbutton = By.cssSelector("button[id='send2-login'] span");
    public static By signinmail = By.xpath("//input[@id='email-login']");
    public static By signinpass = By.xpath("//input[@id='pass-login']");
    public static By signout = By.xpath("//li[@class='link authorization-link create_an_account .login-link']");

    
    // Method to get the homepage Sign In link
    public static WebElement homepagesignin() {
        return driver.findElement(homepagesignin); // Returns the home page sign-in link element
    }

    // Method to get the Sign In button
    public static WebElement signinbutton() {
        return driver.findElement(signinbutton); // Returns the Sign In button element
    }

    // Method to get the email input field for login
    public static WebElement signinmail() {
        return driver.findElement(signinmail); // Returns the email input field element
    }

    // Method to get the password input field for login
    public static WebElement signinpass() {
        return driver.findElement(signinpass); // Returns the password input field element
    }

    // Method to get the Sign Out link
    public static WebElement signout() {
        return driver.findElement(signout); // Returns the Sign Out link element
    }
}
