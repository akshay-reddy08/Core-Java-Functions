package Q2Encapsulation;


class Methodology
{
	private void dance(int date, String month)
	{
		System.out.println("Merry Christmas.........");
		System.out.println(date+" "+month);
	}
	void getdance(int date,String month) 
	{
		dance(date,month);
	}
	

}

public class PrivateMethod 
{
	public static void main(String[] args) 
	{
		Methodology m= new Methodology();
		m.getdance(25,"December");
	}
}
