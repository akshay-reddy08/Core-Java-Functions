package Q1Inheritance;


class GrandParent
{
	void Name(String surname) 
	{
		System.out.println("Name of Grand Parent is :"+surname);
	}
}

class Fathers extends GrandParent
{
	void Name(String Son) 
	{
		System.out.println("Name of Parent Son is :"+Son);
	}
}

class FathersSister extends GrandParent
{
	void Name(String Daughter) 
	{
		System.out.println("Name of Parent Daughter is :"+Daughter);
	}
}

class Childs extends Fathers
{
	void Name(String Boy, String Girl) 
	{
		System.out.println("Name of Childs is :"+Boy+" "+Girl);
	}
}

public class Hybrid 
{
	public static void main(String[] args) 
	{
		GrandParent g = new GrandParent();
		g.Name("Mr.Khan");
		
		Fathers f= new Fathers();
		f.Name("Champu");
		
		FathersSister s = new FathersSister();
		s.Name("Champi");
		
		Childs c= new Childs();
		c.Name("Bharat", "Mata");
	}
}
