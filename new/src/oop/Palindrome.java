package oop;

import java.util.Scanner;

public class Palindrome extends Reversestring
{
	public void chkpalind(String str, String rev) 
	{
		if (str.equalsIgnoreCase(rev))
			System.out.println("palindrome");
		else
			System.out.println("not palindrome");
	}
	public static void main(String[] args) 
	{
		Palindrome p = new Palindrome();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
	}

}
