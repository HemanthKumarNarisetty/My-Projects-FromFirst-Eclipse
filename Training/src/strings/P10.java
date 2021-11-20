package strings;

public class P10 {

	public static void main(String[] args) {

		String str="mango is a fruit";
		char[] ch=str.toCharArray();
		char c='i';
		int count = 0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==c)
			{
				count++;
			}
		}
		System.out.println(count+" no of times occour in the sentence");
	}

}
