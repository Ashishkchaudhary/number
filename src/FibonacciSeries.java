import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter upper Limit No.");
		int n = scan.nextInt();
		int a=0,b=1,c=0,count =2;
		System.out.print(a+" "+b);
		while(++count<=n)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.print(" "+c);
		}

//		do{
//			c=a+b;
//			a=b;
//			b=c;
//			System.out.print(" "+c);
//		}while(c<=n);
	}

}
