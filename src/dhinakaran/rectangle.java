package dhinakaran;

import java.util.Scanner;
public class rectangle 
{

	public static void main(String[] args) 
	{
		Double a,l,b;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter length of the rectangle");
		l=s.nextDouble();
		System.out.println("Enter breadth of the rectangle");
		b=s.nextDouble();
		a=l*b;
		System.out.println("Area of the rectangle is "+a);
		
		}
}
