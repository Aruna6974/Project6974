package JUnit;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCase1Multiplication 
{

	@Test
	public void test() 
	{
		TestCase1 obj=new TestCase1();
		
		int actualResult=obj.mul(20,10);
		
		assertEquals(200,actualResult);
	}

}
