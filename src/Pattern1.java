
public class Pattern1 {

	public static void main(String[] args) {
		int sp=4,line=1,c=0;
	    for(int i=1;i<=5;i++){
	    	for(int j=1;j<=sp;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=line;j++)
			{   
				if(j==1 || j==(2*c+1))
				{
					System.out.print("*");
				}else
					System.out.print(" ");
			
			}sp--;line+=2;System.out.println();c++;
	    }
	}

}
