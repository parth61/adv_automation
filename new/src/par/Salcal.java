package par;

import java.util.Scanner;

import oop.Emp;

public class Salcal extends Emp

{

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		Salcal s= new Salcal();
		s.getempinfo();
		System.out.println("enter basic salary - ");
		int sal =sc.nextInt();
		int gsal=s.getcalsal(sal);
		System.out.println("gross salary - "+gsal);

	}

}
