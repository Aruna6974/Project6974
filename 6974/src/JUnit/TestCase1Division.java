package JUnit;

import static org.junit.Assert.*;


import org.junit.Test;

public class TestCase1Division {

	@Test
	public void test() 
	{
		TestCase1 obj=new TestCase1();
		int actualResult=obj.div(30,3);
		
		assertEquals(10,actualResult);
		
	}

}
