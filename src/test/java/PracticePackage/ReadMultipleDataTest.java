package PracticePackage;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import GenericUtilities.ExcelUtility;

public class ReadMultipleDataTest {
	@Test(dataProvider = "getData")	
	public void hotelMenu(String items,String price)
	{
		System.out.println(items+"------>"+price);
	}
	{
		System.out.println();
	}
	@DataProvider 
	public Object[][] getData() throws Throwable
	{
		ExcelUtility eLib = new ExcelUtility();
		Object[][] value = eLib.readMultipleSetOfData("Sheet2");
		return value;
	}

}
