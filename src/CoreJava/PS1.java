package CoreJava;

import org.testng.annotations.Test;

public class PS1 extends PS{

	@Test
	public void operation()
	{
		int a=5;
		doThis();
		PS2 ps2=  new PS2(6); //Parameterized constructor
//Constructor - default constructor created automatically 
//when no parameters passed 
		
//When parameter is passed need to create parameterized 
//constructor in class for object is created and call it explicitly
//class variable - scope within class defined
//instance variable - scope within method defined
		System.out.println(ps2.increment());
		System.out.println(ps2.decrement());
		//PS3 ps3=  new PS3(3); --no need to create object of ps3 as ps2 inherits ps3
		//System.out.println(ps2.multipyTwo());
		System.out.println(ps2.multipyThree());
	}

}
