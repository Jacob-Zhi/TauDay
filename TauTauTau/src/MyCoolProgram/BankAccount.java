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
	//Deposit
	public void deposit(int d, int c){
		dollars = dollars + d;
		cents = cents + c;
		if(cents > 99){
			dollars = dollars + (cents/100);
			cents = cents % 100;
		}
		if(cents < 0 || dollars < 0) {
			System.out.println("ERROR: money amount cannot be less than $0, balance has been set to $0.00");
		}
	}
	//Withdraw
	public void withdraw(int d, int c) {
		dollars = dollars - d;
		dollars = dollars - c;
		if(cents < 0 || dollars < 0) {
			System.out.println("ERROR: money amount cannot be less than $0, you have run out of money!");
		}
	}
	//Constructor
	public BankAccount(int dDollars, int dCents, String dName, int dID) {
		this.cents = dCents;
		this.dollars = dDollars;
		this.name = dName;
		this.iD = dID;
		if(cents > 99){
			dollars = dollars + (cents/100);
			cents = cents % 100;
		}
		if(cents < 0 || dollars < 0) {
			System.out.println("ERROR: money amount cannot be less than $0");
		}
	}
}
