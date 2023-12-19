package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyErrorMsg {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement login = driver.findElement(By.xpath("//div[text()='Login ']"));
		login.click();
		String actualSource = driver.getPageSource();
		if(actualSource.contains( "or"))
		{
			System.out.println("The error msg is verified");
		}
		else
			System.out.println("Error msg is not verified");
	}

}
