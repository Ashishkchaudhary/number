import java.util.Scanner;

public class StringReverse {
 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String TO Reverse");
		String str = scan.nextLine();
		String RevStr="";
		int size = str.length();
				for(int i=size-1;i>=0;i--)
				{
					RevStr = RevStr+str.charAt(i)+"";
				
				}
				System.out.println(RevStr);
	}
}
