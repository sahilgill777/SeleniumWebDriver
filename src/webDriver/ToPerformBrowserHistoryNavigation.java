package webDriver;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformBrowserHistoryNavigation {

	public static void main(String[] args) {
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("https://www.google.com/");
		 Navigation nav = driver.navigate();
		 nav.to("https://www.facebook.com/");
		 //nav.forward();
		 nav.back()	;
		// nav.refresh();
		// driver.navigate().to("https://www.facebook.com/");
		 }

}
