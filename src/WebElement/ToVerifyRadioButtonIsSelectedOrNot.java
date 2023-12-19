package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyRadioButtonIsSelectedOrNot {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demoapps.qspiders.com/radio");
		 
		WebElement statusOfRadio = driver.findElement(By.name("Attended"));
		statusOfRadio.click();
		boolean radio = statusOfRadio.isSelected();	
		System.out.println(radio);
		if(radio)
		{
			System.out.println("PASS : The radio is selected");
		}
		else
		{
			System.out.println("FAIL : The radio is not selewcted");
		}

	}

}
