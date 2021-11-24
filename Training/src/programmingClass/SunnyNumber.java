package programmingClass;

import java.util.Scanner;

public class SunnyNumber {

	public static  boolean sunny(int n)
	{
		int s=n+1;
		for(int i=1;i<n;i++)
		{
			if((i*i)==s)
			{
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int m=s.nextInt();
		if(sunny(m))
		{
			System.out.println(m+" is a sunny");
		}
		else
			System.out.println(m+" is not a sunny");
	}

}
