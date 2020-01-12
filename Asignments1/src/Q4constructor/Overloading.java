package Q4constructor;

class Test
{
	Test()
	{
		System.out.println("Default const running...");
	}

	Test(int a)
	{
		System.out.println("Int const running...  "+a);
	}

	Test(String name)
	{
		System.out.println("String const running...  "+name);
	}

	Test(int a,String name)
	{
		System.out.println("Int-String const running...  "+a+"   "+name);
	}
}

public class Overloading 
{
	public static void main(String[] args) 
	{
		Test s=new Test();
		Test s1=new Test(1);
		Test s2=new Test("Yamraj");
		Test s3=new Test(2,"Chitragupt");
	}
}

