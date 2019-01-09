import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter a number");
		int n=scan.nextInt(),sum=0;
		int arm =n;
		while(n!=0)
		{
			int rem = n%10;
				sum = sum+(rem*rem*rem);
				n = n/10;
		}
		if(sum == arm)
			System.out.println("No. is Armstrong ");
		else
			System.out.println("No. is not Armstrong ");
	}

}
