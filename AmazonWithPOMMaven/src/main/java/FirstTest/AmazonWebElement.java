package FirstTest;

import org.openqa.selenium.By;

public class AmazonWebElement {

	public static By signin = By.xpath("//*[@id=\'nav-link-accountList\']");
	public static By signinBtn = By.xpath("//span[@class='nav-action-inner']");
	public static By emailBoxXpath = By.xpath("//*[@id=\'ap_email\']");
	//public static By continuebtn = By.xpath("//*[@id=\'continue-announce\']");
	public static 	By continuBtn = By.id("continue");
	public static By passwordfield =By.xpath("//*[@id=\'ap_password\']");
	public static By passwordSIgnInClick=By.xpath("//*[@id=\'auth-signin-button-announce\']");
}
