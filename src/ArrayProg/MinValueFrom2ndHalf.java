package ArrayProg;

import java.util.Scanner;

public class MinValueFrom2ndHalf {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Any size of Array");
		int n = scan.nextInt(),min;
		int[] arr = new int[n];
		System.out.println("Enter Elements of Arrays");
		for(int i=0;i<n;i++)
			arr[i] = scan.nextInt();
		min = arr[n/2+1];
		for(int i=n/2;i<n;i++)
		{
			if(min>arr[i])
				min=arr[i];
		}System.out.println("Min Element is "+min);

	}

}
