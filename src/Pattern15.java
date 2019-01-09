
public class Pattern15 {

	public static void main(String[] args) {
		 int sp=4,line=1,count1=2;
		for(int i=1;i<=5;i++)
		{   int count=0;
			for(int j=1;j<=count1;j++)
			{
				if(j<=line)
					System.out.print("*");
				else
				{
					if(count==0)
					{
						for(int k=1;k<=sp;k++)
						{
							System.out.print(" ");
						} count++;
					}System.out.print("*");
				}
			}System.out.println();
			if(i<=3){
				sp-=2;line++;count1+=2;
			}else{
				line--;sp+=2;count1-=2;
		         }
		}

	}

}
