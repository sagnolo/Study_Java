package Instance_Example;

public class AppleSeller {

	int numOfApple = 20;
	int myMoney = 0;
	final int APPLE_PRICE=100;
	
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
