package CoreJava;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;

public class PS {
	public void doThis()
	{
	System.out.println("I am here");
	}
@BeforeTest
public void bM()
{
	System.out.println("run first");
}
@AfterMethod
public void LM()
{
	System.out.println("run last");
}
}