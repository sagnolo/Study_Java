package Instance_Example;

public class AppleBuyer {
	
	int myMoney = 10000; //보유한 금액
	int numOfApple = 0; // 소유한 사과 수
	
	public void buyApple(AppleSeller seller, int money) //사과를 구매하는 행위
	{
		numOfApple+= seller.saleApple(money);
		myMoney-=money;
	}
	
	public void showBuy(){ //현재 상태 보여주기
		System.out.println("사과 개수 : " + numOfApple);
		System.out.println("남은 잔액 : " + myMoney);
	}
	
}
