package strings;

public class Recurssive1 {

	public static String recussive(String str )
	{
		if(str.length()==1)
		{
			return str;
		}
		return recussive(str.substring(1))+str.charAt(0);
	}
	public static void main(String[] args) {

		String str=("Mango is fruit");
		
		System.out.println(recussive(str));
	}

}
