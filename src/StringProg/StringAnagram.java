package StringProg;

import java.util.Arrays;
import java.util.Scanner;

public class StringAnagram {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter any String");
		String FirstStr = scan.nextLine();
		System.out.println("Please enter any String");
		String SecondStr = scan.nextLine();
		char[] FirstcharArray = FirstStr.toCharArray();
		char[] SecondcharArray = SecondStr.toCharArray();
		Arrays.sort(FirstcharArray);
		Arrays.sort(SecondcharArray);
		boolean equals = Arrays.equals(FirstcharArray, SecondcharArray);
		if(equals)
			System.out.println("String Array is Anagram");
		else
			System.out.println("String is Not Anagram");
	}

} 
