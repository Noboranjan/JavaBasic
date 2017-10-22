public class Feature{
	public static void main(String[] args){
		Mobile ob1= new Mobile("Niloy",100.0,2.50);
		Mobile ob2= new Mobile("Joy",80.0,2.80);
		ob1.call(2,ob2);
		ob1.displayInfo();
		ob2.displayInfo();
	}
}