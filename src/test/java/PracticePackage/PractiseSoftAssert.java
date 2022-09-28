package PracticePackage;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class PractiseSoftAssert 
{
	@Test
	public void create() 
	{
		System.out.println("-----step1-----");
		System.out.println("-----step2-----");
		System.out.println("-----step3-----");
		SoftAssert sa=new SoftAssert();
		sa.assertEquals("A","B");
		System.out.println("-----step4-----");
		System.out.println("-----step5-----");
		sa.assertAll();



		
	}

}
