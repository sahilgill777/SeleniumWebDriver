 package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CompositeRegisterAction {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/");
		WebElement name = driver.findElement(By.id("name"));
		WebElement email = driver.findElement(By.id("email"));
		WebElement pass= driver.findElement(By.id("password"));
		Actions action=new Actions(driver);
		action.sendKeys(name,"sahilgill").sendKeys(email,"gill@gmail.com").sendKeys(pass,"123@Ds").sendKeys(Keys.ENTER ).perform();

	}

}
