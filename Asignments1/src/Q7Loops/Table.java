package Q7Loops;

import java.util.Scanner;

public class Table 
{
	public static void main(String[] args) 
	{
		int b= 1;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Table no. ");
		int a = scan.nextInt();
		System.out.print("Enter uptil no. ");
		int c = scan.nextInt();
		while(b<=c)
		{
			System.out.println(a*b);
			b++;
		}
	}

}
