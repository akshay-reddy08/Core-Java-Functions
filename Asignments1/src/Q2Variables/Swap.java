package Q2Variables;

public class Swap 
{
	static int a=5, b=3, c;

	static
	{
		c=b;
		b=a;
		a=c;
		System.out.println("Swapped nos are:- "+" "+"a:"+a+" "+"b:"+b);
	}
}
