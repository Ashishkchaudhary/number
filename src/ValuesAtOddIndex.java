import java.util.Scanner;

public class ValuesAtOddIndex {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Size Of Array");
		int n = scan.nextInt();
		int[] arr = new int[n];
		int ar[] = new int[n];int count=0;
		System.out.println("Enter Values");
		for(int i=0;i<n;i++)
		{
		   arr[i] = scan.nextInt();	
		}
		for(int i=0;i<n;i++)
		{
			if(i%2!=0)
			{
				System.out.println(arr[i]);
				
			}
		}
//		for(int i=0;i<count;i++)
//		{
//			System.out.println(ar[i]);
//		}
	}
}
