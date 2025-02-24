package myproject;
import java.util.Scanner;


class TestStaticVarible
{
	static int x=0;
	void increament()
	{
		x=x+1;
	}
	void Display()
	{
		System.out.println("Value of X is: "+x);
	}
}
public class Static_Variable {

	public static void main(String[] args) {
		
		
		TestStaticVarible obj1=new TestStaticVarible();
		obj1.increament();
		obj1.Display();
		
		TestStaticVarible obj2=new TestStaticVarible();
		obj2.increament();
		obj2.increament();
		obj2.Display();	

	}

}
