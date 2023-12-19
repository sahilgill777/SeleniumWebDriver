package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyEnabledOrNot {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demoapps.qspiders.com/");
		driver.findElement(By.id("name")).sendKeys("Sahil Gill");
		driver.findElement(By.id("email")).sendKeys("gill41473@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Qspiders");
		boolean registerButtonStatus = driver.findElement(By.xpath("//button[text()='Register']")).isEnabled();
		if(registerButtonStatus)
		{
			System.out.println("PASS THE button is enabled");
		}
		else
		{
			System.out.println("fail The button is not Enabled");
		}
		
		

	}

}
