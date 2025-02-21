package CoreJava;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;

public class PS {
	public void doThis()
	{
	System.out.println("I am here");
	System.out.println("I am here1");
	System.out.println("I am here2");
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