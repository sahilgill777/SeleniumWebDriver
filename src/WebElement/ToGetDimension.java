package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetDimension {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demoapps.qspiders.com/image");
		Dimension imageDim = driver.findElement(By.xpath("//img[@alt='order placed']")).getSize();
		System.out.println(imageDim);
		int imageWidth = imageDim.getWidth();
		int imageHeight = imageDim.getHeight();
		System.out.println(imageWidth);
		System.out.println(imageHeight);

	}

}
