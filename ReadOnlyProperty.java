package myproject;

import java.util.Scanner;


class ReadOnly 
{
	private int min=35;
	private int max=100;
	
	public int getminmarks()
	{
		return min;
	}
	public int getmaxmarks()
	{
		return max;
	}
}

public class ReadOnlyProperty {

	public static void main(String[] args) {
		
		ReadOnly obj=new ReadOnly();
		System.out.println("Minimum Marks "+obj.getminmarks());
		System.out.println("Maximum Marks "+obj.getmaxmarks());
	}

}
