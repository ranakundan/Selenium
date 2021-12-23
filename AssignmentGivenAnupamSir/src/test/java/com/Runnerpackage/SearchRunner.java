package com.Runnerpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.practice.POM.SearchProduct;
import com.practice.utils.Driver;
import com.practice.utils.Xls_Reader;

public class SearchRunner {
 
	WebDriver driver;
	
	public Xls_Reader reader;
	public String filePath1 = "E:\\SeleniumTask\\Ecomerse.xlsx";

	
	
	@BeforeMethod
	public void LaunchBrowser() throws Exception {
		driver = Driver.getDriver();
		

	}
	
	

	@Test
	public void MouseHover() throws Exception
	{
		
		reader =new Xls_Reader(filePath1);
		
		
		SearchProduct page=PageFactory.initElements(driver,SearchProduct.class);
		page.mousehoverWomen();
		page.ScreenShotSearchProduct(driver);
		
		reader.setCellData("Scenario","Status",9,"Pass");
	
	}
	
	
	@AfterMethod
	public void close() throws InterruptedException
	{
		
		Thread.sleep(3000);
		driver.close();
	}
	
	
}
