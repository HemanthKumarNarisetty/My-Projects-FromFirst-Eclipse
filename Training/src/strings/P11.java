package strings;

import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class P11 {

	public static void main(String[] args) {

		String str="mango is a fruit";
		char [] ch=str.toCharArray();
		TreeMap<Character,Integer> tm=new TreeMap<>();
		for(int i=0;i<ch.length;i++)
		{
			boolean done=false;
			for(int j=0;j<i;j++)
			{
				if(ch[i]==ch[j])
				{
					done=true;
					break;
				}
			}
			if(!done)
			{
				int count =1;
				for(int j=i+1;j<ch.length;j++)
				{
					if(ch[i]==ch[j])
					{
						count++;
					}
					tm.put(ch[i],count);
				}
			}
		}
		Set<Entry<Character,Integer>>set_view=tm.entrySet();
		for(Entry<Character,Integer> o:set_view)
		{
		System.out.println(o);
		}
	}

}
