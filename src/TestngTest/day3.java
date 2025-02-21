package TestngTest;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {

	@Parameters({"URL","text"})
	@Test(timeOut=4000)
	public void WebLoginCarLoan(String urlName,String name)
	{
		System.out.println("weblogincar");
		System.out.println(urlName +"----"+name);
	}
	@Test(groups= {"Smoke"})
	public void MobileLoginCarLoan()
	{
		System.out.println("mobilelogincar");
	}
	@BeforeMethod
	public void bm()
	{
		System.out.println("I am executed before each method of day3.");
	}
	@BeforeClass
	public void bc()
	{
		System.out.println("I am executed before any  method of day3.");
	}
	@Test(enabled=false)
	public void MobileSignInCarLoan()
	{
		System.out.println("mobilesignincar");
	}
	@Test(dependsOnMethods= {"WebLoginCarLoan","LoginAPICarLoan"})
	public void MobileSignOutCarLoan()
	{
		System.out.println("mobilesignoutcar");
	}
	@Test(dependsOnMethods= {"WebLoginCarLoan"})
	public void LoginAPICarLoan()
	{
		System.out.println("APIlogincar");
	}
	@Test(dataProvider="getData")
	public void M1(String user, String password)
	{
		System.out.println(user +"----"+password);
	}
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[3][2];
		data[0][0]="firstUsername";
		data[0][1]="pwd1";
		data[1][0]="secondUsername";
		data[1][1]="pwd2";
		data[2][0]="thordUsername";
		data[2][1]="pwd3";
		return data;
	}
}
