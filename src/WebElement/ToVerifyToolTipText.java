package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyToolTipText {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//li[text()='With ToolTip']")).click();
		String nameTextBoxToolTipText = driver.findElement(By.id("name")).getAttribute("title");
		System.out.println(nameTextBoxToolTipText);

	}

}
