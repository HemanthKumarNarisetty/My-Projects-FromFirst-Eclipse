package arrays;

public class Interfaceimplement implements I1{

	@Override
	public void add() {

		int i=10;
		int j=20;
		int res=i+j;
		System.out.println(res);
		
	}

	@Override
	public void substract() {

		int i=10;
		int j=20;
		int res=j-i;
		System.out.println(res);
	}
	public void multiple()
	{
		int i=2;
		int j=3;
		int res=i*j;
		System.out.println(res);
	}

	@Override
	public void mul() {
		// TODO Auto-generated method stub
		
	}

}
