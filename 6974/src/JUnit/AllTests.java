package JUnit;

import org.junit.runner.RunWith;

import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestCase1Division.class, TestCase1Multiplication.class, TestCase1Subtraction.class,
		TestCase1Test.class })
public class AllTests 
{

}
