package strings;

import java.util.Collection;
import java.util.Set;
import java.util.TreeMap;

public class RemoveDuplicates {

	public static void main(String[] args) {

		String str="Bangalore";
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
			int count=1;
				for(int j=i+1;j<ch.length;j++)
				{
					if(ch[i]==ch[j]) {
					count++;
					}
				}
				tm.put(ch[i], count);
		}
	}
		Set<Character> set = tm.keySet();
		Collection<Integer> value = tm.values();
		Integer key = tm.get(ch[0]);
		System.out.println(set);
		System.out.println(value);
		System.out.println(key);
	}
}
