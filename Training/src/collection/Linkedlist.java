package collection;

import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<>();
		ll.add("hemanth");
		ll.add("kumar");
		ll.add("Narisetty");
		System.out.println(ll);
		ll.add(1, "Nari");
		System.out.println(ll);
		String l2 = ll.get(2);
		System.out.println(l2);
		System.out.println(ll.size());
		ll.remove(3);
		System.out.println(ll);
	}

}
