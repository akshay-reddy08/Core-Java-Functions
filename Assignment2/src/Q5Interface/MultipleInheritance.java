package Q5Interface;

interface Amazon
{
	void brands(String brand);
	void discounts(int dis);
}

interface Flipkart
{
	void brands(String brand);
	void discounts(int dis);
	void offers(double off);
}

class Ecommerce implements Amazon,Flipkart
{
	@Override
	public void brands(String brand) 
	{
		System.out.println("1.Brands are : "+brand);
	}

	@Override
	public void discounts(int dis) 
	{
		System.out.println("2.Discounts are : "+dis+"%");
	}
	@Override
	public void offers(double off) 
	{
		System.out.println("3.Offers are : "+off);
	}
}


public class MultipleInheritance 
{
	public static void main(String[] args) 
	{
		System.out.println("Amazon Great Indian Sale:_____");
		Amazon a= new Ecommerce();
		a.brands("Levis");
		a.discounts(60);
		
		System.out.println("-------------------------");
		
		System.out.println("Flipkart Big Billion Days Sale:____");
		Flipkart f = new Ecommerce();
		f.brands("Lee-copper");
		f.discounts(50);
		f.offers(4);
		
	}
}
