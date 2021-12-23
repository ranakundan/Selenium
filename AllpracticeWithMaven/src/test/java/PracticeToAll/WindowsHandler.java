package PracticeToAll;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandler {

	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Apptad\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");

		// getWindowHandles

//	String WindowsId=driver.getWindowHandle();
//	System.out.println(WindowsId);
//	

		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();

		Set<String> windowsId = driver.getWindowHandles();

//		Iterator<String> it = windowsId.iterator();//by using Iterator we can getThe id
//		String parent = it.next();
//		String Child = it.next();
//		System.out.println(parent);
//		System.out.println(Child);

		//another method 
	//List<String> list=new ArrayList(windowsId);
	/*
	 * String parentWindow=list.get(0); String ChildWndow=list.get(1);
	 * 
	 * System.out.println(parentWindow); System.out.println(ChildWndow);
	 */
		
	
	
	
	for(String winId:windowsId)
	{
		String title=driver.switchTo().window(winId).getTitle();
		System.out.println(title);
		
	}
	driver.close();
	driver.quit();
	
	}
}
