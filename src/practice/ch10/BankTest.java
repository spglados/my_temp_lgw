package practice.ch10;

public class BankTest {

	public static void main(String[] args) {
		
		Bank bank1 = new Bank();
		bank1.name = "우리은행";
		bank1.deposit(10_000);
		int getMoney = bank1.withdraw(10_000);
		System.out.println(">>>>>> 출금 <<<<<<");
		System.out.println("금액 : " + getMoney);

	} // end of main

} // end of class
