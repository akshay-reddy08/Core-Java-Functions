package Q6Controlstatements;
import java.util.Scanner;

public class Switch 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a variable value: ");
		int a = scan.nextInt();
		System.out.println("Enter b variable value: ");
		int b = scan.nextInt();
		System.out.println("Enter your choice: 1. Add, 2. Sub: ");
		int c = scan.nextInt();
		switch (c) 
		{
		case 1:
			System.out.println("Addition is: "+(a+b));			
			break;
			
		case 2:	
			System.out.println("Substraction is: "+(a-b));
			break;
			
		default:
			System.out.println("Invalid Input");
			break;
		}
	}

}
