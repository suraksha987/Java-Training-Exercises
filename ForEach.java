package myproject;
import java.util.Scanner;


class student {
	
	int srn=1;
	String name="Suraksha";
	public void showResult(int marks)
	{
		System.out.println("Your Marks are "+marks);
		if(marks>35)
		{
			System.out.println("You Have Passed The exam");
		}
		else
		{
			System.out.println("You Have Failed The Exam");
		}
	}
	
}


public class ForEach {

	public static void main(String[] args) {
		int marks;
		try(Scanner scn=new Scanner(System.in))
		
				{
			      student obj=new student();
			      System.out.println("Enter Marks");
			        marks=scn.nextInt();
			        scn.nextLine();
			        System.out.println(" Student Registeration Number is:"+obj.srn);
			        System.out.println("Student Name is : "+obj.name);
			        obj.showResult(marks);
			        
				}
		
		

	}

}
