
public class Pattern7 {

	public static void main(String[] args) {
		int sp=4,count=1,c=1;
		char ch='A';
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=sp;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=count;k++)
			{
				System.out.print(ch);
				ch--;
			}System.out.println();ch++;
			sp--;count+=2;
			int a = 65+2*c;
			ch = (char)a;
			c++;
		}

	}

}
