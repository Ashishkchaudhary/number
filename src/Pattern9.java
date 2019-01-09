
public class Pattern9 {

	public static void main(String[] args) {
		char ch='A';
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				if(i==2||i==3)
				{
					System.out.print("*");
				}else if(i==4)
				{
					System.out.print(ch);
					ch--;
				}
				else
				{
					System.out.print(ch);
					ch++;
				}
			}
			System.out.println();
			ch= 'J';
		}

	}

}
