package strings;

public class Test1 {
	static int x;
	int a;
	int b;
	static
	{
		x=100;
	}
	Test1(int a,int b)
	{
		this.a=a;
		this.b=b;
		x++;
	}
	void disply_nonstatic()
	{
		System.out.println("a :"+a+" b :"+b);
		System.out.println("x:"+(++x));
	}
	static void disply_static()
	{
		System.out.println("x :"+x--);
	}
}
