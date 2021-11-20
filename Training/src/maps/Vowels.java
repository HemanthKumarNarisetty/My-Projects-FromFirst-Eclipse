package maps;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Vowels {

	public static void main(String[] args) {

		String str="mango and apple are fruits";
		char ch[]=str.toCharArray();
		int count1=0,count2=0,count3=0,count4=0,count5=0;
		HashMap<Character,Integer> hs=new HashMap<>();
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
		hs.put('a',count1);
		hs.put('e',count2);
		hs.put('i',count3);
		hs.put('o',count4);
		hs.put('u',count5);
		Set<Entry<Character, Integer>> details = hs.entrySet();
		for(Entry<Character,Integer> o:details)
		{
			System.out.println(o);	
		}
	}

}
