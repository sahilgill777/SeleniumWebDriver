package TestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertTest {
	
	@Test
	public void demo()
	{
		int a=420;
		int b=243;
		
		SoftAssert sa= new SoftAssert();
		sa.assertEquals(a, b);
		
		System.out.println("Line before Assertion");
		sa.assertAll();
		System.out.println("Line after assertion");
		//Agr same hga toh dono line print hgi 
		
	}

}
