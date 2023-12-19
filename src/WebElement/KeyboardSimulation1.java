package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardSimulation1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement user = driver.findElement(By.name("username"));
		user.sendKeys("trainee");
		user.sendKeys(Keys.CONTROL, "a");
		user.sendKeys(Keys.CONTROL,"c");
		WebElement pss = driver.findElement(By.name("pwd"));
		pss.sendKeys(Keys.CONTROL, "v");
		pss.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		WebElement verifyText = driver.findElement(By.xpath("//td[text()='Enter Time-Track']"));
		String text = verifyText.getText();
		if(text.contains("Enter"))
		{
			System.out.println("PASS");
		}
		else
			System.out.println("FAIL");
		
		
		

	}

}
