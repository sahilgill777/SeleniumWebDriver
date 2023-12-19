package AutoSuggestion;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetAllAutoSuggestion {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("hadh kar di aapne");
		List<WebElement> allSuggestions = driver.findElements(By.xpath("//div[contains(@aria-label, 'hadh kar di aapne')]"));
		for(WebElement sug:allSuggestions)
		{
			System.out.println(sug.getText());
		}

	}

}
