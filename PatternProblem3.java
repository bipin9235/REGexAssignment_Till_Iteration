package till_Iteration_Statement;

public class PatternProblem3 {

	
	public static void main(String[] args)
	{
		int s=6,e=4;
		int temp=0;
		for(int i=1;i<=5;i++)
		{ 
			temp=i;
			s--;
			e++;
			for(int j=1;j<=5*2-1;j++)
			{
				if(j>=s&&j<=e)
				{
					if(j>=5)
					{
						System.out.print(temp);
						temp--;
					}
					else
					{
						System.out.print(temp);
						temp++;
					}
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
