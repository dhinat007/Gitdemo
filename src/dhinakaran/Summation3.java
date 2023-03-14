package dhinakaran;

import java.util.Scanner;
public class Summation3 
{

	public static void main(String[] args) 
	{
		int n,i,sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter value for n");
		n=s.nextInt();
		for(i=1;i<n;i++) 
		{ 
			if(n%2 == 1) 
			sum = (n+1)/2;
			System.out.println(sum); 
		}	
			if(n%2 == 0) 
			sum = (-1)*n/2;	
			System.out.println(sum); 
			
			}
			
		
	}

