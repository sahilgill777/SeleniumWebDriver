package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyGoogleSearch {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement google = driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
		google.sendKeys("shoes");
		google.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		String info = driver.findElement(By.xpath("//div[text()='Tools']")).getText();
		Thread.sleep(3000);
		if(info.contains("Too"))
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
	}

}

