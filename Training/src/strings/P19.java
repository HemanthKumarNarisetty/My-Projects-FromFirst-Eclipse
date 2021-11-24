package strings;

public class P19 {
	/**
	 * Reverse of each word of a String
	 * @param args
	 */

	public static void main(String[] args) {

		String str="Mango is a Fruit";
		String str1="";
		char[] ch=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			int sp=i;
			while(i<ch.length && ch[i]!=' ')
			{
				i++;
			}
			int ep=i-1;
			if(ep>sp)
			{
			String temp="";
			for(int j=sp;j<=ep;j++)
			{
				temp=ch[j]+temp;
			}
			str1=str1+" "+temp;
			}
		}
		System.out.println(str1);
	}

	
}
