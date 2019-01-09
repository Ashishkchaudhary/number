import java.util.Scanner;

public class Factroial {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	System.out.println("Please Enter Number");
	int nextInt = scan.nextInt();
	int fact=1;
	for(int i=1;i<=nextInt;i++)
	{
		fact = fact*i;
	}
	System.out.println("Factorial is "+fact);

	}

}
