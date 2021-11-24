package strings;

public class Anangrams {

	public static char[] sort(char[] ch)
	{
		for (char i=0;i<ch.length-1;i++)
		{
			for (char j=0;j<ch.length-1-i;j++)
			{
				if(ch[j]<ch[j+1])
				{
					char temp=ch[j+1];
					ch[j+1]=ch[j];
					temp=ch[j];
				}
			}
		}
		return ch;
	}
	public static void main(String[] args) {

		String s1="listen";
		String s2="silent";
		char[] ch1=s1.toCharArray();
		char[] ch2=s2.toCharArray();
		sort(ch1);
		sort(ch2);
		if(ch1.length==ch2.length)
		{
			boolean isanangram=false;
			for(char i=0;i<ch1.length-1;i++)
			{
				for(char j=0;j<ch2.length-1;j++)
				{
					if(ch1[i]==ch2[j])
					{
						isanangram=true;
					}
					isanangram=false;
				}
			}
			if(isanangram)
			{
				System.out.println("The given strings are anangrams");
			}
			System.out.println("The given strings are not anagrams");
		}
	}

}
