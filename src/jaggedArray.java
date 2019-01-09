import java.util.Scanner;

public class jaggedArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Size Of Array");
		int n = scan.nextInt();
		  int k;
		int[][] arr = new int[n][n];
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter size of" +i+"th array");
		  int   m = scan.nextInt();
		 
		    System.out.println("Enter values of "+i+"th array");
		    for(int j=0;j<m;j++)
		    {
		    	arr[i][j] = scan.nextInt();
		    }
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(arr[j]);
			}
			System.out.println();
		}
		
	}
}
