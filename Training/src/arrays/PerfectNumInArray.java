package arrays;

public class PerfectNumInArray {

	public static void perfect(int n)
	{
		int sum=0;
		int t=n;
		for(int j=1;j<=t/2;j++)
		{
			if(t%j==0)
			{
				sum=sum+j;
			}
		}
		if(sum==t)
		{
			System.out.println(t+" is a perfect num");
		}
	}
	public static void main(String[] args) {

		int [] n= {2,3,4,6,7,10};
		for(int i=0;i<n.length;i++)
		{
			perfect(n[i]);
		}
	}

}
