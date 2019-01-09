
public class SumOf30PrimeNumber {

	public static void main(String[] args) {
		int number = 2,count =1,PrimeSum=0;
		while(count !=30)
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
				PrimeSum+=number; 
				System.out.print(number+" ");
				count++;
			}
			number++;
		}System.out.println();
		System.out.println("sum of all prime Number is "+PrimeSum);
	}

}
