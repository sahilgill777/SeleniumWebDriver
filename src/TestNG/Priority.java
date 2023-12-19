package TestNG;

import org.testng.annotations.Test;

public class Priority {

	@Test(priority=2)
	public void a()
	{
		System.out.println("Hello");

	}
	@Test(priority=1)
	public void b()
	{
		System.out.println("Hey");
	}
	@Test(priority=4)
	public void c()
	{
		System.out.println("How r uh");
	}
	@Test(priority=3)
	public void d()
	{
		System.out.println("Movie");
	}

}
