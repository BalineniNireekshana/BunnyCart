package com.bunnycart.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.bunnycart.Browser.Browser;

public class Page2objects extends Browser {

    // Locators for various elements on the page using XPath
    public static By signinlink = By.xpath("//a[@class='customer-login-link']");
    public static By email = By.xpath("//input[@id='email-login']");
    public static By password = By.xpath("//input[@id='pass-login']");
    public static By signinbutton = By.xpath("//button[@class='action login primary']");
    public static By search = By.xpath("//input[@id='search']");
    public static By selectproduct = By.linkText("Aquatic Plants Combo Pack");
    public static By quantity = By.xpath("//div[@id='option-label-type-200-item-5648']");
    public static By addtocart = By.xpath("//button[@id='product-addtocart-button']");
    

    // Method to get the Sign In link
    public static WebElement signin() {
        return driver.findElement(signinlink); // Returns the sign-in link element
    }

    // Method to get the email input field for login
    public static WebElement enteremailfield() {
        return driver.findElement(email); // Returns the input field for email
    }

    // Method to get the password input field for login
    public static WebElement enterpasswordfield() {
        return driver.findElement(password); // Returns the input field for password
    }

    // Method to get the Sign In button
    public static WebElement buttonsigin() {
        return driver.findElement(signinbutton); // Returns the Sign In button element
    }

    // Method to get the product search input field
    public static WebElement searchproduct() {
        return driver.findElement(search); // Returns the search input field element
    }

    // Method to get a product image element to select a product
    public static WebElement selectProduct() {
        return driver.findElement(selectproduct); // Returns the product image to select the product
    }

    // Method to click on a specific quantity option
    public static WebElement clickquantity() {
        return driver.findElement(quantity); // Returns the quantity selection element
    }

    // Method to click on the "Add to Cart" button
    public static WebElement addcart() {
        return driver.findElement(addtocart); // Returns the "Add to Cart" button element
    }

}
