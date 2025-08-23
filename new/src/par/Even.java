package par;

import java.util.Scanner;

public class Even {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int num = input.nextInt();
		
		if (num >=1)
		{
			if (num % 2 == 0)
		
			System.out.println(num+" Number is even");
		else
			System.out.println(num+" Number is odd");
		}
		else 
			System.out.println(num+" its neiter odd nor even");
	}
}		
