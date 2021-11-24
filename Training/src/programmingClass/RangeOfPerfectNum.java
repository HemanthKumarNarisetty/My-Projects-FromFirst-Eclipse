package programmingClass;

public class RangeOfPerfectNum {

	public static void perfect(int n)
	{
		int sum=0;
		for(int i=1;i<=n/2;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==n)
		{
			System.out.println(n+" is aperfect number");
		}
	}
	public static void main(String[] args) {

		int n=200;
		for(int i=0;i<=n;i++)
		{
			perfect(i);
		}
	}

}
