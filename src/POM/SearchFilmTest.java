package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchFilmTest {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.com/");
		
		GoogleHomePage page=new GoogleHomePage(driver);
		page.searchQuerry("Animal");
		
		driver.navigate().refresh();
		page.searchQuerry("Sam Bahadur");

	}

}
