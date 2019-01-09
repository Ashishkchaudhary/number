package StringProg;

import java.util.Scanner;

public class StringPalindromeOrNot {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter any String");
		String str = scan.nextLine(),str1="";
		char[] charArray = str.toCharArray();
		
		for(int i= charArray.length-1;i>=0;i--)
		{
			str1= str1+charArray[i];
		}System.out.println(str+" "+str1);
		if(str.equalsIgnoreCase(str1))
			System.out.println("String is Palindrome");
		else 
			System.out.println("String is not Palindrome");
		}
}
