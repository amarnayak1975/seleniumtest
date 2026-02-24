package mytestsuits;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest2
{
	@Test
	  public void f()
	  {
		  System.out.println("Before Second Test");

	  }
	  
	  @BeforeTest
	  public void beforeTest() 
	  {
		  System.out.println("Second Test");
	  }

	  @AfterTest
	  public void afterTest()
	  {
		  System.out.println("After Second Test");

	  }

}
