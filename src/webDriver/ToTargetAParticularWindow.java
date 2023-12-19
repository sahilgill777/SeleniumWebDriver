package webDriver;

import java.util.Set;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToTargetAParticularWindow {

	public static void main(String[] args) {
		String windowToSwitch = "Facebook";
		// Launch a browser
		ChromeDriver driver = new ChromeDriver();
		//Maximizing
		driver.manage().window().maximize();
		//Navigate to the url
		driver.get("https://google.com/");
		//Opening a new tab and switching the control
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.facebook.com/");
		//Switch to new tab and navigate to other 
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.instagram.com/");
		//Switch to other tab and navigate
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.selenium.dev/");
		Set<String> allWindowID = driver.getWindowHandles();
		System.out.println(allWindowID);
		for(String id:allWindowID)
		{
			driver.switchTo().window(id);
			String currentTitle = driver.getTitle();
			//System.out.println(currentTitle);
			if(currentTitle.contains(windowToSwitch))
			{
				System.out.println(driver.getTitle());
				break;
				
			}
			
		}
		
		
		

	}

}
