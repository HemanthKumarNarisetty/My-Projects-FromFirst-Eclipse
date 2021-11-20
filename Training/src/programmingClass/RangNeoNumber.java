package programmingClass;

public class RangNeoNumber {

	/**
	 * 9^2=81,8+1=9// 9 is neon number
	 * @param n
	 */
	public static void neoNum(int n)
	{
		int sq=n*n;
		int sum=0;
		while(sq!=0)
		{
			int d=sq%10;
			sum=sum+d;
			sq=sq/10;
		}
		if(sum==n)
		{
			System.out.println(n+" is a neon number");
		}
		
	}
	public static void main(String[] args) {

		int n=100;
		for(int i=1;i<n;i++)
		{
		neoNum(i);
		}
	}

}
