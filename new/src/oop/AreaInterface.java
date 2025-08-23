package oop;

import java.util.Scanner;

interface Circle
{
	public void area();
}

interface Square
{
	public void area1();
}

public class AreaInterface implements Circle,Square
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Select Shape \n 1- Circle \n 2- Square");
		int s = sc.nextInt();
		AreaInterface ai=new AreaInterface();
		if (s==1)
		{
			ai.area();
		}
		else
		{
			ai.area1();
		}
		
	}

	@Override
	public void area() {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter radius");
		double r = sc.nextDouble();
		double a=3.14*r*r;	
		System.out.println("area of circle is - "+a);
	}

	@Override
	public void area1() {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter length");
		double r = sc.nextDouble();
		double a1=r*r;
		System.out.println("area of square is - "+a1);
		
	}

}
