package strings;

public class P15 {

	public static void main(String[] args) {

		String str="{([Mango is a fruit]}";
		char[] ch=str.toCharArray();
		int count1=0,count2=0,count3=0,count4=0,count5=0,count6=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='{')
			{
				count1++;
			}
			else if(ch[i]=='(')
			{
				count2++;
			}
			else if(ch[i]=='[')
			{
				count3++;
			}
			else if(ch[i]==']')
			{
				count4++;
			}
			else if(ch[i]==')')
			{
				count5++;
			}
			else if (ch[i]=='}')
			{
				count6++;
			}
		}
		if(count1==count6)
		{
			System.out.println("The balance of {} is there in sentence");
		}
		else
			System.out.println("The balance of {} is not there in sentence");
		if(count2==count5)
		{
			System.out.println("The balance of () is there in sentence");
		}
		else
			System.out.println("The balance of () is not there in sentence");
		if(count3==count4)
		{
			System.out.println("The balance of [] is there in sentence");
		}
		else
			System.out.println("The balance of [] is not there in sentence");
	}

}
