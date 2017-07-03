package MyCoolProgram;

public class SavingsAccount extends BankAccount{
	private double interestRate;
	//Adds interest
	public void addInterest() {
		double money = getDollars();
		money = money + (getCents()/100);
		money = money * interestRate;
		int coolDollars = (int) money;
		int coolCents = (int) ((money % 1) * 100);
		deposit(coolDollars, coolCents);
		checkCents();
	}
	//Constructor
	public SavingsAccount(int dDollars, int dCents, String dName, int dID, double dInterest) {
		super(dDollars, dCents, dName, dID);
		interestRate = dInterest;
	}

}
