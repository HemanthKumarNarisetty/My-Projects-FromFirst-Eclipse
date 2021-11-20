package strings;

public class DemoTest {

	public static void main(String[] args) {

		Test2.display_static();
		
		Test2 t1=new Test2(40,50);
		
		t1.display_nonstatic();//Test2class method
		t1.display_static();//Test2class method
		
		Test1 t2=new Test2(10,20);
		
		t1.disply_nonstatic();//test1 class method
		t2.disply_nonstatic();//first it gets invoked sub class than the control goes to the super class and gets executed
		t2.disply_static();//test1 class method
		
	}

}
