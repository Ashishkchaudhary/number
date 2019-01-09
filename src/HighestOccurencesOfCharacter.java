import java.util.HashMap;
import java.util.Scanner;

public class HighestOccurencesOfCharacter {

	public static  Character findMaxOChar(String text){
	    HashMap<Character, Integer> map = new HashMap<Character, Integer>();
	    Character maxChar = ' ';
	    int max = Integer.MIN_VALUE;
	    for(int i=0;i<text.length();i++){
	        Character ch = text.charAt(i);
	        if(map.containsKey(ch)){
	            map.put(ch,map.get(ch)+1);
	        }
	        else{
	            map.put(ch,1);
	        }
	        if(map.get(ch)>max){
	            maxChar = ch;
	            max = map.get(ch);
	        }
	    }
	    return maxChar;
	}

	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("enter any string ");
	    String text = scan.nextLine();
	    System.out.println("The max character is : "+ findMaxOChar(text));
	}
}
