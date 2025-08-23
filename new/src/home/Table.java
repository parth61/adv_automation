package home;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter table number = ");
		int a =sc.nextInt();
		for (int i = 0; i < 11; i++) 
		{
			System.out.println(a+"X"+i+"="+(a*i));
			
		}

	}

}
