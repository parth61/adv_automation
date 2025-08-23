package par;

import java.util.Scanner;

public class Stringdemo {

	public static void main(String[] args) {
		//String str="welcome5";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String str = sc.nextLine();
		int len=str.length();
		String s= "ramani";
//		System.out.println("length-"+len);
//		System.out.println("uppercase - "+str.toUpperCase());
//		System.out.println("lowercase - "+str.toLowerCase());
//		System.out.println(str.concat(s));
//		System.out.println("first element - "+str.charAt(0));
//		System.out.println("second last element - "+str.charAt(len-2));
		
//		if(str.equalsIgnoreCase(s))
//			System.out.println("strings are equal");
//		else
//			System.out.println("strings are not equal");
		
		if (str.contains(s)||s.contains(str))
			System.out.println("str containes s");
		else
			System.out.println("str doesnot containes s");
		

	}

}
