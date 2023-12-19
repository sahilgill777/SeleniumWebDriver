package TestNG;

import org.testng.annotations.Test;

public class Group {
	@Test(groups="smoke")
	public void eatFood()
	{
		System.out.println("Eat Food");
	}
	@Test(groups="smoke")
	public void wearClothes()
	{
		System.out.println("Wear Clothes");
	}
	@Test(groups="smoke")
	public void education()
	{
		System.out.println("Education");
	}
	@Test(groups="reg")
	public void buyCar()
	{
		System.out.println("Buy Car");
	}
	@Test(groups="reg")
	public void goVacation()
	{
		System.out.println("Go to vacation");
	}
}
