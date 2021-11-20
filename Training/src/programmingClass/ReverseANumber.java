package programmingClass;

import java.util.Scanner;

public class ReverseANumber {

	public static int reverseNum(int n)
	{
		int rev=0;
		while(n!=0)
		{
			int d=n%10;
			rev=rev*10+d;
			n=n/10;
		}
		return rev;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		System.out.println(reverseNum(n));
	}

}
