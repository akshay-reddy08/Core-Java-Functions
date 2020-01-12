package Q4AbstractClass;


abstract class Entertainment 
{
	abstract void hitSeries();
	abstract void hitmovies();
}


public class Abstractclass
{
	public static void main(String[] args) 
	{
		Entertainment ab = new Entertainment() {

			@Override
			void hitmovies() 
			{
				System.out.println("2018 hit movie is K.G.F");
			}

			@Override
			void hitSeries() 
			{
				System.out.println("2018 hit series is \"The Arrow\"");
			}
		};
		ab.hitmovies();
		ab.hitSeries();
		System.out.println("Address is: "+ab);
	}
}