package TestngTest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 {

	@AfterTest
	public void lastLogin()
	{
		System.out.println("Last execution");
	}
	@Test(groups= {"Smoke"})
	public void WebLoginHomeLoan()
	{
		System.out.println("webloginhome");
	}
	@AfterMethod
	public void am()
	{
		System.out.println("I am executed after each method of day4.");
	}
	@Parameters({"URL"})
	@Test
	public void MobileLoginHomeLoan(String urlName)
	{
		System.out.println("mobileloginhome");
		System.out.println(urlName);
	}
	@AfterClass
	public void ac()
	{
		System.out.println("I am executed after all  methods of day4.");
	}
	@Test
	public void LoginAPIHomeLoan()
	{
		System.out.println("APIloginhome");
	}
}
