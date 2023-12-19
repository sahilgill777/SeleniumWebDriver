package webDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToQuitTheBrowser {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.quit();

	}

}
