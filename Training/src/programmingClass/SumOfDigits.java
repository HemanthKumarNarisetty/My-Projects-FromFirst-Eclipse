package programmingClass;

import java.util.Scanner;

public class SumOfDigits {

	public static int sumOfDigit(int n)
	{
		int sum=0;
		while(n!=0)
		{
			int d=n%10;
			sum=sum+d;
			n=n/10;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		System.out.println(sumOfDigit(n));
	}

}
