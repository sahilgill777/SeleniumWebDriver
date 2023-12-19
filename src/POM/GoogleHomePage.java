package POM;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleHomePage {

	public GoogleHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(name="q")
	private WebElement searchBox;

	public WebElement getSearchBox() {
		return searchBox;
	}
	public void searchQuerry(String querry)
	{
		searchBox.clear();
		searchBox.sendKeys(querry);
		searchBox.sendKeys(Keys.ENTER);
		
	}

}
