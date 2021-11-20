package strings;

import java.util.Arrays;

public class P14 {

	/*
	 * To check weather the two strings are anangrams are not
	 */
	public static void main(String[] args) {

		String s1="tot";
		String s2="tot";
		char[] ch1=s1.toCharArray();
		char[] ch2=s2.toCharArray();
		boolean is_anangram=true;
		if (ch1.length==ch2.length)
		{
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			for(int i=0;i<ch1.length;i++)
			{
				if(ch1[i]!=ch2[i])
				{
					is_anangram=false;
				}
			}
			if(is_anangram)
			{
				System.out.println("The Two Given Strings are Anangrams");
			}
			else
				System.out.println("The Two Given Strings Are Not Anangrams");
		}
		else
			System.out.println("The Two given Strings are not Anangrams");
	}

}
