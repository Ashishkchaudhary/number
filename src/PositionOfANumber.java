import java.util.Scanner;

public class PositionOfANumber {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter any series of number");
		int series = scan.nextInt();
		System.out.println("Enter a no to find position");
		int find = scan.nextInt();
		int rem,Fcount=0,Scount=1;
		while(series!=0)
		{
			rem = series%10;
			if(rem==find)
			{
				Fcount = Scount;
			}
			series=series/10;
			Scount++;
		}System.out.println("position is "+(Scount-Fcount));

	}

}
