package dhinakaran;

import java.util.Scanner;
public class circlecircumference 
{

	public static void main(String[] args) 
	{
		Double PI,r,c;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the radius of circle");
		r=s.nextDouble();
		c=2*r*Math.PI;   
		System.out.println("Circumference is "+c);
		
		}
}
