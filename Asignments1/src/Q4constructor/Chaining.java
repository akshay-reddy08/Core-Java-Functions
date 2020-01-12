package Q4constructor;

class Demo1
{
	Demo1()
	{
		System.out.println("Default constructor running...");
	}
}

class Demo2 extends Demo1
{
	Demo2(int a)
	{
		super();
		System.out.println("Integer constructor running..."+" "+a);
	}
}

class Demo3 extends Demo2
{
	Demo3(String name)
	{
		super(10);
		System.out.println("String constructor running..."+" "+name);
	}
}


public class Chaining 
{
	public static void main(String[] args) 
	{
		new Demo3("Manga");
	}
}
