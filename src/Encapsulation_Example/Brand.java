package Encapsulation_Example;

public class Brand {
	Delivery bhc;
	Delivery goobne;
	
	public Brand(int bhcPrice, int bhcDeliv, int gooPrice, int gooDeliv)
	{
		bhc = new Delivery(bhcPrice, bhcDeliv);
		goobne = new Delivery(gooPrice, gooDeliv);
	}
	
	public void showBrandInfo()
	{
		System.out.println("[bhc]");
		bhc.showDelivInfo();
		System.out.println("[goobne]");
		goobne.showDelivInfo();
	}
}
