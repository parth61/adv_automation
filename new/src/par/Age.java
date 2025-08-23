package par;

import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter age - ");
		int age = sc.nextInt();
		

		if (age>=18)
		{
			System.out.println("enter weight - ");
			int wt = sc.nextInt();
			if (wt>=45)
				System.out.println("eligible");
			else 
				System.out.println("not eligible");
		}
		else
			System.out.println("under age hence not eligible");

	}

}
