package programmingClass;

import java.util.Scanner;

public class NumberOfDigits {

	public static int digits(int n)
	{
		int count=0;
		while(n!=0)
		{
			count++;
			n=n/10;
		}
		return count;
	}
	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		System.out.println(digits(n));
	}

}
