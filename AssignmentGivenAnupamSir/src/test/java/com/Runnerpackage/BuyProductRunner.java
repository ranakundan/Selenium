package com.Runnerpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.practice.POM.BuyProduct;
import com.practice.utils.Driver;

import com.practice.utils.GetData;
import com.practice.utils.Xls_Reader;

public class BuyProductRunner {

	WebDriver driver;
	
	
	
	public Xls_Reader reader;
	public String filePath1 = "E:\\SeleniumTask\\Ecomerse.xlsx";
	
	@BeforeMethod
	public void LaunchBrowser() throws Exception {
		driver = Driver.getDriver();
		
	}

	@Test(priority = 1)
	public void MouseHover() throws Exception {
		BuyProduct page1 = PageFactory.initElements(driver, BuyProduct.class);
		page1.mousehoverTShoping();
		String Lemail = GetData.fromExcel("Ecomerse.xlsx", "TestCases1", 6, 3);
		String pass = GetData.fromExcel("Ecomerse.xlsx", "TestCases1", 8,6);
	//	BuyProduct page1 = PageFactory.initElements(driver, BuyProduct.class);
		page1.plogin(Lemail, pass);
		page1.ScreenShotBuyProduct(driver);
		page1.logout();
		
	}

	@Test(priority = 2)
	public void AddWishList() throws Exception {
		BuyProduct page = PageFactory.initElements(driver, BuyProduct.class);
		page.mousehoverWomen2();
		String actual = "You must be logged in to manage your wishlist.";
		System.out.println(actual);
		String expected = "You must be logged in to manage your wishlist.";
		Assert.assertEquals(actual, expected, "Verified Error Message");
		
	}

	@Test(priority = 3)
	public void MouseHoverAg() throws Exception {
		
		reader =new Xls_Reader(filePath1);
		
		BuyProduct page2 = PageFactory.initElements(driver, BuyProduct.class);
		page2.mousehoverTsirt();
		String Lemail = GetData.fromExcel("Ecomerse.xlsx", "TestCases1", 6, 3);
		String pass = GetData.fromExcel("Ecomerse.xlsx", "TestCases1", 8, 6);

		page2.plogin(Lemail, pass);
		
		reader.setCellData("Scenario","Status",14,"Pass");
		reader.setCellData("Scenario","Status",15,"Pass");
		reader.setCellData("Scenario","Status",16,"Pass");

	}

	@AfterMethod
	public void close() throws InterruptedException {
		
		Thread.sleep(3000);
		driver.close();

	}

}