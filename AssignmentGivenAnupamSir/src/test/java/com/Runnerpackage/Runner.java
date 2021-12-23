package com.Runnerpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.practice.POM.Login;
import com.practice.utils.Driver;
import com.practice.utils.GetData;
import com.practice.utils.Xls_Reader;

public class Runner {
	WebDriver driver;
	

	public Xls_Reader reader;
	public String filePath1 = "E:\\SeleniumTask\\Ecomerse.xlsx";

	@BeforeMethod
	public void LaunchBrowser() throws Exception {
		driver = Driver.getDriver();
		

	}

	@Test(priority = 4)
	public void Logins() throws Exception {

		
		reader =new Xls_Reader(filePath1);
		

		String email = GetData.fromExcel("Ecomerse.xlsx", "TestCases1", 6,3);
		String FName = GetData.fromExcel("Ecomerse.xlsx", "TestCases1", 8, 4);
		String LName = GetData.fromExcel("Ecomerse.xlsx", "TestCases1", 8, 5);
		String Password = GetData.fromExcel("Ecomerse.xlsx", "TestCases1", 8,6);
		String compname = GetData.fromExcel("Ecomerse.xlsx", "TestCases1", 8, 7);
		String AddreSS = GetData.fromExcel("Ecomerse.xlsx", "TestCases1", 8, 8);

		String AddreSS2 = GetData.fromExcel("Ecomerse.xlsx", "TestCases1", 8, 9);

		String CitY = GetData.fromExcel("Ecomerse.xlsx", "TestCases1", 8, 10);
		String PinCodE = GetData.fromExcel("Ecomerse.xlsx", "TestCases1", 8, 11);
		String AddinFO = GetData.fromExcel("Ecomerse.xlsx", "TestCases1", 8, 12);

		String hPHonE = GetData.fromExcel("Ecomerse.xlsx", "TestCases1", 8, 13);
		String mPHonE = GetData.fromExcel("Ecomerse.xlsx", "TestCases1", 8, 14);
		String aliaSADD = GetData.fromExcel("Ecomerse.xlsx", "TestCases1", 8, 15);
		String yesVar=GetData.fromExcel("Ecomerse.xlsx", "Scenario", 1,2);
		
		
		
	Login page=PageFactory.initElements(driver, Login.class);
		
		page.ClickonLogin(email);

	page.createAccount(FName, LName, Password, compname, AddreSS, AddreSS2, CitY, PinCodE, AddinFO, hPHonE, mPHonE,
				aliaSADD);
		// page.scrolling("scroll(0,400)");

		if(yesVar.equalsIgnoreCase("yes"))
		{
		reader.setCellData("Scenario","Status",2,"Pass");
		}
		//reader.setCellData("Scenario", "Status", 3, "Pass");
	//	reader.setCellData("Scenario", "Status", 4, "Pass");
	//	reader.setCellData("Scenario", "Status", 5, "Pass");

		
		page.ScreenShotLogin(driver);
		

		
	
	}

	@Test(priority = 1)
	public void VerifyEmail() throws Exception {
		reader =new Xls_Reader(filePath1);
		
		Login page1 = PageFactory.initElements(driver, Login.class);

		String emailLOGIn = GetData.fromExcel("Ecomerse.xlsx", "TestCases1", 6, 3);
		String Password = GetData.fromExcel("Ecomerse.xlsx", "TestCases1", 14, 4);
		String yesVar1=GetData.fromExcel("Ecomerse.xlsx", "Scenario", 2,2);
		
		page1.InvalidEmail(emailLOGIn, Password);
		page1.VerifyInvalidEmailBox();
		
		if(yesVar1.equalsIgnoreCase("yes"))
		{
			reader.setCellData("Scenario", "Status", 3, "Failed");
		}
		
	}

	@Test(priority = 2)

	public void MandatoyField() throws Exception {
		
		reader =new Xls_Reader(filePath1);
		String email = GetData.fromExcel("Ecomerse.xlsx", "TestCases1", 6, 3);
		String yesVar2=GetData.fromExcel("Ecomerse.xlsx", "Scenario", 3,2);

	Login page2 = PageFactory.initElements(driver, Login.class);
		page2.MandatoryField(email);

	page2.mandotryFieldVarification();
	if(yesVar2.equalsIgnoreCase("yes"))
	{
		reader.setCellData("Scenario", "Status", 4, "Pass");
	}

	}

	@Test(priority = 3)
	public void WrongValues() throws Exception {
		reader =new Xls_Reader(filePath1);

		String email = GetData.fromExcel("Ecomerse.xlsx", "TestCases1", 6, 3);
		String FName = GetData.fromExcel("Ecomerse.xlsx", "TestCases1", 29, 4);
		String LName = GetData.fromExcel("Ecomerse.xlsx", "TestCases1", 29, 5);
		String Password = GetData.fromExcel("Ecomerse.xlsx", "TestCases1", 29, 6);
		String compname = GetData.fromExcel("Ecomerse.xlsx", "TestCases1", 29, 7);
		String AddreSS = GetData.fromExcel("Ecomerse.xlsx", "TestCases1", 29, 8);

		String AddreSS2 = GetData.fromExcel("Ecomerse.xlsx", "TestCases1", 29, 9);

		String CitY = GetData.fromExcel("Ecomerse.xlsx", "TestCases1", 29, 10);
		String PinCodE = GetData.fromExcel("Ecomerse.xlsx", "TestCases1", 29, 11);
		String AddinFO = GetData.fromExcel("Ecomerse.xlsx", "TestCases1", 29, 12);

		String hPHonE = GetData.fromExcel("Ecomerse.xlsx", "TestCases1", 29, 13);
		String mPHonE = GetData.fromExcel("Ecomerse.xlsx", "TestCases1", 29, 14);
		String aliaSADD = GetData.fromExcel("Ecomerse.xlsx", "TestCases1", 29, 15);

		String yesVar3=GetData.fromExcel("Ecomerse.xlsx", "Scenario", 4,2);
		Login page4 = PageFactory.initElements(driver, Login.class);
		page4.WrongValueVerification();

		page4.ClickonLogin(email);

		page4.paasingWrongValues(FName, LName, Password, compname, AddreSS, AddreSS2, CitY, PinCodE, AddinFO, hPHonE,
				mPHonE, aliaSADD);
		// page.scrolling("scroll(0,400)");
		if(yesVar3.equalsIgnoreCase("yes"))
		{
			reader.setCellData("Scenario", "Status", 5, "Pass");
		}

	}

	@AfterMethod
	public void close() throws Exception {
		
		Thread.sleep(3000);
		
		driver.close();
	}

}
