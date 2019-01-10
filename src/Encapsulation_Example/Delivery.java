package Encapsulation_Example;

public class Delivery {
	int deliv; //배달료
	Chicken chicken;
	
	public Delivery(int p, int d)
	{
		chicken = new Chicken(p);
		deliv = d;
	}
	
	public void showDelivInfo()
	{
		System.out.println("배달료 : " + deliv);
		chicken.showChickenInfo();
	}
	
}
