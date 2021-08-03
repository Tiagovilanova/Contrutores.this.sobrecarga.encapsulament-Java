package entities;

public class exfix {

	private int number;
	private String holder;
	private double balance;

	public exfix(int number, String holder, double initialDeposit) {
		super();
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit); // ficar atento com esses detalhes
	}

	public exfix(int number, String holder) {
		super();
		this.number = number;
		this.holder = holder;

	}

	public exfix() {

	}

	public int getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) {
		balance-= amount +5.0;
	}

	public String toString() {
		return "Account " + 
	number + 
	", Holder: " 
	+ holder 
	+ ", Balance: $ " 
	+ String.format("%.2f", balance);
	}
}
