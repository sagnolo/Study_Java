package Instance_Example;

public class AppleBuyer {
	
	int myMoney = 10000; //������ �ݾ�
	int numOfApple = 0; // ������ ��� ��
	
	public void buyApple(AppleSeller seller, int money) //����� �����ϴ� ����
	{
		numOfApple+= seller.saleApple(money);
		myMoney-=money;
	}
	
	public void showBuy(){ //���� ���� �����ֱ�
		System.out.println("��� ���� : " + numOfApple);
		System.out.println("���� �ܾ� : " + myMoney);
	}
	
}
