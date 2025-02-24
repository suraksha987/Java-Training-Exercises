package myproject;
import java.util.Scanner;
public class Addition {

	public static void main(String[] args) {
		
		int num1;
		int num2;
		
		try(Scanner scn = new Scanner(System.in))
{
	System.out.println("Enter First Number");
	num1=scn.nextInt();
	System.out.println("Enter Secound Number");
    num2=scn.nextInt();
    System.out.println("Result of Addition is: "+(num1+num2));
}
		

	}

}
