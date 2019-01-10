package Instance_Example;

public class AppleSeller {

	int numOfApple = 20; //보유한 사과 수
	int myMoney = 0; //소유 금액
	final int APPLE_PRICE=100; //사과 가격
	
	public int saleApple(int money){
		int num = money/APPLE_PRICE;
		numOfApple-=num;
		myMoney+=money;
		return num;
	}
	
	public void ShowSaleResult(){
		System.out.println("남은 사과 : " + numOfApple);
		System.out.println("남은 잔액 : " + myMoney);
	}
}
