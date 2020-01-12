package Q1Inheritance;

class Father
{
	void Property()
	{
		
	} 
}

class Child extends Father
{
	@Override
	void Property()
	{
		System.out.println("I have 50 Crores Property");
	}
	void Income()
	{
		System.out.println("And 3 Crores Annual Income.");
	}
}

public class Downcasting 
{
	public static void main(String[] args)
	{
		Father f = new Child(); //up-casting
		f.Property();
		//f.Income();	As super
		
		System.out.println(" ");
		
		Child c = (Child)f;	//Explicit Down-casting
		c.Property();
		c.Income();
	}
}
