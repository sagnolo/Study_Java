package Encapsulation_Example;

public class Delivery {
	int deliv; //��޷�
	Chicken chicken;
	
	public Delivery(int p, int d)
	{
		chicken = new Chicken(p);
		deliv = d;
	}
	
	public void showDelivInfo()
	{
		System.out.println("��޷� : " + deliv);
		chicken.showChickenInfo();
	}
	
}
