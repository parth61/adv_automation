package par;

public class Arraydemo {

	public static void main(String[] args) {
		//int arr[]= {1,3,4,3,4};
		int a[]=new int [2];
		a[0]=55;
		a[1]=6;
//		int l=a.length;
//		System.out.println("Elements of array -");
//		for (int i=0;i<l;i++)
//		{
//			System.out.println(a[i]);
//		}
		for(int ab:a)
		{
			System.out.println(ab);
		}

	}

}
