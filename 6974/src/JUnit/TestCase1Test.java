package JUnit;

import static org.junit.Assert.*;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestCase1Test 
{

	@BeforeClass
	public static void BeforeClass()
	{
		System.out.println("Before Class Test Method");
	}


	@Before
	public void Before()
	{
		System.out.println("Before Method");
	}


	@Test
	public void test() 
	{
		TestCase1 obj=new TestCase1();
	    int actualResult=obj.add(5, 10);
	    
	    
	    assertEquals(15,actualResult);
	    System.out.println("TestCase1");
	}
	
	@After
	public void After() 
	{
		System.out.println("After Method");
	}
	
	@AfterClass
	public static void AfterClass()
	{
		System.out.println("After Class Test Method");
	}

}
