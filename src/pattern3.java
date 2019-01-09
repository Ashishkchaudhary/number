
public class pattern3 {

	public static void main(String[] args) {
		char ch1='A';
		char ch= 'D';
		for(int i=1;i<=4;i++)
		{ 
			for(int j=1;j<=4;j++)
			{   
				if(j==2||j==3)
				{
					System.out.print("*");
				}else if(j==1)
				{
					System.out.print(ch1);
					ch1++;
				}
				else{
					System.out.print(ch);
					ch--;
				}
			}
			System.out.println();
		}

	}

}
