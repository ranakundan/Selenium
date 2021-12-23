package FirstTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver driver;

	@BeforeClass
	public void LaunchAmazonSite() {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Apptad\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	/*
	 * @Test public void f() throws Exception { String email =
	 * MyExcelSheet.ExcelSheet(email, email, 0, 0); String pass =
	 * MyExcelSheet.ExcelSheet(pass, pass, 0, 1); // By continuBtn =
	 * By.id("continue"); By passwordSignInclick =
	 * By.xpath("//*[@id=\'signInSubmit\']"); driver.get("https://www.amazon.in");
	 * // driver.manage().window().maximize();
	 * 
	 * WebElement element = driver.findElement(AmazonWebElement.signin); Actions act
	 * = new Actions(driver); act.moveToElement(element).perform(); ;
	 * 
	 * driver.findElement(AmazonWebElement.signinBtn).click();
	 * 
	 * driver.findElement(AmazonWebElement.emailBoxXpath).sendKeys(email);
	 * 
	 * driver.findElement(AmazonWebElement.continuBtn).click();
	 * driver.findElement(AmazonWebElement.passwordfield).sendKeys(pass);
	 * driver.findElement(passwordSignInclick).click();
	 * 
	 * String actualResult = driver.getTitle(); System.out.println(actualResult);
	 * String ExpectedResult = "Amazon Sign In"; Assert.assertEquals(actualResult,
	 * ExpectedResult, "Message Has been Verify");
	 * 
	 * }
	 */
	@Test

	public void VerifyErrorMessage() {

	}

	/*
	 * @AfterClass public void shutDownBrowser() throws Exception {
	 * Thread.sleep(5000); driver.close(); }
	 */

}
