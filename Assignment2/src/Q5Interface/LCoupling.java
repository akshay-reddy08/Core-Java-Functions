package Q5Interface;

interface Honda
{
	void shine();
	void unicorn();
	void cbr();
}

class Bikes implements Honda
{
	@Override
	public void cbr()
	{
		System.out.println("cbr is running");
	}

	@Override
	public void shine() {
		System.out.println("Shine is running");
	}

	@Override
	public void unicorn() {
		System.out.println("unicorn is running");
	}
}

public class LCoupling
{
	public static void main(String[] args) 
	{
		Honda b=new Bikes();
		b.cbr();
		b.shine();
		b.unicorn();
	}
}
