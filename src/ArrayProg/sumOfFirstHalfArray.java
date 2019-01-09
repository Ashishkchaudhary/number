package ArrayProg;

import java.util.Scanner;

public class sumOfFirstHalfArray {

	int sum=0;
	public int halfAddition(int[] arr)
	{
		for(int i=0;i<=(arr.length-1)/2;i++)
		{
			sum += arr[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Any size of Array");
		int n = scan.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter Elements of Arrays");
		for(int i=0;i<n;i++)
			arr[i] = scan.nextInt();
		
		sumOfFirstHalfArray s = new sumOfFirstHalfArray();
		int a = s.halfAddition(arr);
		System.out.println("Sum of 1st Half is "+a);

	}

//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter Any size of Array");
//		int n = scan.nextInt(),max,sum=0;
//		int[] arr = new int[n];
//		System.out.println("Enter Elements of Arrays");
//		for(int i=0;i<n;i++)
//			arr[i] = scan.nextInt();
//		for(int i=0;i<n/2;i++)
//		{
//			sum+=arr[i];
//		}
//		System.out.println("Sum Of 1st half is "+sum);
//	}
}
