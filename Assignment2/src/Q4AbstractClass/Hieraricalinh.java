package Q4AbstractClass;

abstract class Suits 
{
	abstract void Brand();
	abstract void Color();
}
class Method extends Suits
{
	@Override
	void Brand()
	{
		System.out.println("Armani Brand");
	}
	
	@Override
	void Color()
	{
		System.out.println("Navy Blue Colour");
	}
}

class TestMethod extends Suits
{
	@Override
	void Brand() 
	{
		System.out.println("LouisPhillipes Brand");
	}

	@Override
	void Color()
	{
		System.out.println("Red Colour");
	}
}


public class Hieraricalinh 
{
	public static void main(String[] args) 
	{
		System.out.println("Marriage Suit: ");
		Suits m= new Method();
		m.Brand();
		m.Color();
		
		System.out.println(" ");
		
		System.out.println("Reception Suit: ");
		Suits t= new TestMethod();
		t.Brand();
		t.Color();
	}
}
