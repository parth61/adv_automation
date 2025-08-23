package oop;
class VJTI//parent
{
	public void type() 
	{
		System.out.println("VJTI is an autonomous college");
	}
}

class engg extends VJTI//child
{
	public void courses() 
	{
		System.out.println("Mechanical is one of the courses");
	}
}

class div extends VJTI
{
	public void strength() 
	{
		System.out.println("Strength is 100");
	}
}

class boys extends VJTI
{
	public void strength() 
	{
		System.out.println("boys Strength is 60");
	}
}

public class Inheritancedemo 
{

	public static void main(String[] args) 
	{
		div c=new div();
		engg e=new engg();
		c.type();
		e.courses();
		c.strength();
		
		
	}

}
