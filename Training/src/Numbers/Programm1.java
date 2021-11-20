package Numbers;

public class Programm1 {
	
	public static void main(String[] args)
	{
		int i=12345;
		int rev=0;
		while (i!=0)
		{
			int d=i%10;
			rev=rev*10+d;
			i=i/10;
		}
		System.out.println(rev);
	}

}
