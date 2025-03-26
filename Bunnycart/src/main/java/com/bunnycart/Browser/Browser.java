package com.bunnycart.Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class Browser {
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static Actions act;
	public static ExtentReports extent;
	public static ExtentSparkReporter reporter;
	public static ExtentTest logger1;
	
	public static void init(String reportName) {
		extent=new ExtentReports();
		reporter=new ExtentSparkReporter(System.getProperty("user.dir") + "//target//ExtentReports//"+reportName+".html");
		extent.attachReporter(reporter);
	}

	public static void openBrowser(String str) throws Exception {	
		
		logger1 = extent.createTest("Open browser");
		logger1.log(Status.INFO, "opening the browser");
		try {
			String choice = str; 
			if (choice.equalsIgnoreCase("Chrome")) 
			driver = new ChromeDriver();
			else if (choice.equalsIgnoreCase("Edge"))
				driver = new EdgeDriver();
			logger1.log(Status.PASS,"browser opened successfully");
		}
		catch (Exception e) {
			System.out.println("Browser - openBrowser");
			logger1.log(Status.FAIL,"failed opening the browser ");
		}
		extent.flush();
	}
	
	public static void navigateToUrl(String url) throws Exception {
		//extent.attachReporter(reporter);
		logger1 = extent.createTest("Navigate to url");
		logger1.log(Status.INFO, "Navigating the url");
	    try {
	        driver.get(url); 
	        driver.manage().window().maximize();
	        logger1.log(Status.PASS,"URL opened successfully");
	    } catch (Exception e) {
	        System.out.println("Failed to open URL: " + e.getMessage());
	        logger1.log(Status.FAIL,"Navitaing to url is failed");
	    }
	    extent.flush();
	}
	public static void closeBrowser() {
		//extent.attachReporter(reporter);
		logger1 = extent.createTest("CLose the browser");
		logger1.log(Status.INFO, "CLosing the browser");
		try {
			driver.quit();
			logger1.log(Status.PASS,"Browser closed successfully");
		} catch (Exception e) {
			System.out.println("Browser - closeBrowser");
			logger1.log(Status.FAIL,"closing browser failed");
		}
		extent.flush();
	}
}



