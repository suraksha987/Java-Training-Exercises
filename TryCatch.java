package myproject;
import java.util.Scanner;


public class TryCatch {

	public static void main(String[] args) {
		try {
			int a,b,c;
			Scanner scn=new Scanner(System.in);
			
			System.out.println("Enter First Number");
			a=scn.nextInt();
			System.out.println("Enter Secound Number");
			b=scn.nextInt();
			c=a+b;
			System.out.println("Result is :"+c);		
		}
		catch(Exception e)
		{
			System.out.println("Error Occured "+e.getMessage());
		}
		finally
		{
			System.out.println("Program Over ");
		}

		
	}

}
