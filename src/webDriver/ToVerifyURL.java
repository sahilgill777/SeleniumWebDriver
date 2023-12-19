package webDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyURL {

	public static void main(String[] args) {
		String actualURL="https://www.selenium.dev/";
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.selenium.dev/");
	String currentURL=driver.getCurrentUrl();
	System.out.println(currentURL);
	if(currentURL.equals(actualURL)) {
		System.out.println("PASS:Current URL matches to actualURL");
	}
	else
		System.out.println("FAIL:Current URL is not matching");

	}

}
