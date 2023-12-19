package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyMsgDisplayedOrNotNot {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demoapps.qspiders.com/button");
		driver.findElement(By.xpath("//p[text()='1. Are you satisfied with registration process?']/..//button[text()='Yes']")).click();
		Thread.sleep(3000);
		boolean yesMsg = driver.findElement(By.xpath("//span[text()='You selected \"Yes\"']")).isDisplayed();
		System.out.println(yesMsg);
		if(yesMsg)
		{
			System.out.println("PASS The msg is displaying");
		}
		else
		{
			System.out.println("Fail The msg is not displaying");
		}

	}

}
				