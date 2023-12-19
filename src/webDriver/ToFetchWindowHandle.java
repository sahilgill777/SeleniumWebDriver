package webDriver;

import org.openqa.selenium.chrome.ChromeDriver;
//Window ID for same browser but different Webpages are same

public class ToFetchWindowHandle {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//Fetch the ID of the browser
		String windowIDForFacebook = driver.getWindowHandle();
		//Print the ID of the browser
		System.out.println(windowIDForFacebook);
		driver.navigate().to("https://www.instagram.com/");
		String windowIdForInstagram = driver.getWindowHandle();
		System.out.println(windowIdForInstagram);
		

	}

}
