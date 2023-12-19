package RunTimePolymorphism;

import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

	public static void main(String[] args) {
		
		Test.verifyingGoogleTitle(new ChromeDriver());
		Test.verifyingGooglePageContent(new ChromeDriver(),"Search");
		Test.verifyingGoogleUrl(new ChromeDriver());

	}

}
