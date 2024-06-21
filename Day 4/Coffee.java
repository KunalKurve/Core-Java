package day4;

public enum Coffee
{
	SMALL(50),MEDIUM(70),LARGE(100);		//This must be written 1st because it is an enum
	int price;

	private Coffee(int price)			//This private constructor is required to set the value of enum internally
	{
		this.price = price;
	}

	public int getPrice()
	{
		return price;
	}
}