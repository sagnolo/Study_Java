package Instance_Example;

public class AppleSalesMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AppleSeller seller = new AppleSeller();
		AppleBuyer buyer = new AppleBuyer();
		buyer.buyApple(seller, 2000);
		
		System.out.println("��� �Ǹ����� ��Ȳ");
		seller.ShowSaleResult();
		
		System.out.println("��� �������� ��Ȳ");
		buyer.showBuy();
	}

}
