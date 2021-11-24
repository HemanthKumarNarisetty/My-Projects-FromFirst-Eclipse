package programmingClass;

import java.util.Scanner;

public class Factorial {

	public static int fact(int n)
	{
		int k=1;
		for(int i=2;i<=n;i++)
		{
			k=k*i;
		}
		return k;
	}
	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int l=s.nextInt();
		for(int i=1;i<=l;i++)
		{
		System.out.println(fact(i));
		}
	}

}
