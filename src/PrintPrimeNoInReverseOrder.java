
public class PrintPrimeNoInReverseOrder {

	public static void main(String[] args) {
		
		int n=70;
		while(n>=20 && n<=70)
		{
			boolean flag = false;
			for(int i=2;i<(n/2)+1;i++)
			{
				if(n%i == 0)
				{
					flag = true;
					break;
				}
				
			}
			if(flag == false)
			    System.out.print(n+" ");
			n--;
		}

	}

}
