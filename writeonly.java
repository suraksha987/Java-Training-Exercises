package myproject;
import java.util.Scanner;


class write
{
	private String studentName;
	private int roll;
	
	public void setName(String name )
	{
		this.studentName=name;
		System.out.println("Seted Name is "+name);
		
	}
	
	public void setRoll(int studentRoll)
	{
		this.roll=studentRoll;
		System.out.println("Seted Roll is "+roll);
	}
		
}
public class writeonly {

	public static void main(String[] args) {
		
		int roll;
		String name;
		write obj=new write();
		try(Scanner scn=new Scanner(System.in))
		{
			System.out.println("enter Roll Number ");
			roll=scn.nextInt();
			obj.setRoll(roll);
			
			
			
			
			System.out.println("enter Name  ");
			name=scn.next();
			obj.setName(name);
			
			
		}
		
     
	
	}

}
