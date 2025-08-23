package oop;

public class AbstractCall extends AbstractClass
{

	public static void main(String[] args) 
	{
		AbstractCall ab = new AbstractCall();
		ab.demo1();
		ab.demo2();
		ab.demo3();
		
		AbstractClass a= new AbstractCall(); //parent ref=new child();
		a.demo1();
		a.demo2();
		

	}

	@Override
	public void demo1() 
	{
		System.out.println("Abstract method implementation");
		
	}
	public void demo3() 
	{
		System.out.println("Child specific method");		
	}

}
