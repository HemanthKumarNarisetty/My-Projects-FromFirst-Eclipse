package programmingClass;

import java.util.Scanner;

public class PerfectSquare {

	public static boolean perfectsquare(int n)
	{
		for(int i=1;i<=n;i++) {
			if((i*i)==n)
			{
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(perfectsquare(i))
			{
				System.out.println(i+" is a perfect square");
			}
		}
		
	}

}
