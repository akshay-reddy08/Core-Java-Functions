//initialising global variable using parameterized constructor
package Q4constructor;

class Sample
{
	int id;
	String name;

	Sample(int id,String name)
	{
		this.id=id;
		this.name=name;
	}

	void info()
	{
		System.out.println("ID:"+id);
		System.out.println("Name:"+name);
	}
}

public class Parameterized  
{
	public static void main(String[] args) 
	{
		Sample s=new Sample(8,"Akshu");
		s.info();
	}
}

