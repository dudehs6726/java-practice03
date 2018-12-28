package prob5;

public class Account {
	
	private String accountNo;  //계좌번호
	private int balance;	   //잔고
	
	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}

	public Account(String accountNo)
	{
		this.accountNo = accountNo;
		System.out.println(accountNo + " 계좌가 개설되었습니다.");
	}
	
	public void save(int saveMoney)
	{
		balance += saveMoney;
		System.out.println(accountNo + " 계좌에 " + saveMoney + "만원이 입금되었습니다.");
	}
	
	public void deposit(int depositMoney)
	{
		balance -= depositMoney;
		System.out.println(accountNo + " 계좌에 " + depositMoney + "만원이 출금되었습니다.");
	}
	
}