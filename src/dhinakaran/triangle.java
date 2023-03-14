package dhinakaran;

import java.util.Scanner;
public class triangle 
{

	public static void main(String[] args) 
	{
		Double a,b,h;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter base of the triangle");
		b=s.nextDouble();
		System.out.println("Enter height of the triangle");
		h=s.nextDouble();
		a=0.5*b*h;
		System.out.println("Area of the Triangle is "+a);
		
		}
}
