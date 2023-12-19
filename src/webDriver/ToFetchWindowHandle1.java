package webDriver;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToFetchWindowHandle1 {
	//Window IDs for different browser must be different

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		String windowID = driver.getWindowHandle();
		System.out.println(windowID);
		// launching another browser
		ChromeDriver driver1 = new ChromeDriver();
		//Fetch the Id of another browser
		 String windowID2 = driver1.getWindowHandle();
		//print the ID of another browser
		System.out.println(windowID2);

	}

}
