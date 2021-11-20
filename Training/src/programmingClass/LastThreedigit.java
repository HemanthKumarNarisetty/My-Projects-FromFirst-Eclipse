package programmingClass;

public class LastThreedigit {

	public static void main(String[] args) {

		int num=123456;
		int m=num;
		int count=0;
		int res=0;
		while(m>0)
		{
			count++;
			m=m/10;
		}
		int k=0;
		int rev=0;
		while(num>0&&k<count/2)
		{
			int d=num%10;
			k++;
			rev=rev*10+d;
			num=num/10;
		}
		while(rev>0)
		{
			int d=rev%10;
			res=res*10+d;
			rev=rev/10;
		}
		while(num>0)
		{
			int d=num%10;
			num=num/10;
			rev=rev*10+d;
		}
		while(rev>0)
		{
			int d=rev%10;
			rev=rev/10;
			res=res*10+d;
		}
		System.out.println(res);
	}

}
