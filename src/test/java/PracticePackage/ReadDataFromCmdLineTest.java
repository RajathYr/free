package PracticePackage;

import java.io.FileInputStream;

public class ReadDataFromCmdLineTest 
{

	public static void main(String[] args) 
	{
      String BROWSER = System.getProperty("browser");
      String URL = System.getProperty("url");
      String USERNAME = System.getProperty("username");
      String PASSWORD = System.getProperty("password");
      
      System.out.println(BROWSER);
      System.out.println(URL);
      System.out.println(USERNAME);
      System.out.println(PASSWORD);

	}

}
