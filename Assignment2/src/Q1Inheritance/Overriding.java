package Q1Inheritance;


class Method
{
	void carname()
	{
		System.out.println("Verna");
	}
	void version()
	{
		System.out.println("1.6");
	}

}

class TestMethod extends Method
{
	@Override
	void carname() 
	{
		System.out.println("Innova");
	}

	@Override
	void version()
	{
		System.out.println("2.4");
	}


}

public class Overriding 
{
	public static void main(String[] args) 
	{
		System.out.println("Sedan Class Car: ");
		Method m= new Method();
		m.carname();
		m.version();
		
		System.out.println(" ");
		
		System.out.println("SUV Class Car: ");
		TestMethod t= new TestMethod();
		t.carname();
		t.version();
	}
}
