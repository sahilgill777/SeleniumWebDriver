package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToClear {

	
		public static void loginAction(WebDriver driver,String username,String password)
		{
			driver.findElement(By.name("email")).clear();
			driver.findElement(By.name("email")).sendKeys(username);
			driver.findElement(By.name("password")).clear();
			driver.findElement(By.name("password")).sendKeys(password);
			driver.findElement(By.xpath("//button[text()='Login']")).click();
			
			
		}
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demoapps.qspiders.com/login");
			ToClear.loginAction(driver,"sahil@djkcnbjfv","jdnciuj");
			Thread.sleep(5000);
			ToClear.loginAction(driver, "bvh@ejfbur", "hjcfbvdrbv");
			
		}

	

}
