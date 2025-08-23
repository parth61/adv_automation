package par;

import java.util.Scanner;

public class Whileloop {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int dp = 1234;
		
		int i = 1;
		while (i<=3) 
		{
			System.out.println("Enter pin");
			int pin = sc.nextInt();
		
		if (pin==dp) {
			System.out.println("access granted");
			break;
		}
		else
		{
			System.out.println("access denied");
		}
			i++;
			
		}
		
		
		
			
				
	}

}
