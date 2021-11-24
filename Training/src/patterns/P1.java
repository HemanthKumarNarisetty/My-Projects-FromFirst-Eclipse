package patterns;

public class P1 {

	public static void main(String[] args) {

		int n=4;
		for(int i=0;i<n;i++)
		{
			int k=1;
			char c='a';
			for(int j=0;j<n;j++)
			{
				if(i%2==0)
				{
				System.out.print(k++);
				}
				else
					System.out.print(c++);
			}
			System.out.println();
		}
	}

}
