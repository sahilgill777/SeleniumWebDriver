package AutoSuggestion;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//span[text()='✕']")).click();
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("mobile");
		List<WebElement> elements = driver.findElements(By.xpath("//li[@class='_3D0G9a']"));
		int noOfElements = elements.size();
		System.out.println(noOfElements);
		for(WebElement x:elements)
		{
			System.out.println(x.getText());
			if(x.getText().contains("mobile cover"))
			{
				x.click();
				break;
			}
		}
	}

}
