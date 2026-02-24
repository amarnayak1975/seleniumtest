package junitexamples;

import org.testng.annotations.Test;

import junit.framework.TestCase;

public class firsttest extends TestCase
{
	@Test
	public void test()
	{
		System.out.println("hi");
	}
}
