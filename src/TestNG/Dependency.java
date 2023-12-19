package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependency {
	@Test(priority=1)
	public void login()
	{
		System.out.println("User is logged in");
	}
	@Test(priority=2)
	public void searchProduct()
	{
		System.out.println("Product is found");
	}
	@Test(priority=3,dependsOnMethods="searchProduct")
	public void addToCart()
	{
		Assert.fail();
		System.out.println("Product is added to cart");
	}
	@Test(priority=4,dependsOnMethods="addToCart")
	public void payment()
	{
		System.out.println("Payment is successful");
	}
	@Test(priority=5)
	public void logout()
	{
		System.out.println("User is logged out");
	}
	
	

}
