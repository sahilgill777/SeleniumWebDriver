package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAxes {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/s?k=men+shoes&crid=3U8S9DLGE278F&sprefix=men+shoe%2Caps%2C401&ref=nb_sb_noss_1");
		WebElement priceOfShoe = driver.findElement(By.xpath("//span[text()='Hey Dude Mens Wally Sox']/ancestor::div[@class=\"a-section a-spacing-small puis-padding-left-small puis-padding-right-small\"]/descendant::span[@class=\"a-price-whole\"]"));
		String price = priceOfShoe.getText();
		System.out.println(price);

	}

}
