package myproject;
import java.util.Scanner;


class staticVariable{
	private static int roll;
	private static String name;
	
	public static int getroll()
	{
		return roll;
	}
	public static String getname()
	{
		return  name;
	}
	
	public static void setroll(int rollnumber)
	{
		roll=rollnumber;
	}
	public static void setname(String studentname)
	{
		name=studentname;
	}
	
}
public class Static {

	public static void main(String[] args) {
		
		
		int sno;
		String sname;
		
		try(Scanner scn=new Scanner(System.in))
				{
			            System.out.println("Enter Student Roll Nunber");
			            sno=scn.nextInt();
			            scn.nextLine();
			            
			            System.out.println("Enter Student Name");
			            sname=scn.nextLine();
			            
			            staticVariable.setroll(sno);
			            staticVariable.setname(sname);
			            
			           System.out.println("Roll Number is  "+staticVariable.getroll()); 
			           System.out.println("Name  is "+staticVariable.getname()); 
			              
				}

	}

}
