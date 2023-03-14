package dhinakaran;

import java.util.Scanner;

public class marks {

	public static void main(String[] args) 
	{
		Double a,b,c,d,e,f,g;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter values for a,b,c,d,e");
		a=s.nextDouble();
		b=s.nextDouble();
		c=s.nextDouble();
		d=s.nextDouble();
		e=s.nextDouble();
		f=a+b+c+d+e;   
		System.out.println("Total mark is "+f);
		g=f/5;
		System.out.println("Mark average is "+g);
		{
		if((f>=375))
			System.out.println("Grade is A");
		else if((f>=250)&&(f<=374))
			System.out.println("Grade is B");
		else if((f>=175)&&(f<=249))
			System.out.println("Grade is C");
		else if((f<=174))
			System.out.println("Grade is D");	
		}
		
		{
		if((a>=35)&&(b>=35)&&(c>=35)&&(d>=35)&&(e>=35))
			System.out.println("Result is Pass");
		
		else
		{
			System.out.println("Result is Failed");
			
		}
	  }
	}
	
}
		
		
		
		

	