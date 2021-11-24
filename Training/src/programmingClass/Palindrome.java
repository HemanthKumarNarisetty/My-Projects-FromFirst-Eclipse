package programmingClass;

import java.util.Scanner;

public class Palindrome {

	public static void palin(int n)
	{
		int l=n;
		int res=0;
		while(n!=0)
		{
			int d=n%10;
			res=res*10+d;
			n=n/10;
		}
		if(l==res)
		{
			System.out.println(res);
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			palin(i);
		}
	}

}
