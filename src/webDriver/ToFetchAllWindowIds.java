package webDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToFetchAllWindowIds {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		String parentID = driver.getWindowHandle();
		System.out.println(parentID);
		Set<String> allIDs = driver.getWindowHandles();
		System.out.println(allIDs);
	

	}

}
