package com.bunnycart.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.bunnycart.Browser.Browser;

public class Page3objects extends Browser {
    
    // Locators for elements on the page using XPath and CSS Selector
    public static By homepagesignin = By.xpath("//*[@id=\'html-body\']/div[2]/header/div[1]/div/div/div/div/ul/li[5]/a");
    public static By signinbutton = By.cssSelector("button[id='send2-login'] span");
    public static By signinmail = By.xpath("//input[@id='email-login']");
    public static By signinpass = By.xpath("//input[@id='pass-login']");

    // Method to get the homepage sign-in link
    public static WebElement homepagesignin() {
        return driver.findElement(homepagesignin); // Returns the homepage sign-in link element
    }

    // Method to get the sign-in button element
    public static WebElement signinbutton() {
        return driver.findElement(signinbutton); // Returns the sign-in button element
    }

    // Method to get the email input field for login
    public static WebElement signinmail() {
        return driver.findElement(signinmail); // Returns the input field for email during sign-in
    }

    // Method to get the password input field for login
    public static WebElement signinpass() {
        return driver.findElement(signinpass); // Returns the input field for password during sign-in
    }
}
