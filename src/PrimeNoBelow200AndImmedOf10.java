
public class PrimeNoBelow200AndImmedOf10 {

	public static void main(String[] args) {
		
		int n=2;
		while(n<=200)
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
			{
				if(n%10<=4)
					System.out.println(n);
			}
			n++;
		}

	}

}
