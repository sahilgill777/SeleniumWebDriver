package PradeepProject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class4 {
	public static void developers() throws InterruptedException, AWTException
	{
		
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://learn.thecodearena.in/");
	driver.findElement(By.xpath("//i[@class='icon ti-linkedin']")).click();
	Thread.sleep(3000);
	Robot robot = new Robot();
	robot.keyPress(KeyEvent.VK_TAB);
	robot.keyRelease(KeyEvent.VK_TAB);
	
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	
	Set<String> allIDs = driver.getWindowHandles();
	for(String id:allIDs)
	{
		driver.switchTo().window(id);
		String sourceCode = driver.getPageSource();
		if(sourceCode.contains("Tacto"))
		{
			System.out.println(driver.getTitle());
		}
	}

}
}
	