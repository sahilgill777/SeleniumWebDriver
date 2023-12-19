package Button;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyButton {

	public static void main(String[] args) throws InterruptedException {
		WebDriver  driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demoapps.qspiders.com/button/buttonSubmitClick");
		driver.findElement(By.id("sat1")).click();
		driver.findElement(By.xpath("//p[text()='1. Are you satisfied with the registration process?']/ancestor::article[@class='ps-10 pb-8']/descendant::button[text()='Submit']")).click();
		Thread.sleep(3000);
		boolean display = driver.findElement(By.xpath("//span[text()='You Selected \"Yes\"']")).isDisplayed();
		System.out.println(display);
		if(display)
		{
			System.out.println("PAss It is displaying");
		}
		else
		{
			System.out.println("FAIL : It is not displaying");
		}
	}
}
