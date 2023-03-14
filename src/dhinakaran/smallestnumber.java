package dhinakaran;

import java.util.Scanner;

public class smallestnumber {

	public static void main(String[] args) 
	{
		Double a,b,c;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter values for a,b,c");
		a=s.nextDouble();
		b=s.nextDouble();
		c=s.nextDouble();
		if(a<b)
		{
			if(a<c)
				System.out.println(" A is Smallest"+a);
			else
				System.out.println(" C is Smallest"+c);
		}
		else
			if(c<b)
				System.out.println(" C is Smallest"+c);
			else
				System.out.println(" B is Smallest"+b);
		}
		

	}