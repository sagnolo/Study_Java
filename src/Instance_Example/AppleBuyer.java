package Instance_Example;

public class AppleBuyer {
	
	int myMoney = 10000;
	int numOfApple = 0;
	
	public void buyApple(AppleSeller seller, int money)
	{
		numOfApple+= seller.saleApple(money);
		myMoney-=money;
	}
	
	public void showBuy(){
		System.out.println("��� ���� : " + numOfApple);
		System.out.println("���� �ܾ� : " + myMoney);
	}
	
}
