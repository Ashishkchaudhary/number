import java.util.Scanner;

public class OddElementOfArray {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter Size Of Array");
		int n=scan.nextInt(),j=0;
		int[] arr = new int[n];
		System.out.println("Enter Values Of Array");
		for(int i=0;i<n;i++)
		{
			arr[i] = scan.nextInt();
		}
		while(j<n)
		{
			if(arr[j]%2!=0)
			{
				j++;
			}else{
				int temp = arr[n-1];
				arr[n-1] = arr[j];
				arr[j] = temp;
				n--;
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
