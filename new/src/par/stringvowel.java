package par;

import java.util.Scanner;

public class stringvowel {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String str = sc.nextLine();
		String str1=str.toLowerCase();
		int cV=0,cC=0;
		for (int i=0;i<=str1.length()-1;i++)
			{
			char s = str1.charAt(i);
		if (s=='a'||s=='e'||s=='i'||s=='o'||s=='u')
			cV++;
		else
			cC++;
			}
		System.out.println("no. of vowels - "+cV);

		System.out.println("no. of consonants - "+cC);		

	
	}


}
