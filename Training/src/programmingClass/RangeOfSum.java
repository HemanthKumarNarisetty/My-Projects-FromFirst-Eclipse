package programmingClass;

public class RangeOfSum {

	public static void sum(int n) {
		int sum=0;
		while(n!=0)
		{
			int d=n%10;
			sum=sum+d;
			n=n/10;
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {

		int n=20;
		for(int i=11;i<=n;i++)
		{
			sum(i);
		}
	}

}
