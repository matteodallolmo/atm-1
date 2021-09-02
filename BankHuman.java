
public class BankHuman {
	public String bankAccountID; 
	double balance; 
	
	public BankHuman(String Id, double balance)
	{
		bankAccountID = Id; 
		this.balance = balance;
	}
	
	public void add(double amount)
	{
		balance += amount;
	}
}
