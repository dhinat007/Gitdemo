package dhinakaran;

import java.util.Scanner;

public class biggestnumber {

	public static void main(String[] args) 
	{
		Double a,b,c,d,e,f;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter values for a,b,c,d,e,f");
		a=s.nextDouble();
		b=s.nextDouble();
		c=s.nextDouble();
		d=s.nextDouble();
		e=s.nextDouble();
		f=s.nextDouble();
		if((a>b)&&(a>c)&&(a>d)&&(a>e)&&(a>f))
			System.out.println("A is biggest"+a);
		else if((b>a)&&(b>c)&&(b>d)&&(b>e)&&(b>f))
			System.out.println("B is biggest"+b);
		else if((c>a)&&(c>b)&&(c>d)&&(c>e)&&(c>f))
			System.out.println("C is biggest"+c);
		else if((d>a)&&(d>b)&&(d>c)&&(d>e)&&(d>f))
			System.out.println("D is biggest"+d);
		else if((e>a)&&(e>b)&&(e>c)&&(e>c)&&(e>f))
			System.out.println("E is biggest"+e);
		else if((f>a)&&(f>b)&&(f>c)&&(f>d)&&(f>e))
			System.out.println("F is biggest"+f);	

	}

}