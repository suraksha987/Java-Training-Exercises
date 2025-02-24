package myproject;

import java.util.Scanner;

class Customer_Info
{
	private int cno;
	private String cname;
	
	public int getCno()
	{
		return cno;
	}
	
	public String getCname() 
	{
		return cname;
	}
	
	public void setcno(int CustNum) throws Exception 
	{
		if(CustNum<=0)
		{
			throw new Exception("Customer Number Cannot Be Zeo or Negative");
		}
		else
		{
			this.cno=CustNum;
		}
	}
	
	public void setCname(String custName) throws Exception 
	{
		if(custName.isEmpty())
		{
			throw new Exception ("Cname cant be Null");
		}
		
		else
		{
			this.cname=custName;
		}
	}
	
}
public class Customer {

	public static void main(String[] args)
	{

		int Cnum;
		String Cname;
		try(Scanner scn=new Scanner(System.in))
		{
			Customer_Info obj=new Customer_Info();
			
			try {
				System.out.println("enter Customer Number ");
				Cnum=scn.nextInt();
				scn.nextLine();
				obj.setcno(Cnum);
				
				System.out.println("Enter Customer Name ");
				Cname=scn.nextLine();
				obj.setCname(Cname);
				
				System.out.println("NUmber: "+obj.getCno());
				System.out.println("Name: "+obj. getCname());
		
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
		
	}

}
