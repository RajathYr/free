package PracticePackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class UpdateTheDataFromDatabaseTest 
{
	public static void main(String[] args) throws Throwable
	{
		Connection con=null;
		Driver driver = new Driver();

		//step1:register the database
		DriverManager.registerDriver(driver);

		//step2: get connection for database
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hospital", "root", "root");

		//step3: issue create statement
		Statement stat = con.createStatement();
		String query = "insert into HMS values('Kabali','420','rajajinagardon')";

		// step4: execute query
		int result = stat.executeUpdate(query);

		if(result==1) 
		{
			System.out.println("project inserted sucessfulluy");
		}
		//step5: close database
		con.close();
	}

}
