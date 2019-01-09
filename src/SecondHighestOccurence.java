import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;
public class SecondHighestOccurence {

	public static Character findMaxOChar(String text)
	{
		Character maxChar = ' ',SecMax=' ';
		int max = Integer.MIN_VALUE;
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		int size = text.length();
		for(int i=0;i<size;i++)
		{
			Character ch = text.charAt(i);
			if(map.containsKey(ch))
			{
				map.put(ch, map.get(ch)+1);
			}
			else
			{
				map.put(ch, 1);
			}
			if(map.get(ch)>max)
			{
				SecMax = maxChar;
				maxChar = ch;
				max = map.get(ch);
			}
		}
		return SecMax;
		
	}

	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter any string ");
	    String text = scan.nextLine();
	    System.out.println("The second max character is : "+ findMaxOChar(text));
	}
	
	
}