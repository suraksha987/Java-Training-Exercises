package myproject;
import java.util.Scanner;


public class ConditionChecking_if {

	public static void main(String[] args) {
		int marks;
		
		try(Scanner scn=new Scanner(System.in))
		{
			System.out.println("Enter Marks ");
			marks=scn.nextInt();
			scn.nextLine();
			if(marks<0 || marks >100)
			{
				System.out.println("Please Enter The Valid Marks");
			}
			
		else
			{
				if(marks>81)
				{
					System.out.println("Distinction");
				}
				
				else if(marks>61)
				{
					System.out.println("First Class");
				}
				
				else if(marks>51)
				{
					System.out.println("Secound Class");
				}
				else
				{
					System.out.println("Failed");
				}
			}

		}
	

	}

}
