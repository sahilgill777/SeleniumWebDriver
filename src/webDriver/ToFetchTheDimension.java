package webDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToFetchTheDimension {

	public static void main(String[] args) {
		//Launch The browser
		ChromeDriver driver = new ChromeDriver();
		Options man = driver.manage();
		Window win = man.window();
		Dimension sz = win.getSize();
		System.out.println(sz);
		int wid = sz.getWidth();
		int hei = sz.getHeight();
		System.out.println("The width of the defaulter browser is : "+wid);
		System.out.println("The height of the browser is "+hei);

	}

}
