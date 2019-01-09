import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class NoOfOccurence {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		String s = "aasjjikkk";
		for (int i = 0; i < s.length(); i++) {
		    char c = s.charAt(i);
		    Integer val = map.get(c);
		    if (val != null) {
		        map.put(c, new Integer(val + 1));
		    }
		    else {
		       map.put(c, 1);
		   }
		}
		System.out.println("no. of "+map.keySet()+" is " +map.values());
		
	}

}
