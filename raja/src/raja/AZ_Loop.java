package raja;

public class AZ_Loop 
{
	public static void main(String args[])
	{
		for (char i =65; i<91; i++)
		{	
			for (char j =65; j<i; j++)
			{	
				System.out.print(j);
			}	
			System.out.println(i);
		}	
	}
}
