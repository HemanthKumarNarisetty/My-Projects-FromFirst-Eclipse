package strings;

public class P5 {

	public static void main(String[] args) {

		String str="mango is fruit";
		String str1="";
		int count =0;
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			str1=str1+ch[i];
			count++;
		}
		System.out.println(count);
	}

}
