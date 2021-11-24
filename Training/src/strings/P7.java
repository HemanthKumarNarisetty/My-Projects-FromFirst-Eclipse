package strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class P7 {

	public static void main(String[] args) {

		String str="Mango is a fruit is fruit";
		String []words=str.split(" ");
		
		Map<String,Integer>hm=new HashMap<>();
		
		for(String word:words)
		{
			if(hm.containsKey(word))
			{
				hm.put(word.toLowerCase(),hm.get(word)+1);//get word means value it is returning
			}
			else
			{
				hm.put(word, 1);
			}
		}
		Set<String>wordsInString=hm.keySet();
		
		for(String word:wordsInString)
		{
			if(hm.get(word)>1)
			{
				System.out.println(word+":"+hm.get(word));
			}
		}
	}

}
