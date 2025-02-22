package TestngTest;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class day1 {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
	@Test
	public void Demo()
	{		
System.out.println("Hello");
}
	@Test(groups= {"Smoke"})
	public void second()
	{
		System.out.println("Bye");
		System.out.println("Bye");
		System.out.println("Bye");
		System.out.println("Bye");
		System.out.println("Bye");
	}
	@BeforeSuite
	public void Bfsuite()
	{
		System.out.println("I am the first one on suite");
	}
	@AfterSuite
	public void Afsuite()
	{
		System.out.println("I am the last one in suite");
	}
}
