
public class PrimeNumber {

	public static void main(String[] args) {
		
		int n=3;
		
		while(n<=100)
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
			    System.out.println(n);
			n++;
		}

	}

}
