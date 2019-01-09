
public class Pattern4 {

	public static void main(String[] args) {
		char ch='e';
		for(int i=5;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				if(i%2==0)
					System.out.print("*");
				else{
					System.out.print(ch);
					if(j!=i)
					   ch--;
				}
			}System.out.println();ch++;
		}
	}

}
