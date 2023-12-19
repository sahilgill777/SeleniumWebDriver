package webDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToNavigateToTheUrl {

	public static void main(String[] args) {
		// 1. Launching an empty chrome browser
	ChromeDriver driver = new ChromeDriver();
	// 2. Navigating to the main url
	driver.get("https://www.selenium.dev/");

	}

}
