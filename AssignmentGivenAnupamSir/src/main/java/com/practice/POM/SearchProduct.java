package com.practice.POM;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class SearchProduct {
	WebDriver driver;

	@FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[1]/ul/li[1]/a")
	WebElement Tshirt;

	@FindBy(xpath = "//*[@id=\"center_column\"]/ul/li/div/div[2]/h5/a")
	WebElement FirstTshirt;

	@FindBy(xpath = "//input[@id='search_query_top']")
	WebElement SearchBox;

	@FindBy(xpath = "//button[@name='submit_search']")
	WebElement SearchButton;

	@FindBy(xpath = "//*[@id=\"center_column\"]/ul/li/div/div[2]/h5/a")
	WebElement SearchedTshirt;

	public void mousehoverWomen() {
		WebElement ele = driver.findElement(By.xpath("//a[@title='Women']"));
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();

		Tshirt.click();
		String NameOfTshirt = FirstTshirt.getText();

		System.out.println("Name of tshirt is " + NameOfTshirt);

		SearchBox.sendKeys(NameOfTshirt);
		SearchButton.click();

		String SearchTshirt = SearchedTshirt.getText();
		System.out.println(SearchTshirt);

		if (NameOfTshirt.equals(SearchTshirt)) {
			System.out.println("Tshirt Matched");
		}

		else {
			System.out.println("Tshirt Not Matched");
		}

	}
	
	
	public static void ScreenShotSearchProduct(WebDriver driver) throws Exception {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);

		File trg = new File(".\\Screenshot\\SearchProduct.png");
		FileUtils.copyFile(src, trg);
	
}

	public SearchProduct(WebDriver driver) {
		this.driver = driver;

	}

}
