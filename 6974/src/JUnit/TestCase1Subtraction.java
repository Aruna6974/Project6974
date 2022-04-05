package JUnit;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCase1Subtraction {

	@Test
	public void test() 
	{
		TestCase1 obj=new TestCase1();
		
		int actualResult=obj.sub(30,20);
		
		assertEquals(10,actualResult);
	}

}
