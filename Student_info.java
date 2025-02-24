package myproject;
import java.util.Scanner;
 public class Student {

	
		
			private String sname;
			private int sno;
			
			public String getSname()
			{
				return sname;
			}
			
			public void setSname(String sname)
			{
				if(sname.equals(" "))
				{
					System.out.println("Student name cant be Blank");
				}
				else
				{
					this.sname=sname;
				}
			}
			
			public int getSno()
			{
				return sno;
				
			}
			
			
		 	public void setSno(int sno)
			{
				if(sno<0)
				{
					System.out.println("Student Number cant be Zero  Negative");
				}
				else
				{
					this.sno=sno;
				}
			}

	}
public class Student_info
{
	public static void main (String[] args)
	{
		int sno;
		String sname;
		try(Scanner scn=new Scanner(System.in))
		{
			Student obj=new Student();
		System.out.println("Enter  Student Number:");
		sno=scn.nextInt();
		obj.setSno(sno);
		System.out.println("Enter Student Name ");
		sname=scn.nextLine();
		obj.setSname(sname);
		
		System.out.println("Here is Your Output ");
		
		System.out.println("Stusent Number "+obj.getSno());
		System.out.println("Student Name "+obj.getSname());
			
		}
		
	}
}


