package Q4AbstractClass;

abstract class Demo
{
	abstract void concrete();
}


public class ConcreteClass extends Demo
{

	@Override
	void concrete() 
	{
		System.out.println("Running Concrete Class______________");
	}
	public static void main(String[] args) 
	{
		Demo d = new ConcreteClass();
		d.concrete();
	}

}
