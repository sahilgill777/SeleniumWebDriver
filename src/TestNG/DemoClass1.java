package TestNG;

import org.testng.annotations.Test;

public class DemoClass1 extends BaseClass {
	@Test
	public void testCase1()
	{
		System.out.println("The test script 1 has run");
	}
	
	@Test
	public void testCase2()
	{
		System.out.println("The test script 2 has run");
	}

}
