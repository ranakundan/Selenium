package com.practice.POM;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {
	static WebDriver driver;

	@FindBy(xpath = "//a[@class='login']")
	WebElement login;

	@FindBy(name = "email_create")
	WebElement Emailbox;

	@FindBy(xpath = "//i[@class='icon-user left']")
	WebElement clickOnCreate;

	// register user

	@FindBy(id = "id_gender1")
	WebElement Title;

	@FindBy(id = "customer_firstname")
	WebElement Fname;

	@FindBy(id = "customer_lastname")
	WebElement Lname;

	@FindBy(id = "passwd")
	WebElement Pass;

	@FindBy(xpath = "//*[@id=\"days\"]/option[6]")
	WebElement Day;

	@FindBy(xpath = "//*[@id=\"months\"]/option[6]")
	WebElement Month;

	@FindBy(xpath = "//*[@id=\"years\"]/option[26]")
	WebElement Year;

	@FindBy(name = "newsletter")
	WebElement check;

	@FindBy(id = "optin")
	WebElement check2;

	@FindBy(id = "company")
	WebElement company;

	@FindBy(name = "address1")
	WebElement Address;

	@FindBy(id = "address2")
	WebElement Address2;

	@FindBy(id = "city")
	WebElement city;

	@FindBy(xpath = "//*[@id=\"id_state\"]/option[16]")
	WebElement state;

	@FindBy(id = "postcode")
	WebElement pin;

	@FindBy(xpath ="//*[@id=\"id_country\"]/option[2]")
	WebElement country;

	@FindBy(name="other")
	WebElement AddInfo;

	@FindBy(id = "phone")
	WebElement Hphone;

	@FindBy(id = "phone_mobile")
	WebElement Mphone;

	@FindBy(id = "alias")
	WebElement AliasAdd;
	
	@FindBy(xpath = "//*[@id=\"submitAccount\"]")
	WebElement CreateButton;
	
	
	@FindBy(id="email")
	WebElement emailLogin;
	
	@FindBy(xpath = "//*[@id=\"passwd\"]")
	WebElement SignPass;
	
	@FindBy(xpath="//*[@id=\"SubmitLogin\"]/span")
	WebElement SignIN;
	
	
	@FindBy(xpath = "//*[@id=\"submitAccount\"]/span")
	WebElement register;
	
	
	@FindBy(xpath="//*[@id=\"center_column\"]/div[1]/ol/li")
	WebElement verifyInvalidEmail;

	
	@FindBy(xpath="//div[@class='alert alert-danger']")
	WebElement mandotryFieldverification;
	
	
	@FindBy(xpath="//*[@id=\"center_column\"]/div")
	WebElement WrongValuesVerification;
	
	
	public Login(WebDriver driver) {
		this.driver = driver;

	}

	public void ClickonLogin(String Email) {
		login.click();// ,
		Emailbox.sendKeys(Email);
		clickOnCreate.click();
	}

	public void createAccount(String fName, String lName, String password, String compName, String add, String add2,
			String CITY, String PinCode, String Addinfo, String hPhone, String MPhone, String aliasAdd) {

		Title.click();
		Fname.sendKeys(fName);
		Lname.sendKeys(lName);
		Pass.sendKeys(password);
		Day.click();
		Month.click();
		Year.click();
		check.click();
		check2.click();
		company.sendKeys(compName);
		Address.sendKeys(add);

		Address2.sendKeys(add2);
		city.sendKeys(CITY);
		state.click();
		pin.sendKeys(PinCode);
		country.click();
		AddInfo.sendKeys(Addinfo);
		Hphone.sendKeys(hPhone);
		Mphone.sendKeys(MPhone);
		AliasAdd.clear();
		AliasAdd.sendKeys(aliasAdd);
		CreateButton.click();

	}

	// for Scrolling

	/*
	 * public static void scrolling(String value) { JavascriptExecutor
	 * js=(JavascriptExecutor)driver; js.executeScript(value);
	 * 
	 * 
	 * }
	 */
	
	
	
	
	
				
	
	public void VerifyInvalidEmailBox()
	{
		String actualtext=verifyInvalidEmail.getText();
		String ExpectedValue="Invalid email address";
		System.out.println("Invalid email msg are "+actualtext);
		if(actualtext.equals(ExpectedValue))
		{
			System.out.println("Invalid Email msg are verified");
		}
		else
		{
			System.out.println("Invalid Email msg are not verified");
		}
	}
	
	
	public void InvalidEmail(String emLog,String passSign)
	{
		login.click();
		emailLogin.sendKeys(emLog);
		SignPass.sendKeys(passSign);
		//emailLogin.sendKeys(Keys.TAB);
		SignIN.click();

	}
	
	public void MandatoryField(String Email)
	{
		login.click();
		Emailbox.sendKeys(Email);
		clickOnCreate.click();
		register.click();
		
		
	}
	
	
	
	public void mandotryFieldVarification()
	{
	String actual=mandotryFieldverification.getText();
	String Expected="There are 8 errors\r\n" + 
			"\r\n" + 
			"You must register at least one phone number.\r\n" + 
			"lastname is required.\r\n" + 
			"firstname is required.\r\n" + 
			"passwd is required.\r\n" + 
			"address1 is required.\r\n" + 
			"city is required.\r\n" + 
			"The Zip/Postal code you've entered is invalid. It must follow this format: 00000\r\n" + 
			"This country requires you to choose a State.";
	
	
	
	if(actual.equals(Expected))
	{
		System.out.println("Verified mandatory field ");
	}
	else
	{
		System.out.println("Not Verified mandatory field ");
	}
	}
	
	
	
	public void WrongValueVerification()
	{
	String actual=	WrongValuesVerification.getText();
	String expected="There are 5 errors\r\n" + 
			"\r\n" + 
			"lastname is invalid.\r\n" + 
			"firstname is invalid.\r\n" + 
			"phone is invalid.\r\n" + 
			"phone_mobile is invalid.\r\n" + 
			"The Zip/Postal code you've entered is invalid. It must follow this format: 00000";
	
	if(actual.equals(expected))
	{
		System.out.println("Wrong values are verified ");
	}
	else
	{
		System.out.println("Wrong Values are not verified ");
	}
	
	
	}
	
	
	
	
	
	
	
	
	
	public void paasingWrongValues(String fName, String lName, String password, String compName, String add, String add2,
			String CITY, String PinCode, String Addinfo, String hPhone, String MPhone, String aliasAdd) {

		Title.click();
		Fname.sendKeys(fName);
		Lname.sendKeys(lName);
		Pass.sendKeys(password);
		Day.click();
		Month.click();
		Year.click();
		check.click();
		check2.click();
		company.sendKeys(compName);
		Address.sendKeys(add);

		Address2.sendKeys(add2);
		city.sendKeys(CITY);
		state.click();
		pin.sendKeys(PinCode);
		country.click();
		AddInfo.sendKeys(Addinfo);
		Hphone.sendKeys(hPhone);
		Mphone.sendKeys(MPhone);
		AliasAdd.clear();
		AliasAdd.sendKeys(aliasAdd);
		//CreateButton.click();
		register.click();

	}	
	
	
	public static void ScreenShotLogin(WebDriver driver) throws Exception {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);

		File trg = new File(".\\Screenshot\\LoginPage.png");
		FileUtils.copyFile(src, trg);
	
}
	
	
}