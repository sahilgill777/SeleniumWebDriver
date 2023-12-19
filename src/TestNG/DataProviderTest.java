package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	@Test(dataProvider="data")
	public void food(String city,String food)
	{
		System.out.println("Come to "+city+" and eat "+food+"");
	}
	@DataProvider
	public Object[][] data()
	{
		Object[][]arr=new Object[4][2];
		
		arr[0][0]="Noida";
		arr[1][0]="Delhi";
		arr[2][0]="Gurugram";
		arr[3][0]="Banglore";
		
		arr[0][1]="chaap";
		arr[1][1]="Parantha";
		arr[2][1]="Lassi";
		arr[3][1]="coffee";
		return arr;
	}

}
