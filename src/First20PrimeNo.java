
public class First20PrimeNo {

	public static void main(String[] args) {
		
		int number = 2,count =1;
		
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
