package webDriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSetThePosition {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		Point pos=new Point(100,200);
		driver.manage().window().setPosition(pos);
//If point is not importing control+space
	}

}
