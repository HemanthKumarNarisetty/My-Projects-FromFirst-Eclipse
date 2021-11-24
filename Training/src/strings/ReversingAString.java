package strings;

public class ReversingAString {

	public static void main(String[] args) {

		String str="I am in Bangalore";
		String str1="";
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			str1=ch[i]+str1;
		}
		System.out.println(str1);
	}

}
