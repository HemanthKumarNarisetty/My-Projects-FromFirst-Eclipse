package programmingClass;

public class SwapImmediateNumber {

	public static void main(String[] args) {

		int a=123456;
		int arr[]= new int [6];
		for(int i=0;i<arr.length;i++) {
			while(a!=0) {
			int d=i%10;
			arr[i]=d;
			a=a/10;
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
