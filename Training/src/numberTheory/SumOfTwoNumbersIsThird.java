package numberTheory;

public class SumOfTwoNumbersIsThird {

	public static void main(String[] args) {

		int a=20;
		int b=20;
		int c=30;
		if(a+b==c)
			System.out.println("true");
		else if(b+c==c)
			System.out.println("true");
		else if(c+a==c)
			System.out.println("true");
		else
			System.out.println("false");
	}

}
