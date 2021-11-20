package programmingClass;

public class NeoNumber {

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
		else
			System.out.println(n+" is not a neon number");
		
	}
	public static void main(String[] args) {

		int n=9;
		neoNum(n);

	}

}
