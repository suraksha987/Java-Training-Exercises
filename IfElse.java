package myproject;
import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int marks;
		try(Scanner scn= new Scanner(System.in))
		{
			System.out.println("Enter Maks To Check :");
			marks=scn.nextInt();
			scn.nextLine();
			if(marks>35)
			{
				System.out.println("Congralations!!");
				System.out.println("Your are Pass");
			}
			else
			{
				System.out.println("Better Luck Next Time");
				System.out.println("You Have Failed ");
			}
		}
		

	}

}
