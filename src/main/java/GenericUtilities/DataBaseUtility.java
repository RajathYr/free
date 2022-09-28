package GenericUtilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class DataBaseUtility {
	/**
	 * This method is used to get database connection
	 */
	Connection con=null;
	
	public void connectToDB() throws Throwable
	{
	Driver driver = new Driver();
	DriverManager.registerDriver(driver);
	 Connection con = DriverManager.getConnection(IpathInstance.dbURL,IpathInstance.dbUsername,IpathInstance.dbPassword);
	}
	/**
	 * This method will execute the query and return the matching data to the user
	 * @param query
	 * @param columnIndex
	 * @param expData
	 * @return
	 * @throws Throwable
	 */
	public String  executequeryAndGetData(String query, int columnIndex, String expData) throws Throwable
	{
		String data = null;
		boolean flag = false;
		  ResultSet result = con.createStatement().executeQuery(query);
		 while(result.next())
		 {
			 data=result.getString(columnIndex);
			 if(data.equalsIgnoreCase(expData))
			 {
				 flag=true;   //flag rising
				 break;
			 }
			 if(flag)
			 {
				 System.out.println(data+"----------->data verified");
				 return expData;
			 }
			 else
			 {
				System.out.println(data+"------------>data not verified");
				return "";
			 }
		 }
		return data;
	}
	/**
	 * This method is used to close the database
	 * @throws Throwable
	 */
		 public void closeDB() throws Throwable
		 {
			 con.close();
		 }
	
	

}
