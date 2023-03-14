package dhinakaran;

import java.util.Scanner;
public class tcircumference 
{

	public static void main(String[] args) 
	{
		Double k,a,b,c,d,e,f,g;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter side 1 of the triangle");
		a=s.nextDouble();
		System.out.println("Enter side 2 of the triangle");
		b=s.nextDouble();
		System.out.println("Enter side 3 of the triangle");
		c=s.nextDouble();
		d=a*b;
		e=b*c;
		f=c*a;
		g=d+e+f;
		k=3*g;
		System.out.println("Circumference of the Triangle is "+k);
		
		}
}