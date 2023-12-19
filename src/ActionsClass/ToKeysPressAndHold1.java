package ActionsClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToKeysPressAndHold1 {

	public static void main(String[] args) {
		int count=1;
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.selenium.dev/");
		List<WebElement> allLinks = driver.findElements(By.xpath("//a[@class='nav-link']"));
		 Actions action=new Actions(driver);
		 action.keyDown(Keys.CONTROL).perform();
		 for(WebElement x:allLinks)
		 {
			 while(count<=3)
			 {
			 x.click();
			 count++;
			 }
		 }
		 action.keyUp(Keys.CONTROL).perform();

	}




	}


