package ArrayProg;

import java.util.Scanner;

public class SumOfSecondHalfOfArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Any size of Array");
		int n = scan.nextInt(),max,sum=0;
		int[] arr = new int[n];
		System.out.println("Enter Elements of Arrays");
		for(int i=0;i<n;i++)
			arr[i] = scan.nextInt();
		for(int i=n/2;i<n;i++)
		{
			sum+=arr[i];
		}
		System.out.println("Sum Of 1st half is "+sum);

	}

}
