package par;

import oop.Encapdemo;

public class TestEncap extends Encapdemo
{

	public static void main(String[] args) 
	{
		Encapdemo ed= new Encapdemo();
		System.out.println("Name - "+ed.name);
		
		TestEncap te= new TestEncap();
		String st = te.getcont();
		System.out.println("contanct - "+st);
		
		String gt = te.setcont();
		System.out.println("contanct - "+gt);
		
		System.out.println("name - "+ed.name);
		

	}

}
