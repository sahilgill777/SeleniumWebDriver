package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByCssSelector {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement languages = driver.findElement(By.cssSelector("div[id='SIvCob']"));
		String googleLanguage = languages.getText();
		System.out.println(googleLanguage);
		
		//invalid selector =It is an unchecked exception of selenium which ocurrs when the syntax 
		// of the css selector or xpath is incorrect.
		
	}

}
