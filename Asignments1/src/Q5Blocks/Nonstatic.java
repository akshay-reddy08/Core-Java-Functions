package Q5Blocks;

public class Nonstatic 
{
	{
		System.out.println("Running NonStatic Block in Static Block");
	}
	
	public static void main(String[] args) 
	{
		new Nonstatic();
	}
	
}
