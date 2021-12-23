package com.practice.POM;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class BuyProduct {

	WebDriver driver;

	@FindBy(xpath = " //a[@class='login']")
	WebElement SignIn;

	@FindBy(id = "email")
	WebElement Email;

	@FindBy(xpath = "//input[@type='password']")
	WebElement Password;

	@FindBy(xpath = "//*[@id=\"SubmitLogin\"]/span")
	WebElement Login;

	@FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[1]/ul/li[1]/a")
	WebElement Tshirt;

	@FindBy(xpath = "//*[@id=\"special_block_right\"]/div/div/a/span")
	WebElement AllSpecial;

	@FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[2]")
	WebElement More;

	@FindBy(xpath = "//i[@class='icon-plus']")
	WebElement Increase;

	@FindBy(xpath = "//option[@value='2']")
	WebElement SizeL;

	@FindBy(xpath = "//option[@value='2']")
	WebElement SizeM;

	@FindBy(id = "color_14")
	WebElement Color;

	@FindBy(xpath = "//button[@name='Submit']")
	WebElement AddCart;

	@FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")
	WebElement Proceed;

	@FindBy(xpath = "//*[@id=\"center_column\"]/p[2]/a[1]/span")
	WebElement SumProceed;

	@FindBy(xpath = "//*[@id=\"center_column\"]/form/p/button/span")
	WebElement SumProceed2;

	@FindBy(xpath = "//input[@type='checkbox']")
	WebElement Checque;

	@FindBy(xpath = "//*[@id=\"form\"]/p/button/span")
	WebElement SumProceed3;

	@FindBy(xpath = "//a[@class='cheque']")
	WebElement Checquepayment;

	@FindBy(xpath = "//*[@id=\"cart_navigation\"]/button/span")
	WebElement Confirm;

	@FindBy(xpath = "//a[@class='logout']")
	WebElement Logout;

	@FindBy(xpath = "//a[@class='addToWishlist wishlistProd_5']")
	WebElement WishList;

	@FindBy(xpath = "//a[@title='Close']")
	WebElement Close;

	@FindBy(xpath = "//i[@class='icon-plus']")
	WebElement INC;

	// FirstTest Case
	public void mousehoverTShoping() {

		SignIn.click();
		WebElement ele = driver.findElement(By.xpath("//a[@title='Women']"));
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
		Tshirt.click();
		AllSpecial.click();
		WebElement ele1 = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[2]"));
		Actions act1 = new Actions(driver);
		act1.moveToElement(ele1).perform();
		More.click();
		Increase.click();
		SizeL.click();
		Color.click();
		AddCart.click();
		Proceed.click();
		SumProceed.click();
	}

	public BuyProduct(WebDriver driver) {
		this.driver = driver;
	}

	public void plogin(String email, String pass) {

		Email.sendKeys(email);
		Password.sendKeys(pass);
		Login.click();
		SumProceed2.click();
		Checque.click();
		SumProceed3.click();
		Checquepayment.click();
		Confirm.click();
		//Logout.click();

	}
	
	
	public void logout()
	{
		Logout.click();
	}
	

//TestCase 2
	public void mousehoverWomen2() {
		WebElement ele = driver.findElement(By.xpath("//a[@title='Women']"));
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
		Tshirt.click();
		AllSpecial.click();
		WebElement ele1 = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[2]"));
		Actions act1 = new Actions(driver);
		act1.moveToElement(ele1).perform();
		WishList.click();
		Close.click();

	}

	public void mousehoverTsirt() {

		SignIn.click();
		WebElement ele = driver.findElement(By.xpath("//a[@title='Women']"));
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
		Tshirt.click();
		AllSpecial.click();
		WebElement ele1 = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[2]"));
		Actions act1 = new Actions(driver);
		act1.moveToElement(ele1).perform();
		More.click();
		// Increase.click();
		SizeL.click();
		Color.click();
		AddCart.click();
		Proceed.click();
		INC.click();
		SumProceed.click();
	}
	
	public static void ScreenShotBuyProduct(WebDriver driver) throws Exception {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);

		File trg = new File(".\\Screenshot\\BuyProduct.png");
		FileUtils.copyFile(src, trg);
	
}
}