import java.util.Scanner;

public class SortAnArray {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Size Of Array");
		int n = scan.nextInt();
		int temp=0;
		int[] value = new int[n];
		System.out.println("Enter Values");
		for(int i=0;i<n;i++)
		{
		   value[i] = scan.nextInt();	
		}
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(value[j]>value[j+1])
				{
					 temp= value[j];
					value[j]= value[j+1];
					value[j+1]=temp;
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(value[i]);
		}
		
	}

}
