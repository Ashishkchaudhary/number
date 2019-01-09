package StringProg;

import java.util.Scanner;

public class TotalNoOfOccurenceInString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter any String");
		String str = scan.nextLine();
		System.out.println("Please enter any Char");
		char c = scan.next().charAt(0);
		
		int count= 0;
		char[] charArray = str.toCharArray();
		for(int i=0;i<charArray.length;i++)
		{
			if(c==charArray[i])
				count++;
		}
		System.out.println("Total no. of occurence of "+c+" is "+count);
	}

}
