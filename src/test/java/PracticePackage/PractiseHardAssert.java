package PracticePackage;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PractiseHardAssert 
{
	@Test
	public void create() 	
	{
		System.out.println("-----step1-----");
		System.out.println("-----step2-----");
		System.out.println("-----step3-----");
		assertEquals("A","B");;
		System.out.println("-----step4-----");
		System.out.println("-----step5-----");

	}
	@Test
	public void update()
	{
		System.out.println("-----step6-----");
		System.out.println("-----step7-----");
		assertEquals("X","Y");
		System.out.println("-----step4-----");
		System.out.println("-----step5-----");

	}

}
