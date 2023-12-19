package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndependentAndDependent {

	public static void main(String[] args) {
		String priceOfProduct = "56,999";
		String productName = "APPLE iPhone 14 (Blue, 128 GB)";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/search?q=iphone&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
		WebElement elementRefOfIphone = driver.findElement(By.xpath("//div[text()='"+productName+"']/../..//div[text()='₹"+priceOfProduct+"']"));
		String priceOfIphone = elementRefOfIphone.getText();
		System.out.println(priceOfIphone);
		
		
		
		

	}

}
