package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/button/buttonDoubleClick");
		WebElement yesButton = driver.findElement(By.xpath("//p[text()='1. Are you satisfied with the registration process?']/..//button[text()='Yes']"));
		Actions action=new Actions(driver);
		action.doubleClick(yesButton).perform();
	}

}
