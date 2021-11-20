package strings;

public class Recurssive {

	public static String sentence(String str)
	{
		if(str.length()==1)
		{
			return str;
		}
		return sentence(str.substring(1,str.length()))+str.charAt(0);
	}
	public static void main(String[] args) {

		System.out.println(sentence("Mango is fruit"));
	}

}

