package programmingClass;

public class Square {

	public static int square(int n,int x)
	{
		int res=1;
		while(n>0)
		{
			res=res*x;
			n--;
		}
		return res;
	}
	public static void main(String[] args) {
		System.out.println("Result: "+square(3,2));
		System.out.println("Result: "+square(4,2));
	}

}
