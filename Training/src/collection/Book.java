package collection;

public class Book implements Comparable {
	
	int id;
	double cost;
	String subject;
	
	public int compareTo(Object o)
	{
		if(this.id==((Book)o).id)
			return 0;
		else if(this.id>((Book)o).id)
			return 1;
		else
			return -1;
		
	}
	Book(int id,double cost,String subject)
	{
		this.id=id;
		this.cost=cost;
		this.subject=subject;
	}
	public void bookDetails()
	{
		System.out.println("book id  ="+id);
		System.out.println("book cost ="+cost);
		System.out.println("subject ="+subject);
	}

}
