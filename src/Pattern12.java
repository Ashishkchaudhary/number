
public class Pattern12 {

	public static void main(String[] args) {
		
		
			
			for(int i=1;i<=5;i++)
			{char ch= 'a',ch1='b';
				for(int j=1;j<=5;j++)
				{
					if(i==j || i+j==6)
					{
						if(i<=3)
						{
						System.out.print(ch);
						ch++;
						}else
						{
							System.out.print(ch1);
							ch1--;
						}
					}
					else{
						System.out.print(" ");
					}
				}System.out.println();;
			}

		}

	}


