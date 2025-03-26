package com.bunnycart.stepdefinition;
import io.cucumber.java.en.When;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.bunnycart.Browser.Browser;
import com.bunnycart.Pages.Page2;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
public class SiginAddtocart {
	@Given("User opens the Browser")
	public void user_opens_the_browser() throws Exception {
		Browser.init("Add to cart");
	    Browser.openBrowser("chrome");
	}
	@And("User navigates to the {string} webpage")
	public void user_navigates_to_the_webpage(String string) throws Exception {
	    Browser.navigateToUrl("https://www.bunnycart.com/");
	}
	@When("User clicks on Sign in link")
	public void user_clicks_on_sign_in_link() {
	    Page2.openSignInPage();
	}
	@And("User enters the Sign in credentials")
	public void user_enters_the_sign_in_credentials(DataTable dataTable) throws Exception {
		
			List<List<String>> credentials = credentials(
					"C:\\Users\\NIREEKSHANA\\eclipse-workspace\\Bunnycart\\src\\test\\resources\\Bunntcartdata.xlsx");
			dataTable = DataTable.create(credentials);
			System.out.println("Email Entered: " + dataTable.cell(1, 0));
			System.out.println("Password Entered: " + dataTable.cell(1, 1));
			
			Page2.inputEmail(dataTable.cell(1, 0)); 
			Page2.inputPassword(dataTable.cell(1, 1));
	}		
	       public static List<List<String>> credentials(String excelFilePath) throws Exception {
			List<List<String>> credentials = new ArrayList<>();
			FileInputStream file = new FileInputStream(new File(excelFilePath));
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			XSSFSheet sheet = workbook.getSheetAt(0);
			for (int i = 0; i <= sheet.getLastRowNum(); i++) {
				Row row = sheet.getRow(i);
				List<String> rowData = new ArrayList<>();
				if(row!=null) {
					for(int j=0;j<row.getLastCellNum();j++) {
						Cell cell=row.getCell(j);
						if(cell!=null) {
							rowData.add(cell.getStringCellValue());
						}else {	
							rowData.add("");
						}
					}
				}
			credentials.add(rowData);
			}
		workbook.close();
		return credentials;
		}

	@And("User clicks on Sign in button")
	public void user_clicks_on_sign_in_button() throws InterruptedException {
	    Page2.clickSignInButton();
	   
	}
	@And("User search for a product {string}")
	public void user_search_for_a_product(String string) throws InterruptedException {
		
	    Page2.searchForProduct("aquatic plants");
	}
	@And("User select a product")
	public void the_user_select_a_product() throws InterruptedException {
		
	    Page2.selectFirstProduct();
	}
	
	@And("user selects  quantity of {string}")
	public void user_selects_quantity_of(String string) {
	    Page2.selectProductQuantity();
	}
	
	@And("User add a product to cart")
	public void user_add_a_product_to_cart() {
		
	    Page2.addProductToCart();
	}
	@And("User close the browser")
	public void user_close_the_browser() throws InterruptedException {
		
		Browser.closeBrowser();
	}

}

