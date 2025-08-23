package home;

import java.util.Scanner;

public class Div {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of variable a");
		int a = sc.nextInt();
		System.out.println("Enter value of variable b");
		int b = sc.nextInt();
		System.out.println("addition = "+a+b);
		try {
			System.out.println("division = "+a/b);
		} 
		catch (ArithmeticException f) {
			System.err.println(f.getMessage());
		}
		
		System.out.println("Multiplication = "+a*b);
		System.out.println("subtraction = "+(a-b));
		

	}

}
