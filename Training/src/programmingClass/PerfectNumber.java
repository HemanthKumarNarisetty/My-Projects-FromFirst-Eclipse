package programmingClass;

import java.util.Scanner;

public class PerfectNumber {

	public static int perfectNUm(int n)
	{
		int sum=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		return sum;
	}
	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		if(n==perfectNUm(n))
		{
			System.out.println(n+" is a perfect number");
		}
		else
			System.out.println(n+" is not a prime number");
	}

}
