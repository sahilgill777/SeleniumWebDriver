package popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/browser?sublist=0");
		driver.findElement(By.xpath("//a[text()='Open in new window']")).click();
		
		Thread.sleep(2000);	
		Set<String> allWindowIDS = driver.getWindowHandles();
		for(String id:allWindowIDS)
		{
			driver.switchTo().window(id);
			String currentWindowTitle = driver.getTitle();
			if(currentWindowTitle.contains("new Window"))
			{
				driver.switchTo().frame(0);
				driver.findElement(By.id("username")).sendKeys("admin");
				driver.close();
			}
		}
	}

}
