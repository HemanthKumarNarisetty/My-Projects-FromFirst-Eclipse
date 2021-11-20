package collection;

import java.io.DataInputStream;
import java.io.IOException;

public class Data {

	public static void main(String[] args) throws IOException {

		DataInputStream data=new DataInputStream(System.in);
		System.out.println("Enter the string");
		String l = data.readLine();
		char [] ch=l.toCharArray();
		String s="";
		for(int i=0;i<ch.length;i++)
		{
			s=ch[i]+s;
		}
		System.out.println(s);
	}

}
