package strings;

public class P9 {

	public static void main(String[] args) {

		String str="Mango is fruit";
		String s[]=str.split(" ");
		System.out.println(str);
		for(int i=0;i<s.length-1;i++)
		{
			for(int j=i;j<i+1;j++)
			{
				String temp=s[j];
				s[j]=s[j+1];
				s[j+1]=temp;
			}
			for(int j=0;j<s.length;j++)
			{
			System.out.print(s[j]+" ");
			}
			System.out.println();
		}
	}

}
