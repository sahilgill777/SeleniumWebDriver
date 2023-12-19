package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyCssInfo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/button");
		WebElement yesButton = driver.findElement(By.xpath("(//button[text()='Yes'])[1]"));
		String yesButtonBeforeClick = yesButton.getCssValue("background-color");
		System.out.println(yesButtonBeforeClick);
		yesButton.click();
		Thread.sleep(3000);
		String yesButtonAfterClick = yesButton.getCssValue("background-color");
		System.out.println(yesButtonAfterClick);
		 if(!yesButtonBeforeClick.equals(yesButtonAfterClick))
		 {
			 System.out.println("PASS:::::");
		 }
		 else
		 
			 System.out.println("FAIL :::");
		 
		
	}

}
