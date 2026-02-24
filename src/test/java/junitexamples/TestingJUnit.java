package junitexamples;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestingJUnit 
{

	@Test
	public void testIsPrime()
	{
		 assertTrue(TestPrime.isPrime(13));
	}

	@Test
    public void testIsPrime2()
	{
        assertFalse(TestPrime.isPrime(18));
    }
	
	@Test
	public void testIsEven()
	{
        assertFalse(TestPrime.isEven(19));
	}
	
	@Test
	public void testIsEven1()
	{
        assertTrue(TestPrime.isEven(80));
	}

}
