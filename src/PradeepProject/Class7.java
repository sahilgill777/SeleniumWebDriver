package PradeepProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class7 {
	public static void contact()
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://learn.thecodearena.in/");
	driver.findElement(By.linkText("Contact")).click();
	String text1 = driver.findElement(By.xpath("//h5[text()='Phone Number']")).getTagName();
	if(text1.contains("h5"))
	{
		System.out.println("PASS");
	}
	else
	{
		System.out.println("FAIL");
	}

}
}