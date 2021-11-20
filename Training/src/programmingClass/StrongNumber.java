package programmingClass;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
		int num=i;
		int temp=num;
		int sum=0;
		while(num!=0)
		{
			int d=num%10;
			sum=sum+fact(d);
			num=num/10;
		}
		if(temp==sum)
		{
			System.out.println(temp+" is a strong number");
		}
		}
	}
	public static int fact(int n)
	{
		int fact=1;
		while(n>0)
		{
			fact=fact*n;
			n--;
		}
		return fact;
	}
}
