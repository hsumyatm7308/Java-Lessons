package exceptionhandling;

public class BankAccount {
	private String AccountNumber;
	private String AccountHoldderName;
	private double balance;
	
	public BankAccount() {}
	public BankAccount(String num,String name,double b) {
		this.AccountNumber = num;
		this.AccountHoldderName = name;
		this.balance = b;
	}
	public String getAccountNumber() {
		return AccountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		AccountNumber = accountNumber;
	}
	public String getAccountHoldderName() {
		return AccountHoldderName;
	}
	public void setAccountHoldderName(String accountHoldderName) {
		AccountHoldderName = accountHoldderName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void deposit(double amt) {
		this.balance+=amt;
	}
	
	public void withdraw(double amt) throws InsufficientFundsException {
		if(amt <= getBalance()) {
			this.balance -= amt;
		}else {
			throw new InsufficientFundsException("လက်ကျန်ငွေပမာဏ မလုံလောက်ပါ");
		}
	}
	
	public String toString() {
		return "Account Number:" + getAccountNumber() + " Name:" + getAccountHoldderName() + "Current Balance:" + getBalance();
	}
	
	
}
