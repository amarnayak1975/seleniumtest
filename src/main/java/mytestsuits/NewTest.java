package mytestsuits;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest
{
  @Test
  public void f()
  {
	  System.out.println("Before First Test");

  }
  
  @BeforeTest
  public void beforeTest() 
  {
	  System.out.println("First Test");
  }

  @AfterTest
  public void afterTest()
  {
	  System.out.println("After First Test");

  }

}
