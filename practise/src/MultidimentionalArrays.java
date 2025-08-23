
public class MultidimentionalArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = new int [2][2];
		a[0][0]=1;
		a[0][1]=2;	
		a[1][0]=3;
		a[1][1]=4;
//		System.out.println(a[0][0]);
		int b [][]= {{1,2,3,1},{4,5,6,1},{7,8,9,1}};
//		System.out.println(b.length);
		for (int i = 0; i < b.length; i++) {
			for (int y=0; y < 4; y++)
				{
				System.out.println(b[i][y]);
				}
		}
	}

}
