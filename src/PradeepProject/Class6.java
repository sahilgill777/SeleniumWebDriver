package PradeepProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class6 {
	public static void admission()
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://learn.thecodearena.in/");
	//driver.findElement(By.linkText("Admission")).click();
	String tag = driver.findElement(By.xpath("//h6[text()='Eligibility Criteria']")).getTagName();
	System.out.println(tag);
	if(tag.contains("h6"))
	{
		System.out.println("PASS");
	}
	else
	{
		System.out.println("FAIL");
	}

}
}
