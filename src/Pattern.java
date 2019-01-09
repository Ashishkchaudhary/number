import java.util.Scanner;

public class Pattern {

//	public static void main(String[] args) {
//		 int sp=7/2,n=1;
//		for(int i=1;i<=7;i++)
//		{
//			
//			for(int j=1;j<=sp;j++)
//			{
//				System.out.print(" ");
//			}
//			int count = n/2+1;
//			for(int k=1;k<=n;k++)
//			{
//				System.out.print(count);
//				if(k<=n/2)
//					count--;
//				else
//					count++;
//			}
//			System.out.println();
//			if(i<=7/2)
//			{
//				sp=sp-1;
//				n = n+2;
//			}
//			else{
//				sp=sp+1;
//				n = n-2;
//			}
//		}
//
//	}


	
		public static void Display(int n)
	{
		int sp = n/2,line=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=sp;j++)
			{
				System.out.print(" ");
			}
			int count = line/2+1;
			for(int k=1;k<=line;k++)
			{
				System.out.print(count);
				if(k<=line/2)
                   count--;
				else
					count++;
			}
			
			System.out.println();
			if(i<=n/2)
			{
				sp=sp-1;
				line = line+2;
			}else{
				sp = sp+1;
				line = line-2;
			}
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Display(7);
	}
}
