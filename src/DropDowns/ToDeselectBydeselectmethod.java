package DropDowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToDeselectBydeselectmethod {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoqa.com/select-menu");
		WebElement countryDropdownMulti = driver.findElement(By.id("cars"));
		Select select=new Select(countryDropdownMulti);
		boolean multi = select.isMultiple();
		System.out.println(multi);
		select.selectByIndex(2);
		select.selectByVisibleText("Audi");
		select.selectByValue("volvo");
		select.deselectAll();
	}

}
