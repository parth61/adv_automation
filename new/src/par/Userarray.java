package par;

import java.util.Scanner;

public class Userarray {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
	System.out.println("enter length - ");
	int len=sc.nextInt();
	int arr[]=new int[len];
	System.out.println("insert elements");
	for (int i=0;i<=len-1;i++)
	{
		arr[i]=sc.nextInt();
	}
	System.out.println("elements of array");
	for (int i=0;i<=len-1;i++)
	{
		System.out.println(arr[i]);
	}	
			
	
	
		
		
		
		
	}

}
