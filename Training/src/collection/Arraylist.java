package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Arraylist {

	public static void main(String[] args) {

		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(1);
		al.add(3);
		al.add(10);
		al.add(2);
		al.add(6);
		System.out.println(al);
		Collections.sort(al);
		HashSet<Integer> hs=new HashSet<>();
		TreeSet<Integer> ts=new TreeSet<>();
		for(int i=0;i<al.size();i++)
		{
			if(al.get(i)%2==0)
			{
				hs.add(al.get(i));
			}
			else
			{
				ts.add(al.get(i));
			}
		}
		System.out.println(hs);
		System.out.println(ts);
		
	}

}
