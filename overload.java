package myproject;
import java.util.Scanner;




class TestOverload
{

	void addNumber(int x,int y)
	{
	  System.out.println("Result is: "+(x+y));
	}
	
   void addNumber(float x,float y)
   {
	   System.out.println("Result is: "+(x+y));
   }
   
   void addNumber(int x,int y,int z)
	{
	  System.out.println("Result is: "+(x+y+z));
	}
   
   void addNumber(float x,float y, float z)
   {
	   System.out.println("Result is: "+(x+y+z));
   }
	
	
}
public class overload {

	public static void main(String[] args) {
		
		TestOverload obj= new TestOverload();
		
		int in1,in2,in3,choice;
		float fn1,fn2,fn3;
		
		try(Scanner scn=new Scanner(System.in))
		{
		  
			System.out.println("1.Addition of Two Integer Number");
			System.out.println("2.Addition of Two Float Number");
			System.out.println("3.Addition of Three Integer Number");
			System.out.println("4.Addition of Three Float Number");
			choice=scn.nextInt();
			scn.nextLine();
			switch(choice)
			{
			case 1:
				System.out.println("Enter Two Integer Number");
				in1=scn.nextInt();
				in2=scn.nextInt();
				obj.addNumber(in1,in2);
				break;
				
			case 2:
				System.out.println("Enter Two Float  Number");
				fn1=scn.nextFloat();
			    fn2 = scn.nextFloat();
				obj.addNumber(fn1,fn2);
				break;
			case 3:
				 System.out.println("Enter Three Number ");
				 in1=scn.nextInt();
				 in2=scn.nextInt();
				 in3=scn.nextInt();
				 obj.addNumber(in1, in2,in3);
				 break;
			case 4 :
				System.out.println("Enter Three Float Numver ");
				fn1=scn.nextFloat();
				fn2=scn.nextFloat();
				fn3=scn.nextFloat();
				obj.addNumber(fn1, fn2,fn3);
				break;
				default: 
				System.out.println("Sorry ");
				 
			}
			
		}
	
        
	}

}
