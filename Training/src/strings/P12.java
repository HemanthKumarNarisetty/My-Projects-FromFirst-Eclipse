package strings;

public class P12 {

	public static void main(String[] args) {

		String str="mango is a fruit";
		char ch[]=str.toCharArray();
		String str1="";
		for(int i=0;i<ch.length;i++)
		{
			int sp=i;
			while(i<ch.length && ch[i]!=' ')
			{
				i++;
			}
			int ep=i-1;
			String temp="";
			if(ep>sp)
			{
			for(int j=sp;j<=ep;j++)
			{
				temp=temp+ch[j];
			}
			str1=str1+temp;
			}
		}
		System.out.println(str1);
	}

}
