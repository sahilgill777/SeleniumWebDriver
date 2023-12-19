package webDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyTitle {

	public static void main(String[] args) {
		String expectedTitle="Facebook";
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
		if(actualTitle.contains(expectedTitle))
		{
			System.out.println("PASS: This title is verified");
		}
		else
		{
			System.out.println("Fail: This title is not verified");
		}
		
	}

}
