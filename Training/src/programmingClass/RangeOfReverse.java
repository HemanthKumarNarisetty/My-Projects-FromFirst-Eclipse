package programmingClass;

public class RangeOfReverse {

	public static void reverse(int n)
	{
		int rev=0;
		while(n!=0)
		{
			int d=n%10;
			rev=rev*10+d;
			n=n/10;
		}
		System.out.println(rev);
	}
	public static void main(String[] args) {

		int n=30;
		for(int i=21;i<n;i++)
		{
			reverse(i);
		}
		
	}

}
