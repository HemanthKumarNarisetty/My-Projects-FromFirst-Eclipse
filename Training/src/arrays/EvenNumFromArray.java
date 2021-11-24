package arrays;

public class EvenNumFromArray {

	public static void main(String[] args) {

		int []n= {1,2,3,4,5};
		for(int i=0;i<n.length;i++)
		{
			if(n[i]%2==0)
			{
				System.out.println(n[i]);
			}
		}
	}

}
