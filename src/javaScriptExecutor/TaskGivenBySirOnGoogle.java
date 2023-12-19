package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskGivenBySirOnGoogle {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.com/");
		WebElement text = driver.findElement(By.id("APjFqb"));
		text.sendKeys("download java 11");
		text.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("(//h3[text()='Java SE 11 Archive Downloads'])[1]")).click();
		driver.findElement(By.xpath("//a[text()='jdk-11.0.20_linux-aarch64_bin.rpm']")).click();
		WebElement unabledButton = driver.findElement(By.xpath("//a[@class='download-file icn-download-locked']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeAsyncScript("arguments[0].click()", unabledButton);
		

	}

}
