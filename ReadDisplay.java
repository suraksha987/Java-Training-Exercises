package myproject;
import java.util.Scanner;
public class ReadDisplay {

	public static void main(String[] args) {
		int roll;
		String name;
		double salary;
		
		
	     try( Scanner scn=new Scanner(System.in))
	     {
	 		System.out.println("Enter Your Roll Nunber");
			roll=scn.nextInt();
		    scn.nextLine();
			
		     System.out.println("Enter Your Name");
		    name=scn.nextLine();
		     System.out.println("Enter Your Salary");
		     salary=scn.nextDouble();
		     
		     
		     System.out.println("your Name: "+name);
		     System.out.println("Your Roll Number: "+roll);
		     System.out.println("Your :  "+salary);
	     }

	}

}
