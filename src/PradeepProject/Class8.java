package PradeepProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class8 {
	public static void againHome()
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://learn.thecodearena.in/");
    driver.findElement(By.linkText("Home")).click();
    String image = driver.findElement(By.xpath("//img[@class='bannerImageWithoutEyes']")).getTagName();
    if(image.contains("img"))
    {
    	System.out.println("It is home");
    }
    else
    {
    	System.out.println("It is not home");
    }
}
}
