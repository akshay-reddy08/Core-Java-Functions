package Q5Blocks;

class Invoke
{
	static 
	{
		System.out.println("Running Static Block 1");
		System.out.println();
	}
	static 
	{
		System.out.println("Running Static Block 2");
		System.out.println();
	}
	
	Invoke()
	{
		System.out.println("Running Constructor");
		System.out.println();
	}
	
	{
		System.out.println("Running Non-Static Block 1");
		System.out.println();
	}

	{
		System.out.println("Running Non-Static Block 2");
		System.out.println();
	}
}

public class Blocks 
{
	public static void main(String[] args) 
	{
		new Invoke();
	}
}

