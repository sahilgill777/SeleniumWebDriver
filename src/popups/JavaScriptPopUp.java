package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptPopUp {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/alert");
		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		driver.get("https://demoapps.qspiders.com/alert/confirm?sublist=1");
		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		driver.switchTo().alert().dismiss();

		driver.get("https://demoapps.qspiders.com/alert/prompt?sublist=2");
		driver.findElement(By.xpath("//button[text()='Prompt Alert Box']")).click();
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		Thread.sleep(3000);
		driver.switchTo().alert().sendKeys("yes");
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		

	}

}
