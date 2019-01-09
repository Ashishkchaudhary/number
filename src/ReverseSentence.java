import java.util.Scanner;

public class ReverseSentence {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String sen = scan.nextLine();
		String[] word = sen.split(" ");
		String[] RevWord;
		int size = word.length;
		int frontIndex= 0;
		int LasrIndex = size-1;
		
		for(int i=0;i<size/2;i++)
		{
			String temp = word[frontIndex];
			word[frontIndex] = word[LasrIndex];
			word[LasrIndex]= temp;
		}
		for(int i=0;i<size;i++)
		{
		System.out.print(word[i]+ " ");
	
		}
	}
}
