
public class Pattern6 {

	public static void main(String[] args) {
		int sp=4,count=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=sp;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=count;k++)
			{
				System.out.print(count);
			}count+=2;sp--;System.out.println();
		}
	}
}
