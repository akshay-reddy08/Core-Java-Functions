package Q3Methods;

public class ZeroArg 
{

	int p=10;
	int r=20;
	int t=5;
	double a=(p*(1+(r*t)));
	
	void interest()
	{
		System.out.println("Running Method with Zero argument");
		System.out.println("And");
		System.out.println("The Simple Interest is : "+a);
	}
	
	public static void main(String[] args) 
	{
		ZeroArg z= new ZeroArg();
		z.interest();
	}
}
