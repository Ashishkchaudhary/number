
public class Pattern13 {

	public static void main(String[] args) {
	 
		int line =7,sp=0;
		for(int i=1;i<=8;i++)
		{   int count=0;
			for(int j=1;j<=sp;j++)
			{
				System.out.print(" ");
			} 
			for(int k=1;k<=line;k++)
			{
				if(i==1 ||i==3||i==6||i==8)
				{
					if(count>8)
						count=0;
					System.out.print(count);
					count+=2;
				}else
					System.out.print("*");
			}
				if(i<4)
				{
					sp++;
					line-=2;	
				}else if(i>=5){
					sp--;
					line+=2;
				}System.out.println();
			  }
			
          }
	}


