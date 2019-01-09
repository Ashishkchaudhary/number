import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter Number");
		int n = scan.nextInt();
		boolean flag = false;
		for(int i=2;i<n/2;i++)
		{
			if(n%i==0)
			{
				flag = true;
				break;
			}
		}if(flag == false)
			System.out.println("no. is Prime number");
		else
			System.out.println("no. is not Prime number");
	}

}
