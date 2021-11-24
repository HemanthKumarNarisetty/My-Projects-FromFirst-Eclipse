package strings;

public class P6 {

	public static void main(String[] args) {

		String str="Mango is a fruit";
		char ch[]=str.toCharArray();
		int count =0;
		for(int i=0;i<ch.length;i++)
		{
			int sp=i;
			while(i<ch.length && ch[i]!=' ')
			{
				i++;
			}
			int ep=i-1;
			if(sp<=ep)
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
