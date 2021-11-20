package programmingClass;

public class RangeOfCountDigits {

	public static void count(int n)
	{
		int count=0;
		while(n!=0)
		{
			count++;
			n=n/10;
		}
		System.out.println(count);
	}
	public static void main(String[] args) {

		int n=20;
		for(int i=1;i<n;i++)
		{
			count(i);
		}
	}

}
