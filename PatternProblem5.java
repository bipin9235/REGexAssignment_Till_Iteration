/*WAP to draw pattern
 *      $$$$$$$$$
		$$$$ $$$$
		$$$   $$$
		$$     $$
		$       $
		$$     $$
		$$$   $$$
		$$$$ $$$$
		$$$$$$$$$

 */
package till_Iteration_Statement;

public class PatternProblem5 {
	public static void main(String[] args)
	{
		int start=7,end=3;
		for(int i=1;i<=9;i++)
		{
			if(i<=5)
			{
				start--;
				end++;
				for(int j=1;j<=9;j++)
				{
					if(j>=start&&j<=end)
						System.out.print(" ");
					else
						System.out.print("$");
				}
				 System.out.println();
			}
			else
			{
				start++;
				end--;
				for(int j=1;j<=9;j++)
				{
					if(j>=start&&j<=end)
						System.out.print(" ");
					else
						System.out.print("$");
				}
				System.out.println();
			}
		}
		
	}
}
