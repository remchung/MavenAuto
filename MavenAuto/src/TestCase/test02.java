package TestCase;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.*;
import Utils.ReadProperties;

public class test02 {
  @Test
  public void f() 
  {
	 Assert.assertEquals(ReadProperties.getProperty("environment"), "chrome");
	  
  }
}
