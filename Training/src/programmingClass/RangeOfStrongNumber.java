package programmingClass;

public class RangeOfStrongNumber {

	public static void strong(int n)
	{
		int num=n;
		int temp=num;
		int sum=0;
		while(num!=0)
		{
			int d=num%10;
			num=num/10;
			int fact=1;
			while(n>0)
			{
				fact=fact*n;
				n--;
			}
			sum=sum+fact;
		}
		if(sum==temp)
		{
			System.out.println(temp);
		}
	}
	public static void main(String[] args) {

		int n=145;
		for(int i=1;i<=n;i++)
		{
			strong(i);
		}
	}

}
