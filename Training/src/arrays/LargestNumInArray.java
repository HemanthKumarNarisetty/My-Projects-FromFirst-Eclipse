package arrays;

public class LargestNumInArray {

	public static void main(String[] args) {

		int [] n= {20,40,10,50};
		for(int i=0;i<n.length;i++)
		{
			for(int j=0;j<n.length-i-1;j++)
			{
				if(n[j]<n[j+1])
				{
				int temp=n[j];
				n[j]=n[j+1];
				temp=n[j+1];
				}
			}
		}
		System.out.println(n[1]);
	}

}
