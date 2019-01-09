
public class Pattern14 {

	public static void main(String[] args) {
		int sp=0,count =9;
		for(int i=5;i>=1;i--)
		{
			for(int j=1;j<=sp;j++)
			{
				System.out.print(" ");
			}
			for(int k=count;k>=1;k--)
			{
				if(k==1 || k==(2*i)-1)
				{
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}sp++;count-=2;System.out.println();
		}

	}

}
