package numberTheory;

public class P6 {

	public static void main(String[] args) {

		int a=1;
		int a1=a*a;
		int b=2;
		int b1=b*b;
		int c=5;
		int c1=c*c;
		if((a1+b1)==c)
			System.out.println("true");
		else if((b1+c1)==c)
			System.out.println("true");
		else if((c1+a1)==c)
			System.out.println("true");
		else
			System.out.println("false");
	}

}
