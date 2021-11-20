package strings;

public class P8 {
/*
 * Reverse the String word wise
 */
	public static void main(String[] args) {

		String str="Mango is fruit";
		String str1="";
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			int sp=i;
			while(i<ch.length && ch[i]!=' ')
			{
				i++;
			}
			int ep=i;
			String temp=""; 
			for(int j=sp;j<ep;j++)
			{
				temp=ch[j]+temp;
			}
			str1=str1+" "+temp;
			
		}
		System.out.println(str1);
	}

}
