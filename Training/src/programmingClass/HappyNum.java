package programmingClass;

public class HappyNum {

	public static void main(String[] args) {

		int n=23;
		int temp=n;
		while(n>9)
		{
			int sum=0;
			while(n!=0)
			{
				int d=n%10;
				sum=sum+d*d;
				n=n/10;
			}
			n=sum;
		}
		if(n==7||n==1)
		{
			System.out.println(temp+" is a happy number");
		}
		else
			System.out.println(temp+" is not a happy number");
	}

}
