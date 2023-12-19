package webDriver;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Doubt {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		String wow = driver.getWindowHandle();	
		System.out.println(wow);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.instagram.com/");
		String wow2 = driver.getWindowHandle();
		System.out.println(wow2);
		Set<String> wow3 = driver.getWindowHandles();
		System.out.println(wow3);

	}

}
