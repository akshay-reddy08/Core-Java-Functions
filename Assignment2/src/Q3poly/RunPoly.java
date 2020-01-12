package Q3poly;

abstract class New 
{
	abstract void carname();
	abstract void version();
}
class Method extends New
{
	@Override
	void carname()
	{
		System.out.println("Verna");
	}
	
	@Override
	void version()
	{
		System.out.println("1.6");
	}
}

class TestMethod extends New
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


public class RunPoly 
{
	public static void main(String[] args) 
	{
		System.out.println("Sedan Class Car: ");
		New m= new Method();
		m.carname();
		m.version();
		
		System.out.println(" ");
		
		System.out.println("SUV Class Car: ");
		New t= new TestMethod();
		t.carname();
		t.version();
	}
}
