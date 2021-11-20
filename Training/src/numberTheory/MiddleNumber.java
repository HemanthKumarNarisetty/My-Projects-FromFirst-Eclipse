package numberTheory;

public class MiddleNumber {

	public static void main(String[] args) {

		int n1=30;
		int n2=20;
		int n3=40;
		if(n1>n2 && n1>n3)
		{
			if(n2>n3)
			{
				System.out.println(n2);	
			}
			else
				System.out.println(n3);
		}
		else if(n2>n1 && n2>n3)
		{
			if(n1>n3)
			{
				System.out.println(n1);
			}
			else
				System.out.println(n3);
		}
		else if(n3>n1 && n3>n2)
		{
			if(n1>n2)
			{
				System.out.println(n1);
			}
			else
				System.out.println(n2);
		}
	}

}
