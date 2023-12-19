package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCompareSpaceBetweenTextbox {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/");
		Rectangle nameRect = driver.findElement(By.name("name")).getRect();
		Rectangle emailRect = driver.findElement(By.name("email")).getRect();
		Rectangle passRect = driver.findElement(By.name("password")).getRect();
		int nameStartY = nameRect.getY();
		int nameHeight = nameRect.getHeight();
		int nameEndY = nameStartY+nameHeight;
		int emailStartY = emailRect.getY();
		int spaceBetweennNameAndEmail = emailStartY-nameEndY;
		System.out.println(spaceBetweennNameAndEmail);
		int heightOfEmail = emailRect.getHeight();
		int emailEndY = heightOfEmail+ emailStartY;
		int passStartY = passRect.getY();
		int spaceBetweenEmailTextboxAndPassword = passStartY-emailEndY;
		System.out.println(spaceBetweenEmailTextboxAndPassword);
		if(spaceBetweenEmailTextboxAndPassword==spaceBetweennNameAndEmail)
		{
			System.out.println("Yes : space are equal");
		}
		else
		{
			System.out.println("Fail : Space are not equal");
		}
		
		
	}

}
