package programmingClass;

public class RangeperfectSquare {

	public static void square(int n)
	{
		for(int i=1;i<n;i++)
		{
			if((i*i)==n)
			{
				System.out.println(n+" is a perfect square");
			}
		}
	}
	public static void main(String[] args) {
		int n=25;
		for(int i=1;i<=n;i++)
		{
			square(i);
		}
		
	}

}
