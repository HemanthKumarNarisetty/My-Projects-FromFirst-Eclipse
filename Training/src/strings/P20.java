package strings;

public class P20 {
	/**
	 * percentage of all different characters in the string
	 * @param args
	 */

	public static void main(String[] args) {

		String str="Mango Is A 20 *(255)Fruit";
		char[] ch=str.toCharArray();
		int Upper=0,Lower=0,Special=0,Digit=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='A' && ch[i]<='Z')
			{
				Upper++;
			}
			else if(ch[i]>='a' && ch[i]<='z')
			{
				Lower++;
			}
			else if(Character.isDigit((str.charAt(i))))
			{
				Digit++;
			}
			else
				Special++;
		}
	
		System.out.println(Upper);
		System.out.println(Lower);
		System.out.println(Digit);
		System.out.println(Special);
	}

}
