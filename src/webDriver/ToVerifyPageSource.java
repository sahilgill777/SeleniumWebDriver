package webDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyPageSource {

	public static void main(String[] args) {
		String expectedInfo="India";
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String sourceCode =driver. getPageSource();
		System.out.println(sourceCode);
		if(sourceCode.contains(expectedInfo)) {
			System.out.println("PASS: The page info is verified");
		}
		else
			System.out.println("FAIL: The page info is  not verified");
		
		/*getPageSource():
		 * 1. This method is used to fetch the source code of the web page
		 * source code be of 3 types
		 * HTML
		 * CSS
		 * Java script
		 * 2. It returns string value
		 * 3.Takes no argument
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		

	}

}
