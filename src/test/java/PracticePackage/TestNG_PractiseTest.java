package PracticePackage;

import org.testng.annotations.Test;

public class TestNG_PractiseTest {
@Test(invocationCount = 5)
public void M1() 
{
	System.out.println("book appointment");
	int[]a= {1,2,3};
	System.out.println(a[5]);
}
@Test(dependsOnMethods = "M1")
public void M2()
{
System.out.println("editb profile");	
}
@Test(dependsOnMethods = "M1")
public void M3()
{
	System.out.println("cancel appointment");
}

}
