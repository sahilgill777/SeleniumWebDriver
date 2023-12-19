package TestNG;

import org.testng.annotations.Test;
//How to run  a script multiple times using same data
//Using invocation Count

public class InvocationCount {
	@Test(priority=2)
	public void a()
	{
		System.out.println("Hello");

	}
	@Test(priority=1,invocationCount=5)
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
