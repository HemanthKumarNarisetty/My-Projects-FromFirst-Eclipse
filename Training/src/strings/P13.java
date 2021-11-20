package strings;

public class P13 {

	/*
	 * to check weather a given sentence is palindrome or not
	 */
	public static void main(String[] args) {

		String str="tot is tot";
		int n=str.length();
		char ch[]=str.toCharArray();
		String rev_str="";
		for(int i=0;i<ch.length;i++)
		{
			rev_str=ch[i]+rev_str;
		}
		if(str.equals(rev_str))
		{
			System.out.println(str+" is a palindrome");
		}
		else
		{
			System.out.println(str+" is not a palidrome");
		}
		
	}

}
