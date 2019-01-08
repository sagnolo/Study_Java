package Instance_Example;

public class AppleSalesMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AppleSeller seller = new AppleSeller();
		AppleBuyer buyer = new AppleBuyer();
		buyer.buyApple(seller, 2000);
		
		System.out.println("사과 판매자의 상황");
		seller.ShowSaleResult();
		
		System.out.println("사과 구매자의 상황");
		buyer.showBuy();
	}

}
