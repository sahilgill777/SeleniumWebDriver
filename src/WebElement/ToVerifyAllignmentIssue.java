package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyAllignmentIssue {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/");
		Point pos = driver.manage().window().getPosition();
		System.out.println(pos);
		Point nameLocation = driver.findElement(By.id("name")).getLocation();
		System.out.println(nameLocation);
		Point emailLocation = driver.findElement(By.id("email")).getLocation();
		System.out.println(emailLocation);
		Point passLocation = driver.findElement(By.id("password")).getLocation();
		System.out.println(passLocation);
		int XofName = nameLocation.getX();
		System.out.println(XofName);
		int XofEmail = emailLocation.getX();
		System.out.println(XofEmail);
		int XofPass = passLocation.getX();
		System.out.println(XofPass);
		if( XofName==XofEmail&&XofEmail==XofPass)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}

	}

}
