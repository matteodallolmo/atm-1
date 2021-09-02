import java.util.*;

public class ATM {

	static ArrayList<BankHuman> humans = new ArrayList<BankHuman>();
	static boolean added = false;
	
	public static void deposit(String id, double depositAmount)
	{
		for(int i = 0; i<humans.size()+1; i ++)
		{
			if (humans.get(i).ID() == id)
			{
				humans.get(i).add(depositAmount); 
				added = true;
			}
			
	
		
		if(added == false)
		{
			humans.add(new BankHuman(id,depositAmount));
		}
		
		
		}
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
