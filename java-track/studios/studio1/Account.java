package studio1;

public class Account {
	private String name;
	private Integer balance;
	private double interestRate;


	public Account(String name, Integer balance, double interestRate) {
		this.name = name;
		this.balance = balance;
		this.interestRate = interestRate;
	}
	
	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public Integer getBalance() {
		return balance;
	}

	public void deposit(Integer d) {
		this.balance+=d;
	}
	
	public void withdraw(Integer w) {
		this.balance-=w;
	}
	
	public void accru() {
		this.balance+=(int)(this.balance*this.interestRate);
	}
	
	public String toString(){
		return this.name + "'s account balance is " + this.balance + " and earns " + this.interestRate + " interest";
	}

	public static void main(String[] args) {
		Account myAccount = new Account("Melissa", 200, .1);
		myAccount.deposit(100);
		System.out.println(myAccount.getBalance());
		myAccount.accru();
		System.out.println(myAccount.getBalance());
		myAccount.withdraw(50);
		System.out.println(myAccount);
	}

}
