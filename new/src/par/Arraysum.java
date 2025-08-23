package par;

import java.util.Scanner;

public class Arraysum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter length - ");
		int len=sc.nextInt();
		int arr[]=new int[len];
		System.out.println("insert elements");
		for (int i=0;i<=len-1;i++)
		{
			arr[i]=sc.nextInt();
		}
		int sum=0;
//		for (int i=0;i<=len-1;i++)
//		{
//			sum= sum+arr[i];
//		}
//		System.out.println("addition -"+sum/len);
		
		//for each loop
		for (int ab:arr)
		{
		sum =sum+ab;
		
		}
		System.out.println("addition -"+sum);
	}

}
