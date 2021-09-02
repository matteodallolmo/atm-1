import java.util.*;

public class ATM {

	public static ArrayList<BankHuman> humans = new ArrayList<BankHuman>();
	
	public static void deposit(String id, double depositAmount)
	{
		if(depositAmount < 0)
		{
			System.out.println("Cannot Enter Negative Amount");
			return;
		}
		
		for(int i = 0; i<humans.size(); i++)
		{
			if (humans.get(i).bankAccountID.equals(id))
			{
				humans.get(i).add(depositAmount); 
				return;
			}
		}
		humans.add(new BankHuman(id,depositAmount));
	}
	
	public static void withdraw(String id, double num)
	{
		if(num < 0)
		{
			System.out.println("Cannot Enter Negative Amount");
			return;
		}
		
		for(int i = 0; i<humans.size(); i++)
		{
			BankHuman temp = humans.get(i);
			
			if (temp.bankAccountID.equals(id))
			{
				if(temp.balance < num)
				{
					System.out.println("Insufficient Funds");
					return;
				}
				temp.balance -= num;
				return;
			}
		}
		System.out.println("Account Does Not Exist, Cannot Withdraw");
	}
	
	public static String checkBalance(String id)
	{
		for(int i = 0; i<humans.size(); i++)
		{
			BankHuman temp = humans.get(i);
			
			if (temp.bankAccountID.equals(id))
			{
				System.out.println("Your Account Balance: $"+temp.balance);
				return "Your Account Balance: $"+temp.balance;
			}
		}
		System.out.println("Account Does Not Exist, Cannot Check Balance");
		return "Account Does Not Exist, Cannot Check Balance";
	}
	
	public static void main(String[] args)
	{
		deposit("Winfrey", 25159684372.43);
		deposit("Bezos", 193495330293.43);
		deposit("Bezos", 20394353.35);
		withdraw("Bezos", 3593293.66);
		deposit("MrTheiss",64033.55);
		withdraw("MrTheiss", 443964.46);
		checkBalance("Bezos");
		checkBalance("Winfrey");
		checkBalance("YoMama");
		checkBalance("MrTheiss");
	}

}
