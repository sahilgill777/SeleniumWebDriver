package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByTagName {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Sahil%20gill/Desktop/Loginpage.html");
		WebElement heading = driver.findElement(By.tagName("h1"));
		String headingText = heading.getText();
		System.out.println(headingText);
	}

}
