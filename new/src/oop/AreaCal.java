package oop;

import java.util.Scanner;

interface Shapedemo
{
	public void area(int a);
}

class Circle1 implements Shapedemo
{

	@Override
	public void area(int r) 
	{
		System.out.println("Area of circle - "+(3.14*r*r));
		
	}
	
}

class Square1 implements Shapedemo
{

	@Override
	public void area(int s) 
	{
		System.out.println("Area of Square - "+(s*s));
		
	}
	
}
public class AreaCal {

	public static void main(String[] args) 
	{
		Circle1 c=new Circle1();
		Square1 s=new Square1();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter radius -");
		int r =sc.nextInt();
		c.area(r);
		System.out.println("-----------------------");
		System.out.println("Enter square side -");
		int si= sc.nextInt();
		s.area(si);
		

	}

}
