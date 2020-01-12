package Q6Controlstatements;
import java.util.Scanner;

public class IfElseStatement 
{
	private static Scanner scan;

	public static void main(String[] args) 
	{	

		scan = new Scanner(System.in);
		System.out.print("Enter the no that comes after no. 4 :- ");
		int a = scan.nextInt();
		int b = 5;
		System.out.println();

		if (b==a)
		{
			System.out.println("TRUE");
		}
		else
		{
			System.out.println("FALSE");
		}
	}
}
