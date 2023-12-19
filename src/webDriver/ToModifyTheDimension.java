package webDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToModifyTheDimension {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		Dimension dim=new Dimension(500,800);
		driver.manage().window().setSize(dim);

	}

}
