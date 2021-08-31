import java.util.*;


public class ATM {

	ArrayList<BankHuman> humans = new ArrayList<BankHuman>();
	boolean added = false;
	
	public void deposit(String id, double depositAmount)
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
}


