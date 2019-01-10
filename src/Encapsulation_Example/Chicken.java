package Encapsulation_Example;

public class Chicken {
	int price; //치킨 값
	
	public Chicken(int p)
	{
		price = p;
	}
	
	public void showChickenInfo()
	{
		System.out.println("치킨값 : "+ price);
	}
}
