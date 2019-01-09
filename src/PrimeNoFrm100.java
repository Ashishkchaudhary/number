
public class PrimeNoFrm100 {

	public static void main(String[] args) {
		
		int number = 100,count =1;
		while(count !=20)
		{	boolean flag = false;
			for(int i=2;i<number/2+1;i++)
			{
				if(number%i==0)
				{
					flag = true;
					break;
				}
			}
			if(flag == false)
			{
				System.out.print(number+" ");
				count++;
			}
			number++;
		}


	}

}
