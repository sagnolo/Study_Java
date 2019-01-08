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
		System.out.println("사과 개수 : " + numOfApple);
		System.out.println("남은 잔액 : " + myMoney);
	}
	
}
