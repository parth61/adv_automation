package par;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
	System.out.println("enter value of x- ");
	double x = input.nextInt();
	System.out.println("enter value of y- ");
	double y = input.nextInt();
	System.out.println("enter method- ");
	String method = input.next();
		
		/*System.out.println("Enter the day: ");
		int day = input.nextInt();
	
		switch (day)
		{	
		case 1:
		System.out.println("Monday");
		break;
		case 2:
		System.out.println("Tuesday");
		break;
		case 3:
		System.out.println("Wednesday");
		break;
		case 4:
		System.out.println("Thursday");
		break;
		case 5:
		System.out.println("Friday");
		break;
		case 6:
		System.out.println("Saturday");
		break;
		case 7:
		System.out.println("Sunday");
		break;
		default:
		System.out.println("invalid");
		
		}*/
	switch (method)
	{	
	case "A":
	System.out.println("Addition- "+(x+y));
	break;
	case "B":
	System.out.println("Subtraction- "+(x-y));
	break;
	case "C":
	System.out.println("Multiplication- "+(x-y));
	break;
	case "D":
	System.out.println("Division- "+(x/y));
	break;
	default:
		System.out.println();
	
	}
	}
}
