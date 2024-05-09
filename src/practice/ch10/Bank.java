package practice.ch10;

//은행
public class Bank {
	
	String name;
	int balance;
	
	public void deposit(int money) {
		balance = balance + money;
		showInfo();
	}

	
	public int withdraw(int money) {
		if(balance < money) {
			System.out.println("잘못된 요청입니다.");
			return 0;
		}
		balance = balance - money;
		showInfo();
		return money;
	}
	
	public void showInfo() {
		System.out.println("현재 잔액은 : " + this.balance + " 입니다.");
	}
	
	
}
