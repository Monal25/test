package CoreJava;

public class PS2 extends PS3{
int a;
public PS2(int a) {
	// TODO Auto-generated constructor stub
	super(a);//parent class constructor invoked
	//duty of child class to send input received to parent class to activate parent class constructor
	//super is used when there is inheritance & it should be first line in child constructor
	this.a=a;// assigning value to class variable which we get from local variable
}
public int increment()
{
	a=a+1; // refers to class variable a
	return a;
}
public int decrement()
{
	a=a-3;
	return a;
}
}
