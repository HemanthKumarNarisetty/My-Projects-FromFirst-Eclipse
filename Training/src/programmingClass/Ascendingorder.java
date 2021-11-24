package programmingClass;

import java.util.Scanner;

public class Ascendingorder {

	public static void ascending(int a, int b,int c)
	{
		if(a<b&&a<c)
		{
			if(b<c)
			{
				System.out.println(a+" "+b+" "+c);
			}
			else
				System.out.println(a+" "+c+" "+b);
		}
		if(b<a&&b<c)
		{
			if(a<c)
			{
				System.out.println(b+" "+a+" "+c);
			}
			else
				System.out.println(b+" "+c+" "+a);
		}
		if(c<a&&c<b)
		{
			if(a<b)
			{
				System.out.println(c+" "+a+" "+b);
			}
			else
				System.out.println(c+" "+b+" "+a);
		}
			
	}
	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("Enter the 1st numb");
		int m=s.nextInt();
		System.out.println("Enter the 2nd numb");
		int n=s.nextInt();
		System.out.println("Enter the 3rd numb");
		int o=s.nextInt();
		
		ascending(m,n,o);
	}

}
