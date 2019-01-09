import java.util.Scanner;

public class sortWordInlength {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String sentence = scan.nextLine();
		String[] word = sentence.split(" ");
		int size = word.length;
		String temp="";
		for(int i=0;i<size-1;i++)
		{
			for(int j=0;j<size-i-1;j++)
			{
				if(word[j].length()>word[j+1].length())
				{
					 temp = word[j];
					word[j]= word[j+1];
					word[j+1]= temp;
				}
			}
		}
		for(int i=0;i<size;i++)
		{
			System.out.println(word[i]);
		}

	}

}
