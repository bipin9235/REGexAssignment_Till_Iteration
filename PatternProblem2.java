/*
 *  WAP to draw pattern
 *  55555
	54444
	54333
	54322
	54321
 */
package till_Iteration_Statement;

public class PatternProblem2 {
	
	public static void main(String[] args) {
		for(int i=5;i>=1;i--)
		{
			for(int j=5;j>=1;j--)
			{
				if(j>=i)
				{
					System.out.print(j%6);
				}
				else
				{
					System.out.print(i%6);
				}
			}
			System.out.println();
		}

	}

}
