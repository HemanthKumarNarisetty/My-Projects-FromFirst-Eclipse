package programmingClass;

public class UniqueNum {

	public static boolean unique(int n)
	{
		boolean unique=true;
		while(n>0)
		{
			int d=n%10;
			int sd=n/10;
			while(sd>0)
			{
				int n1=sd%10;
				if(d==n1)
				{
					unique=false;
					break;
				}
				sd=sd/10;
			}
			n=n/10;
		}
		return unique;
		
	}
	public static void main(String[] args) {
		int n=1233;
		if(unique(n))
		{
			System.out.println(n+" its a unique");
		}
		else
			System.out.println(n+" its not a unique");
	}

}
