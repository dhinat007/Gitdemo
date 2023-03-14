package dhinakaran;

import java.util.Scanner;

public class equalnumbers {

	public static void main(String[] args) 
	{
		int a,b;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter values for a,b");
		a=s.nextInt();
		b=s.nextInt();
		
		if(a==b)
			System.out.println("Two numbers are equal");
		else
		{
			System.out.println("Tow numbers are not equal");

		}
		
	}
	
}