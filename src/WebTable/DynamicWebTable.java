package WebTable;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTable {

	public static void main(String[] args) {
		String productName="Levis Shirt";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://demoapps.qspiders.com/table/dynamic-table");
		WebElement discount = driver.findElement(By.xpath("//th[text()='"+productName+"']/parent::tr/descendant::td[3]"));
		String dis = discount.getText();
		System.out.println(dis);
		}

}
