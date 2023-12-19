package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
	@Test
	public void demo()
	{
		
	
	String a="Qspiders";
	String b="Jspiders";
	
	Assert.assertEquals(a,b,"Fail -1");
	System.out.println("PASS");
	}
	
	@Test
	public void demo2()
	{
		String s1="Qspiders";
		String s2="spiders";
		Assert.assertTrue(s1.contains(s2),"Fail2");
		System.out.println("PASS2");
	}
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
