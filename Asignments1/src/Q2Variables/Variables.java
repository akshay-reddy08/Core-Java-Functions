package Q2Variables;

public class Variables 
{
	public static void main(String[] args) 
	{
		Circle c = new Circle();
		c.area();
		System.out.println();

		SimpleInterest s = new SimpleInterest();
		System.out.println("Simple interest amount is :"+(s.a));
		System.out.println();
		
		System.out.println("Area of triangle is :"+(Triangle.area));
		System.out.println();
		
		new Swap();
		System.out.println();
	}
}
