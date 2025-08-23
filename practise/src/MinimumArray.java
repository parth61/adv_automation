
public class MinimumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b [][]= {{11,2,3},{4,5,6},{7,0,9}};
		int min = b[0][0];
		int c =0;
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < 3; j++) {
				if (b[i][j]<min) {
					min = b[i][j];
					c = j;
				}
			}
		}
		System.out.println(min);
		int max = b[0][c];
		int k=0;
		while (k<3)
		{
			if (b[k][c]>max)
			{
				max = b [k][c];
			}	k++;
		}
		System.out.println(max);
	}
}
