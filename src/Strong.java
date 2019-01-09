import java.util.Scanner;

public class Strong {

	public static int fact(int rem)
	{
		if(rem==1)
			return 1;
		else
		    return rem*fact(rem-1);
	}
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Any number");
		int n =scan.nextInt();
		int sum=0,strong = n;
		while(n!=0)
		 {
			 int rem = n%10;
			 	sum = sum+fact(rem); 
			 	n= n/10;
		 }if(sum == strong)
			 System.out.println("No.is Strong");
		 else
			 System.out.println("No. is not Strong");

	}

}
