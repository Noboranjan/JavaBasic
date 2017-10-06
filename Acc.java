public class Acc{
	public static void main(String[] args){
		BankAcc b=new BankAcc(1,500);
		BankAcc b1=new BankAcc(2,200);
		b.withdraw(40);
		b.deposit(500);
		b.transfer(2,50);
		b1.transferDetails(50);
	}
}
