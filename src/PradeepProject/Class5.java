package PradeepProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class5 {
	public static void courses() throws InterruptedException
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://learn.thecodearena.in/");
	//driver.findElement(By.linkText("Courses")).click();
	 WebElement text = driver.findElement(By.xpath("//h6[text()='Courses']"));
	 Thread.sleep(3000);
	 JavascriptExecutor js=(JavascriptExecutor)driver;
	 js.executeScript("arguments[0].scrollIntoView(true)", text);
	 
	

}
}