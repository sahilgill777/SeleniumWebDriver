package RunTimePolymorphism;

import org.openqa.selenium.WebDriver;

public class Test {
	public static void verifyingGoogleTitle(WebDriver driver)
	{
		driver.manage().window().maximize();
		driver.get("https://google.com/");
		String currentTitle = driver.getTitle();
		if(currentTitle.contains("Google"))
		{
			System.out.println("PASS:It matches");
		}
		else
			System.out.println("It does not matches");
	}
	public static void verifyingGooglePageContent(WebDriver driver,String content)
	{
		driver.manage().window().maximize();
		driver.get("https://google.com/");
		String currentPageSource = driver.getPageSource();
		if(currentPageSource.contains(content))
		{
			System.out.println("Pass......Page source matches");
		}
		else
			System.out.println("Fail....page source doesnt matches");
	}
	public static void verifyingGoogleUrl(WebDriver driver)
	{
	driver.manage().window().maximize();
	driver.get("https://google.com/");
	String currentURL = driver.getCurrentUrl();
	if(currentURL.contains("google"))
	{
		System.out.println("PASS:It matches");
	}
	else
		System.out.println("It does not matches");
}
}
