package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByID {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Sahil%20gill/Desktop/Loginpage.html");
		WebElement usename = driver.findElement(By.id("abc"));
		System.out.println(usename);
		usename.sendKeys("Kuch value pass krta hun");
		WebElement password = driver.findElement(By.className("password"));
		password.sendKeys("password pass krta hoon");
	}

}
