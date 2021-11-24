package strings;

public class Vowels {

	public static void main(String[] args) {

		String str="mango and apples are fruits";
		char ch[]=str.toCharArray();
		int count1=0,count2=0,count3=0,count4=0,count5=0;
		for(int i=0;i<ch.length;i++)
		{
			if (ch[i]=='a')
			{
				count1++;
			}
			else if(ch[i]=='e')
			{
				count2++;
			}
			else if(ch[i]=='i')
			{
				count3++;
			}
			else if(ch[i]=='o')
			{
				count4++;
			}
			else if(ch[i]=='u')
			{
				count5++;
			}
		}
		System.out.println(count1);
		System.out.println(count2);
		System.out.println(count3);
		System.out.println(count4);
		System.out.println(count5);
	}

}
