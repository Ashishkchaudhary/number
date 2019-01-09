import java.util.Scanner;

public class ReverseAnArray {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Size Of Array");
		int n = scan.nextInt();
		int firstIndex= 0,lastIndex = n-1,temp=0;
		int[] arr = new int[n];
		System.out.println("Enter Values");
		for(int i=0;i<n;i++)
		{
		   arr[i] = scan.nextInt();	
		}
		
		for(int i=0;i<n/2;i++)
		{
			temp = arr[firstIndex];
			arr[firstIndex] = arr[lastIndex];
			arr[lastIndex] = temp;
			firstIndex++;lastIndex--;
		}
		for(int i=0;i<n;i++)
		{
		System.out.println(arr[i]);

		}
	}	
}
