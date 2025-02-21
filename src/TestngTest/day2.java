package TestngTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {
	@Test(groups= {"Smoke"})
	public void hju()
	{
		System.out.println("Mini");
		System.out.println("Mini");	System.out.println("Mini");	System.out.println("Mini");
	}
	@BeforeTest
	public void first()
	{
		System.out.println("I am executed first");
	}
	
}
