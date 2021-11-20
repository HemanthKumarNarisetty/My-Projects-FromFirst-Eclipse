package numberTheory;

public class DeseringNUm {

	public static void Desrium(int n) {

		int temp=n;
		int sum=0;
		int count=count(n);
		while(n>0)
		{
			int d=n%10;
			sum=sum+power(d,count);
			n=n/10;
			count--;
		}
		if(temp==sum)
		{
			System.out.println(temp+" is Deserium num");
		}
	}
	public static int count(int n)
	{
		int count=0;
		while(n>0)
		{
			n=n/10;
			count++;
		}
		return count;
	}
	public static int power(int n,int p)
	{
		int sum=1;
		while(p>0)
		{
			sum=sum*n;
			p--;
		}
		return sum;
	}

	public static void main(String[] args)
	{
		int n=200;
		for(int i=1;i<n;i++)
		{
			Desrium(i);
		}
	}
}
