package abstraction;

abstract class Bank {
	abstract void deposit(double amount);

	abstract void withdraw(double amount);

	abstract double checkBalance();

	void bankInfo() {
		System.out.println("Welcome to ABC Bank!");
	}
}

class SavingsAccount extends Bank {
	private double balance;

	public SavingsAccount(double initialBalance) {
		this.balance = initialBalance;
	}

	@Override
	void deposit(double amount) {
		balance += amount;
		System.out.println("Deposited: " + amount);
	}

	@Override
	void withdraw(double amount) {
		if (amount > balance) {
			System.out.println("Insufficient funds!");
		} else {
			balance -= amount;
			System.out.println("Withdrew: " + amount);
		}
	}

	@Override
	double checkBalance() {
		return balance;
	}

	public static void main(String[] args) {
		Bank myAccount = new SavingsAccount(5000); // Using abstraction
		myAccount.bankInfo(); // Concrete method
		myAccount.deposit(2000); // Depositing money
		myAccount.withdraw(1000); // Withdrawing money
		System.out.println("Current Balance: " + myAccount.checkBalance());
	}
}
