package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BaseClass {
	@BeforeSuite
	public void bs()
	{
		System.out.println("Data Base connection has been established");
	}
	
	@BeforeClass
	public void bc()
	{
		System.out.println("Browser has been launched");
		System.out.println("The URL is navigated");
	}
	
	@BeforeMethod
	public void bm()
	{
		System.out.println("The user has logged in");
	}
	
	@AfterMethod
	public void am()
	{
		System.out.println("The user has logged out");
	}
	
	@AfterClass
	public void ac()
	{
		System.out.println("The browser has been closed");
	}
	
	@AfterSuite
	public void as()
	{
		System.out.println("The data connection has been closed");
	}
	@Test
	public void testCase()
	{
		System.out.println("The test base has been run");
	}
	

}
