package oop;

	interface ManualTest
	{
	public void test();
	}
	
	interface AutoTest
	{
	public void test();
	}

public class TestingDemo implements ManualTest, AutoTest
{

	public static void main(String[] args) 
	{
		TestingDemo t=new TestingDemo();
		t.test();

	}

	@Override
	public void test() 
	{
		System.out.println("Automation Testing");		
	}

}
