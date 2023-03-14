package dhinakaran;

import java.util.Scanner;

public class seniorcitizencheck {

	public static void main(String[] args) 
	{
		int age;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a person age");
		age=s.nextInt();
		if(age>=60)
		{
		System.out.println("Person is qualified to be a Senior Citizen");
		}
	}

}
