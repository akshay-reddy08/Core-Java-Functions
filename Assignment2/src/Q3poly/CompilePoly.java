package Q3poly;

class Methods 
{
	void Search(int Value)
	{
		System.out.println("Value is :"+Value+"st "+"Car");
	}

	void Search(String Name)
	{
		System.out.println("Name is  :"+Name);
	}

	void Search(double Price)
	{
		System.out.println("Price is :"+Price);
	}

}

public class CompilePoly 
{
	public static void main(String[] args) 
	{
		Methods m = new Methods();
		m.Search(1);
		m.Search("Fortuner");
		m.Search(2200000.00);
	
	}
}
