package MyCoolProgram;

public class BankAccount {
	private int cents;
	private int dollars;
	private String name;
	private int iD;
	
	//Getters
	public int getDollars(){
		return dollars;
	}
	public int getCents(){
		return cents;
	}
	public String getName(){
		return name;
	}
	public int getID(){
		return iD;
	}
	
	//Setters
	public void setName(String s){
		name = s;
	}
	public void setID(int i){
		iD = i;
	}
	
	//Other Methods
	//Check and fix if something is negative
	public void checkIfNegative() {
		if(dollars < 0) {
			System.out.println("You have a negative balance in your account");
		}
		if (cents <= -100) {
			int withdrawAmount;
			if((-cents / 100.0) % 1 != 0) {
				withdrawAmount = -cents / 100;
				withdraw(withdrawAmount, 0);
				deposit(0, -cents);
			}
			else {
				withdrawAmount = -cents / 100 + 1;
				withdraw(withdrawAmount, 0);
				int depositAmount = 100 - (int) (Math.abs(((cents / 100.0) % 1) * 100));
				deposit(0, depositAmount);				
			}
		}
	}
	//Check and fix if cents > 100
	public void checkCents(){
		if(cents > 99){
			dollars = dollars + (cents/100);
			cents = cents % 100;
		}
	}
	//Deposit
	public void deposit(int d, int c){
		dollars = dollars + d;
		cents = cents + c;
		checkCents();
	
	}
	//Withdraw
	public void withdraw(int d, int c) {
		dollars = dollars - d;
		dollars = dollars - c;
		if(cents < 0 || dollars < 0) {
			System.out.println("ERROR: money amount cannot be less than $0, you have run out of money!");
		}
		checkIfNegative();
	}
	//Constructor
	public BankAccount(int dDollars, int dCents, String dName, int dID) {
		this.cents = dCents;
		this.dollars = dDollars;
		this.name = dName;
		this.iD = dID;
		checkIfNegative();
		checkCents();
	}
}
