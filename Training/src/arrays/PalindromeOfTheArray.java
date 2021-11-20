package arrays;

public class PalindromeOfTheArray {

	public static void palind(int n)
	{
		int rev=0;
		int temp=n;
		while(n>0)
		{
			int d=n%10;
			rev=rev*10+d;
			n=n/10;
		}
		if(temp==rev)
		{
			System.out.println(temp+" is a palindrome");
		}
	}
	public static void main(String[] args) {

		int []n= {121,123,232,230};
		for(int i=0;i<n.length;i++)
		{
			palind(n[i]);
		}
	}

}
