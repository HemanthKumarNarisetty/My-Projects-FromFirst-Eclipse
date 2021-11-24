package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class GenericArrayList {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of collection");
		int j=s.nextInt();
		
		ArrayList<Book>bag=new ArrayList<Book>(3);
		bag.add(new Book(2,20,"java"));
		bag.add(new Book(1,30,"selenium"));
		bag.add(new Book(3,40,"sql"));
		System.out.println("Enter the book name to search ");
		String s1=s.next();
		for(int i=0;i<bag.size();i++)
		{
			if(bag.get(i).subject.equals(s1))
			{
				bag.get(i).bookDetails();
			}
		}
		Iterator<Book> i=bag.iterator();
		while(i.hasNext())
		{
			Book temp=i.next();
			if(temp.id==2)
			{
				temp.bookDetails();
			}
		}
		System.out.println("============================");
		Collections.sort(bag);//for sorting objects in collection frame work
		for(Book b:bag)
		{
		b.bookDetails();
		
		}
	}

}
