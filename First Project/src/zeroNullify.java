import java.io.*;
public class zeroNullify {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		int[][] arr = input();
		for (int i=0;i<arr[0].length;i++) {//first row check
			if(arr[0][i]==0) {
				nullifyrow(arr, 0);
				nullifycol(arr, i);
				break;
			}
		}
		for (int i=1;i<arr.length;i++) {//2nd to last row check
			for(int j=0;j<arr[0].length;j++) {
				if(arr[i][j]==0 && arr[i-1][j]!=0) {
					nullifyrow(arr, i);
					nullifycol(arr, j);
					break;
				}
			}
		}
		System.out.println("Nullified Matrix");
		display(arr);
	}
	public static int[][] input() throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter size of array in rows and columns");
		int rows=Integer.parseInt(in.readLine());
		int columns=Integer.parseInt(in.readLine());
		int[][] arr = new int [rows][columns];
		System.out.println("Enter array");
		for(int i=0;i<rows;i++) {
			System.out.println("Enter "+(i+1)+"th row of array");
			for(int j=0;j<columns;j++) {
				arr[i][j] =Integer.parseInt(in.readLine());
			}
		}
		System.out.println("Entered Matrix");
		display(arr);
		return arr;
	}
	public static void nullifyrow(int[][]arr, int nrow) {
		for(int i=0;i<arr.length;i++) {
			arr[nrow][i]=0;
		}
		return;
	}
	public static void nullifycol(int[][]arr, int ncol) {
		for(int i=0;i<arr[0].length;i++) {
			arr[i][ncol]=0;
		}
		return;
	}
	public static void display(int[][] arr) {
		for (int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
