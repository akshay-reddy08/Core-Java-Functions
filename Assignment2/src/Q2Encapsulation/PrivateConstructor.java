package Q2Encapsulation;


class Constructor
{
	private Constructor()
	{
		System.out.println("Running Private constructor: ");
		System.out.println();
	}
	
	static Constructor getConstructor()
	{
		Constructor c = new Constructor();
		System.out.println(c);
		return c;
	}
}

public class PrivateConstructor 
{
	
	public static void main(String[] args) 
	{
		Constructor.getConstructor();
	}
}
