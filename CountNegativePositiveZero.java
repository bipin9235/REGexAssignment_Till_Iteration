/*
 * Write a program to read the numbers until -1 is encountered. Also count the negative, positives
	and zeros entered by user?
 */
package till_Iteration_Statement;
import java.util.Scanner;
import java.util.InputMismatchException;

public class CountNegativePositiveZero {

	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		
		// varibales to count -ve, +ve and 0
		int countNegative=0;
		int countPositive=0;
		int countZero=0;
		int value=0;
	
		//logic 
		System.out.println("Enter numbers of your choice");
		try {
				do {
					value=sc.nextInt();
					if(value>0)
					{
						countPositive++;
					}
					else if(value<0)
					{
						countNegative++;
					}
					else
					{
						countZero++;
					}
				}while(value!=-1);
		}
		catch(InputMismatchException e)
		{
			System.out.println("Invalid Input! ");
		}
		
		System.out.println("\nTotal Number of Zeros: "+countZero+"\nPositive : "+countPositive+"\nNegative : "+countNegative);
		
		sc.close();
		

	}

}
