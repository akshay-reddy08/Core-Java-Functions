package Q2Encapsulation;

class Demo
{
	int a=40;
	private Demo()
	{
		System.out.println("Initial value of a: "+a);
		System.out.println("New Object got created: ");
	}
	static Demo getDemo()
	{
		Demo d = new Demo();
		return d;
	}
}

public class SingleTon 
{
	public static void main(String[] args) 
	{
		Demo d1 = Demo.getDemo();
		System.out.println(d1);
		d1.a = 55;
		System.out.println(d1.a);
		
		System.out.println("-----------");
		Demo d2 = Demo.getDemo();
		System.out.println(d2);
		d2.a = 75;
		System.out.println(d2.a);
		
		System.out.println("-----------");
		Demo d3 = Demo.getDemo();
		System.out.println(d3);
		d3.a = 95;
		System.out.println(d3.a);
	}
}
