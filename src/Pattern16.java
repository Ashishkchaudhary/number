
public class Pattern16 {

	public static void main(String[] args) {
		int max =4;
		for(int i=4;i>=1;i--)
		{
			int sp = max-i;
			for(int j=0;j<sp;j++)
			{
				System.out.print(" ");
			}
			for(int k=i;k>=1;k--)
			{
				System.out.print(k);
			}System.out.println();
		}

	}

}
