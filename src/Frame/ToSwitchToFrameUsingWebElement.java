package Frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSwitchToFrameUsingWebElement {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/Sahil%20gill/Desktop/Frame3.html");
		WebElement secondFrame = driver.findElement(By.xpath("//iframe[@src=\"https://demoapps.qspiders.com/\"]"));
		driver.switchTo().frame(secondFrame);
		driver.findElement(By.className("h-full")).click();


	}

}
