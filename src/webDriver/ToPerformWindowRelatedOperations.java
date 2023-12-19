package webDriver;

import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformWindowRelatedOperations {

	public static void main(String[] args) {
	
ChromeDriver driver = new ChromeDriver();
		Options man = driver.manage();
		Window win = man.window();
		win.maximize();
		win.minimize();
		win.fullscreen();
		//driver.manage().window().maximize();


	}

}
