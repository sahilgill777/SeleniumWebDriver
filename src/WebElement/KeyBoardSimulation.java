package WebElement;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyBoardSimulation {

	public static void main(String[] args) throws InterruptedException {
		String currentTitle="Enter";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("admin");
		WebElement pass = driver.findElement(By.name("pwd"));
		
		pass.sendKeys("manager");
		pass.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		String actualTitle = driver.getTitle();
		if(actualTitle.contains(currentTitle))
		{
			System.out.println("It is home page");
		}
		else
			System.out.println("It is not home page");
		
		
		
		
		
		

	}

}
