package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpath {

	public static void main(String[] args) {
		WebDriver  driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Sahil%20gill/Desktop/Textbox.html");
		WebElement bTextBox = driver.findElement(By.xpath("html/body/div[1]/input[2]"));
		bTextBox.sendKeys("Qspiders");

	}

}
