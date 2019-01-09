import java.util.Scanner;

public class PrimeNoBtnTwoNumbers {

	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		System.out.println("Please enter 1st number");
		int fint = scan.nextInt();
		System.out.println("Please enter 2st number");
		int sint = scan.nextInt();
		int n =fint;
		
		while(n>=fint && n<=sint)
		{
			boolean flag = false;
			for(int i=2;i<(n/2)+1;i++)
			{
				if(n%i == 0)
				{
					flag = true;
					break;
				}
				
			}
			if(flag == false)
			    System.out.println(n);
			n++;
		}

	}

}
