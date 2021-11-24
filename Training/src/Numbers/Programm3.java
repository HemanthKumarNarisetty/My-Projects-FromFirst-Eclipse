package Numbers;

public class Programm3 {
	
	public static void main(String[] args)
	{
		int i=123;
		int fact=1;
		while(i!=0)
		{
			int d=i%10;
			fact=fact*d;
			i=i/10;
		}
		System.out.println(fact);
			
	}

}
