package myproject;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		try(Scanner  scn= new Scanner(System.in))
		{
			System.out.println("Enter Number");
			number=scn.nextInt();
			scn.nextLine();
			
			if(number>0)
			{
				for(int i=1;i<=10;i++)
						{
					       int result=number*i;
					       System.out.print(number);
					       System.out.print("*");
					       System.out.print(i);
					       System.out.print("=");
					       System.out.println(result);
					       
						}
			}
			else
			{
				System.out.println("Enter Valid Number");
			}
		}
		
	
		
       
		
	}

}
