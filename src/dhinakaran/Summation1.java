package dhinakaran;

import java.util.Scanner;
public class Summation1 
{

	public static void main(String[] args) 
	{
		int n,i,sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter value for n");
		n=s.nextInt();
		for(i=1;i<=n;i=i+2)
		{
			sum=sum+i;
			System.out.println(sum);
		}
		System.out.println(sum);

	}

}