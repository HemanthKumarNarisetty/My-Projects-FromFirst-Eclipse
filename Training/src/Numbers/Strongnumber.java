package Numbers;

public class Strongnumber {

	public static void main(String[] args) {

		int n=146;
		int temp=n;
		int strong=0;
		while(n!=0)
		{
			int d=n%10;
			int fact=1;
			for (int i=1;i<=d;i++)
			{
				fact=fact*i;
			}
			strong=strong+fact;
			n=n/10;
		}
		if(temp==strong)
		{
			System.out.println(temp+" is a strong number");
		}
		else
			System.out.println(temp+" is not a strong number");
	}

}
