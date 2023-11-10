package lab08;

public class Account {
	
	private int id;
	private String owner;
	private double balance;
	
	//Constructor to set initial state of account
	public Account(int id, String owner, double balance) {
		this.id = id;
		this.owner = owner;
		this.balance = balance;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public String getOwner() {
		return owner;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	
	//Method to deposit money into account
	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
		}
	}
	
	//Method to withdraw money from account
	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
		}
	}

	public void addInterest() {
	
	}
	

}
