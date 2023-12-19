package webDriver;

import java.util.Set;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToOenAllNewTabOrWindow {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String windowIDForGoogle = driver.getWindowHandle();
		System.out.println(windowIDForGoogle);
		//driver.switchTo().newWindow(WindowType.WINDOW);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.facebook.com/");
		String windowIdForFacebook = driver.getWindowHandle();
		System.out.println(windowIdForFacebook);
		Set<String> allIds = driver.getWindowHandles();
		System.out.println(allIds);
		

	}

}
