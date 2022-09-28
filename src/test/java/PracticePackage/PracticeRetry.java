package PracticePackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PracticeRetry 
{
	//@Test(retryAnalyzer = GenericUtilities.RetryImplementationClass.class)
	public void retry() 
	{
		System.out.println("---Test 1---");
		System.out.println("---Test 2---");
		Assert.fail();
		System.out.println("---Test 1---");

		
	}

}
