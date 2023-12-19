package DropDowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToSelect2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/dropdown");
		WebElement selectCountry = driver.findElement(By.id("select3"));
		Select select1=new Select(selectCountry);
		select1.selectByIndex(7);
		 WebElement selectState = driver.findElement(By.id("select5"));
		 Select select2=new Select(selectState);
		 select2.selectByVisibleText("Haryana");
		 //=================================================================================
		 WebElement selectCity = driver.findElement(By.xpath("(//select[contains(@class,'border-0 px-3 py-3 placeholder-blueGray-300 ')])[5]"));
		 Select select3=new Select(selectCity);
		 select3.selectByVisibleText("Hisar");
		 
		 

	}

}
