package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyTheDimensionOfTextBox {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demoapps.qspiders.com/");
		 Dimension dimOfName = driver.findElement(By.id("name")).getSize();
		int heightName = dimOfName.getHeight();
		int widthName = dimOfName.getWidth();
		System.out.println( heightName);
		System.out.println(widthName);
		//System.out.println(dimOfName);
		 Dimension dimOfEmail = driver.findElement(By.id("email")).getSize();
		//System.out.println(dimOfEmail);
		 int heightEmail = dimOfName.getHeight();
			int widthEmail = dimOfName.getWidth();
			System.out.println( heightEmail);
			System.out.println(widthEmail);
		 Dimension dimOfPass = driver.findElement(By.id("password")).getSize();
		//System.out.println(dimOfPass);
		 int heightPass = dimOfName.getHeight();
			int widthPass = dimOfName.getWidth();
			System.out.println( heightPass);
			System.out.println(widthPass);
		if(heightName==heightEmail&heightEmail==heightPass&widthName==widthEmail&widthEmail==widthPass)
		{
			System.out.println("PASS: They all are equal");
		}
		else
		{
			System.out.println("FAIL : They all are not equal");
		}
	}

}
