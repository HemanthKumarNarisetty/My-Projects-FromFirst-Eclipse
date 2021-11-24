package programmingClass;

public class RangeOfUnique {

	public static void unique(int n)
	{
		int temp=n;
		boolean isUnique=true;
		while(n>0)
		{
			int d=n%10;
			int sd=n/10;
			while(sd>0)
			{
				int d1=sd%10;
				if(d==d1)
				{
				isUnique=false;
				}
				sd=sd/10;
			}
			n=n/10;
		}
		if(isUnique)
		{
			//System.out.println(temp+" is a unique");
		}
		else
			System.out.println(temp+" is not a unique");
		
	}
	public static void main(String[] args) {

		int n=30;
		for(int i=1;i<n;i++)
		{
		unique(i);
		}
	}

}
