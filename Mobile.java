public class Mobile{
	public static int count=0;
    private int simNumber;
	private Mobile object;
	private String customerName;
	private double balance;
	private double callRate;
	
	
	public Mobile(String customerName,double balance,double callRate){
		
		this(count);
		count++;
		this.customerName=customerName;
		this.balance=balance;
		this.callRate=callRate;
		
		
	}
	private Mobile(int count){
		this.simNumber=count;
		
	}
	public double call(double Duration, Mobile object){
		balance -=(callRate*Duration);
		this.object=object;
		
		System.out.println("object 2 value: "+object.balance);
		return balance;

		
		
	}
	public void displayInfo(){
		System.out.println(balance);
		System.out.println(customerName);
		System.out.println(simNumber);
		System.out.println(callRate);
	}
	
}