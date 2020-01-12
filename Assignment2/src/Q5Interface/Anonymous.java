package Q5Interface;

interface Christmas 
{

	String name="Santa";
	int id=101;

	void details();
}

public class Anonymous
{
	public static void main(String[] args) 
	{
		Christmas s=new Christmas()
		{
			@Override
			public void details()
			{
				System.out.println("Name:"+name);
				System.out.println("ID:"+id);
			}
		};	
		System.out.println("S: "+s);
		s.details();
	}
}