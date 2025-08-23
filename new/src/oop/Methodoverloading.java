package oop;

import java.util.Scanner;

public class Methodoverloading {

	public void add(int a, int b) 
	{
		System.out.println("addition of 2 variables - "+(a+b));
	}
	
	public void add(int a) 
	{
		int b=4, c=6;
		System.out.println("addition of 3 variables - "+(a+b+c));
	}
	
	public void add(double a) 
	{
		int b=4, c=6;
		System.out.println("addition of 3 variables - "+(a+b+c));
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
	
		int p=sc.nextInt();
		int q=sc.nextInt();
		double r=sc.nextDouble();
		Methodoverloading m = new Methodoverloading();
		m.add(p, q);
		m.add(p);
		m.add(r);

	}

}
