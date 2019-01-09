package StringProg;

import java.util.Scanner;

public class RemoveAllWhiteSpaces {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter any String");
		String str = scan.nextLine(),NewStr = "";
		String[] strSplit = str.split(" ");
		for(int i=0;i<strSplit.length;i++)
		{
			NewStr = NewStr+strSplit[i];
		}
		System.out.println(NewStr);
	}

}
