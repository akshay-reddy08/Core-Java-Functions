package Q6Controlstatements;
import java.util.Scanner;

public class Nestedif 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter All 3 values:");
		int a = scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		System.out.println();
		
		if (a==b)
		{
			if(b==c)
			{
				System.out.println("All 3 values matched");
			}
			else
			{
				System.out.println("Only a and b values matched but not c");
			}
		}
		
	}
}
