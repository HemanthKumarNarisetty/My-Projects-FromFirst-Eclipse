package programmingClass;

public class RangeHappyNum {

	public static void happy(int n)
	{
		int temp=n;
		while(n>9)
		{
			int sum=0;
			while(n>0)
			{
				int d=n%10;
				sum=sum+d*d;
				n=n/10;
			}
			n=sum;
		}
		if(n==1||n==7)
		{
			System.out.println(temp+" is a happy number");
		}
	}
	public static void main(String[] args) {
		int n=40;
		for(int i=1;i<n;i++)
		{
			happy(i);
		}
	}

}
