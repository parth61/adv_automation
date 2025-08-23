package oop;

public class MethodTypes 
{
	int a=5;
	public void add() 
	{
		int b=5;
		System.out.println("addition-"+(a+b));
	}
	
	public void sub(int b) //parameterized variable
	{
		System.out.println("subtraction-"+(a-b));
	}

	public int multi() 
	{
		int b=4;
		return a*b;
	}
	
	public int div(int b)
	{
		return a/b;
	}

	public static void main(String[] args) 
	{
		MethodTypes m= new MethodTypes();
		m.add();
		m.sub(50);
		m.multi();
		int ml = m.multi();
		System.out.println("multiplication-"+ml);
		
		System.out.println("division-"+m.div(2));
		

	}

}
