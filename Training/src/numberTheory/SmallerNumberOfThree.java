package numberTheory;

public class SmallerNumberOfThree {

	public static void main(String[] args) {

		int n1=60;
		int n2=30;
		int n3=40;
		int min= n1<n2?(n1<n3?n1:n3):(n2<n3?n2:n3);
		System.out.println(min);
	}

}
