package raja;

public class For_loop1 
{
	public static void main(String args[])
	{
		for (int i =1; i<=10; i++)
		{	
			for (int j =1; j<=10; j++)
			{	
				if (i>1&&i<10)
				{	
					if(j==1||j==10||i==j||i==11-j)
						System.out.print("$ ");
					else
						System.out.print("  ");
				}
				else
					System.out.print("$ ");
			}	
			System.out.println();
			
		}	
	}
}
