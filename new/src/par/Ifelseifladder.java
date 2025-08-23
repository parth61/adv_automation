package par;

import java.util.Scanner;

public class Ifelseifladder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input= new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int num = input.nextInt();
		
	    if (num>=0 && num<=9)
	    	System.out.println("single digit number");
	    else if (num>=10 && num<=99 || num<=-10 && num>=-99)
	    	System.out.println("double digit number");
	    else if(num>=100 && num<=999)
	    	System.out.println("triple digit number");
	    else 
	    	System.out.println("enter valid number");
	    
	    
	}

}
