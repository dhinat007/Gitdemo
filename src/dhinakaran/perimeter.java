package dhinakaran;

import java.util.Scanner;
public class perimeter 
{

	public static void main(String[] args) 
	{
		Double p,l,b;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter length of the rectangle");
		l=s.nextDouble();
		System.out.println("Enter breadth of the rectangle");
		b=s.nextDouble();
		p=2*(l+b);   
		System.out.println("Perimeter of the rectangle is "+p);
		
		}
}