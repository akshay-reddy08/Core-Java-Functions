package Q1Inheritance;

class Parent
{
	void kids() 
	{
		System.out.println("My name is SRK & I have 2 Kids: ");
	}
}

class Son extends Parent
{
	void son() 
	{
		System.out.println(" I am his son ");
	}
}

class Daughter extends Parent
{
	void daughter()
	{
		System.out.println(" I am his daughter ");
	}
}

public class Hierarchical 
{
	public static void main(String[] args) 
	{
		Son s= new Son();
		s.kids();
		s.son();
		
		System.out.println();
		
		Daughter d= new Daughter();
		d.kids();
		d.daughter();
	}
}
