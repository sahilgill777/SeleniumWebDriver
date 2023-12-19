package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser {
	WebDriver driver;
	@Parameters("browser")
	@Test
	public void facebookTest(String browserToLaunch)
	{
		if(browserToLaunch.equals("chrome")) {
		 driver=new ChromeDriver();
	}
		if(browserToLaunch.equals("firefox")) {
			 driver=new FirefoxDriver();
		}
		if(browserToLaunch.equals("edge")) {
			 driver=new EdgeDriver();
		}
		driver.get("https://www.facebook.com/");
	

}
}
