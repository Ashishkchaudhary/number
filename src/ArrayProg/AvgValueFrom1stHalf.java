package ArrayProg;

import java.util.Scanner;

public class AvgValueFrom1stHalf {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Any size of Array");
		int n = scan.nextInt(),max,Avg =0,sum=0;
		int[] arr = new int[n];
		System.out.println("Enter Elements of Arrays");
		for(int i=0;i<n;i++)
			arr[i] = scan.nextInt();
		for(int i=0;i<n/2+1;i++)
		{
			sum+=arr[i];
		}Avg = sum/(n/2);
		System.out.println("Avg of even index Element is "+Avg);
	}

}
