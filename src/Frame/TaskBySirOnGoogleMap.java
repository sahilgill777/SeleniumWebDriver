package Frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskBySirOnGoogleMap {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//a[@aria-label='Google apps']")).click();
		driver.switchTo().frame("app");
		driver.findElement(By.xpath("//span[text()='Maps']")).click();
		WebElement search = driver.findElement(By.id("searchboxinput"));
		search.sendKeys("Noida");
		search.sendKeys(Keys.ENTER);
		boolean check = driver.findElement(By.xpath("//h1[@class='DUwDvf lfPIob']")).isDisplayed();
		if(check)
		{
			System.out.println("Pass ");
		}
		else
		{
			System.out.println("Fail");
		}
		

	}

}
