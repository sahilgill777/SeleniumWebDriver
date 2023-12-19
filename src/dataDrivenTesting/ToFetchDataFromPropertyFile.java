package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ToFetchDataFromPropertyFile {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("D:\\Java\\Java Eclipse\\SeleniumAutomation\\testData\\PropertyData.properties");
		Properties prop = new Properties();
		prop.load(fis);
		
		String browserValue = prop.getProperty("browser");
		System.out.println(browserValue);
		String urlValue = prop.getProperty("url");
		System.out.println(urlValue);
		

	}

}
