package ArrayProg;

import java.util.Scanner;

public class MaxValueFrom1stHalf {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Any size of Array");
		int n = scan.nextInt(),max;
		int[] arr = new int[n];
		System.out.println("Enter Elements of Arrays");
		for(int i=0;i<n;i++)
			arr[i] = scan.nextInt();
		max = arr[0];
		for(int i=0;i<n/2;i++)
		{
			if(max<arr[i])
				max=arr[i];
		}System.out.println("Max Element is "+max);

	}

}
