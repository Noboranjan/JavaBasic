public class BankAcc {
    private double id;
    private double balance;

	public BankAcc(double iniId, double iniBalance)
	{
		id = iniId;
		balance = iniBalance;
	}

	public BankAcc()
	{
		id=0;
		balance=0;
	}

    public void deposit(double amount)
    {
		if(amount>0){
        balance= balance + amount;
		System.out.println(amount+"is deposited successfully");
		System.out.println("Current balance is "+ balance);
		}
		else{
		System.out.println("Amount is negative");
		System.out.println("Current balance is "+ balance);
		} 
    }
    public void withdraw(double amount)
    {
		if(balance>amount){
        balance= balance - amount;
		System.out.println(amount+" is withdraw Current balance is "+balance);
		}
		else{
			System.out.println("Amount is greater than balance");
		}
	}
	public void transfer(double newid,double amount){
		if( id != newid && balance>=amount){
			
			balance-=amount;
			System.out.println("Current balance is "+ balance);
			
		}
		else{
			System.out.println("Amount or id wrong");
		
		}
	
			
    }
	public void transferDetails(double amount)
	{
		balance+=amount;
		System.out.println(amount+"is transfered successfully");
		System.out.println("Account id "+id+" Current balance is "+ balance);
	}
	
}
