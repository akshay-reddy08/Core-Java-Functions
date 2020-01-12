package Q5Interface;

interface Poly
{
	void bags(String CName);
	void bag(String CName);
}

class Morphism implements Poly
{

	@Override
	public void bags(String CName) 
	{
		System.out.println("Best Backpack Company is: "+CName);		
	}
	@Override
	public void bag(String CName) 
	{
		System.out.println("2nd Best Backpack Company is: "+CName);		
	}
	
}
public class Runtime 
{
	public static void main(String[] args) 
	{
		Poly m = new Morphism();
		m.bags("F-Gear");
		
		System.out.println("And");
		
		m.bag("Skybags");
	}
}
