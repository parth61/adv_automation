package javaa;

import java.util.ArrayList;

public class BrushUp1 {

	public static void main(String[] args) {
		//		int i = 8;
		////		System.out.println(i);
		//		
		//		int [] arr = new int[5];
		//		arr[0]= 1;
		//		arr[1]= 8;
		//		arr[2]= 7;
		//		arr[3]= 9;
		//		arr[4]= 6;
		//		
		//		int [] arr1 = {1,2,3,4,5};
		//		for (int j = 0; j < arr.length; j++) {
		////			System.out.println("hello");
		//			System.out.println(arr[j]);
		//		}
		//		
		//		for (int intt: arr1)
		//		{
		//			System.out.println(intt);
		//		}
		//			
//		int [] even = {1,2,3,4,5,6,7,8,9,10};
//		int count =0;
//		for (int p = 0 ; p<even.length; p++)
//		{
//			if (even[p] % 2 ==0) {
//				System.out.println(even[p]+" is even");
//				count++;
//
//			}
//			else {
//				System.out.println(even[p]+" is odd");
//			}
//			System.out.println(count);
//		}
//		 ArrayList<Integer> arr = new ArrayList<Integer>();
//		 arr.add(5);
//		 arr.add(8);
//		 arr.add(6);
//		 arr.add(9);
//		 arr.add(7);
//		
//		 for (int i = 0; i < arr.size(); i++) {
//			 System.out.println(arr.get(i));
//		}
//		 
		String s = "Parth Yogesh Ramani";
		String [] split = s.split("Yogesh");
		System.out.println(split[0]);
		System.out.println(split[1].trim());
		for (int q=s.length()-1;q>=0;q--)
		{
			System.out.println(s.charAt(q));
		}
		
	}

}
