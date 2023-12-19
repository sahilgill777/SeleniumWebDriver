package webDriver;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToParticularWindow {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		//Maximizing
		
		driver.manage().window().maximize();
		//Navigate to the url
		driver.get("https://www.google.com/");
		//Fetching the ID of google
		String googleWindowId = driver.getWindowHandle();
		System.out.println(googleWindowId);
		//Opening a new tab and switching the control
		driver.switchTo().newWindow(WindowType.TAB);
		//Navigating to facebook
		driver.navigate().to("https://www.facebook.com/");
		driver.switchTo().newWindow(WindowType.TAB);
		//Opening a new tab and switching the control
		driver.navigate().to("https://www.instagram.com/");
		//Fetching the title of current window
		String currentWindowTitle = driver.getTitle();
		//Printing the title of current window
		System.out.println("The title of current window is " +currentWindowTitle);
		//Switching control back to google
		driver.switchTo().window(googleWindowId);
		//Fetching the title of google
		String googleWindowTitle = driver.getTitle();
		//Printing the title of google
		System.out.println(googleWindowTitle);
		driver.switchTo().window(currentWindowTitle);
		String titleAgain = driver.getTitle();
		System.out.println(titleAgain);
		
		
		

	}

}
