package Q6Controlstatements;
import java.util.Scanner;

public class Elseif 
{
	private static Scanner scan;

	public static void main(String[] args) 
	{ 
		scan = new Scanner(System.in);

		System.out.print("Enter value for I: ");
		int i = scan.nextInt();
		
		System.out.print("Enter value for J: ");
		int j = scan.nextInt();
		if(i==j)
		{	
			System.out.println();
			System.out.println("Values are equal:"+i+" = "+j); 
		}
		else if (i<j) 
		{
			System.out.println();
			System.out.println("J is Greater then I:"+i+" < "+j);
		}
		else if (i>j)
		{
			System.out.println();
			System.out.println("I is Greater then J:"+i+" > "+j);
		}
	}
}
