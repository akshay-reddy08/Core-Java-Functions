package Q5Interface;

interface House
{
	void flats();
	void bunglows();
	void rowhouses();
}

class Shelter  implements House
{

	@Override
	public void flats() 
	{
		System.out.println("Flats costs Rupees 45 Lacs_________");
	}

	@Override
	public void bunglows()
	{
		System.out.println("Bunglows costs Rupees 75 Lacs_________");
	}

	@Override
	public void rowhouses() 
	{
		System.out.println("Row_House costs Rupees 1 crores_________");
	}
}

public class Abstraction 
{
	public static void main(String[] args) 
	{
		Shelter s = new Shelter();
		s.bunglows();
		s.rowhouses();
		s.flats();
	}
}
