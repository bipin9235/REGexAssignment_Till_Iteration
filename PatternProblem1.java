/*
 *  0
	10
	101
	0101
	01010
 */
package till_Iteration_Statement;

public class PatternProblem1 {

	public static void main(String[] args) {
		int binaryValue=0;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(binaryValue);
				binaryValue=binaryValue==0?1:0;
			}
			System.out.println();
		}
	}
}

