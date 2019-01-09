package ArrayProg;

import java.util.Scanner;

public class MaxValueFrom2ndHalf {
	
	public int innerMethod(int[] arr)
	{   int n = arr.length,max = arr[n/2+1];;
		for(int i=n/2;i<n;i++)
			{
				if(max<arr[i])
					max=arr[i];
			}
		return max;
	}
	
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Any size of Array");
		int n = scan.nextInt(),max;
		int[] arr = new int[n];
		System.out.println("Enter Elements of Arrays");
		for(int i=0;i<n;i++)
			arr[i] = scan.nextInt();
		max = arr[n/2+1];

		MaxValueFrom2ndHalf h = new MaxValueFrom2ndHalf();
		int a = h.innerMethod(arr);
		System.out.println(a);
	}
}
