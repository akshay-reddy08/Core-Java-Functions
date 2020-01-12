package Q2Encapsulation;

class PrivateMembers
{
	private int Pin = 5476;

	public int getPin() 				//Getter
	{
		System.out.print("Pin ");
		return Pin;
	}

	public void setPin(int pin) 		//Setter
	{
		this.Pin = pin;
	}
}

public class DataMembers 
{
	public static void main(String[] args) 
	{
		PrivateMembers p = new PrivateMembers();
		System.out.println("Old: "+p.getPin());
		
		p.setPin(9876);										//Setting New Pin
		System.out.println("New: "+p.getPin());
	}
}
