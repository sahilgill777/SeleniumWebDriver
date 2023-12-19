package PradeepProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class3 {
	public static void service1()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://learn.thecodearena.in/");
	driver.findElement(By.linkText("Service")).click();
	String tag5 = driver.findElement(By.xpath("//p[contains(text(),'The CodeArena is dedicated to providing high-quality software development training to')]")).getTagName();
	if(tag5.contains("p"))
	{
		System.out.println("PASS");
	}
	else
	{
		System.out.println("FAIL");
	}
	
	
	
	}
}
