import java.util.Arrays;
import java.util.Scanner;

public class AlphabeticOrder {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String[] str1 = str.split(" ");
		
		Arrays.sort(str1);
		for(int i=0;i<str1.length;i++)
		{
			System.out.println(str1[i]);
		}

	}

}
