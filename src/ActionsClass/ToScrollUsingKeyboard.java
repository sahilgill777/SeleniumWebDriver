package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToScrollUsingKeyboard {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.selenium.dev/");
		Actions action=new Actions(driver);
		action.sendKeys(Keys.PAGE_DOWN).perform();
		action.sendKeys(Keys.END).perform();
		action.sendKeys(Keys.PAGE_UP).perform();
		

	}

}
