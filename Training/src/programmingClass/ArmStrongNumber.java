package programmingClass;

public class ArmStrongNumber {

	public static int count(int n)
	{
		int count=0;
		while(n>0)
		{
			count++;
			n=n/10;
		}
		return count;
	}
	public static void main(String[] args) {

		int n=152;
		int temp=n;
		boolean r=isAmStrong(n);
		if(r)
		{
			System.out.println(temp+" is a amstrong number");
		}
		else
			System.out.println(temp+" is not a amstrong number");
		
	}
	public static int pw(int n,int p)
	{
		int pw=1;
		while(p>0)
		{
			pw=pw*n;
			p--;
		}
		return pw;
	}
	public static boolean isAmStrong(int x) {
		int nd=count(x);
		int t=x;
		int sum=0;
		while(t!=0)
		{
			int d=t%10;
			sum=sum+pw(d,nd);
			t=t/10;
		}
		if(sum==x)
		{
			return true;
		}
		return false;
		
	}

}
