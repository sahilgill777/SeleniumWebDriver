package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToMoveOffSet {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/");
		Actions action = new Actions(driver);
		action.moveByOffset(78, 42).click().perform();
		/*
		 *moveByOffSet will be used there where we have no locator
		 *In this moveByOffSet, action Class method will be used with no arguments like click(),contextClick(),doubleClick()().
		 *At last perform() will be used because the return type of this method is void .
		 * All other method of action class return something, so they will not be used to perform something.
		 * Void returnType is used to perform something. 
		 * 
		 */

	}

}
