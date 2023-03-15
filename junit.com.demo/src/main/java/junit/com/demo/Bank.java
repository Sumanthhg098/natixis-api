package junit.com.demo;

public class Bank {
	String name;
	int balance;
	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bank(String name, int balance) {
		super();
		this.name = name;
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public int deposit(int amt) throws LimitExceededException {
		if(amt<50000) this.balance=this.balance+amt;
		else {
			throw new LimitExceededException("Limit Exceeded");
			
		}
		return this.balance;
	}
	
	public int withdraw(int amt) throws WithdrawException {
		if(this.balance<=amt) throw new WithdrawException("Balance low");
		else {
			this.balance=this.balance-amt;
		}
		return this.balance;
	}
	
	@Override
	public String toString() {
		return "Bank [name=" + name + ", balance=" + balance + "]";
	}
	
}
