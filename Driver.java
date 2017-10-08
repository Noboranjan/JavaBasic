public class Driver
{
	public static void main(String[] args)
	{
		Car ob=new Car();
		ob.setMilage(0);//for flexibity
		ob.setFuel(100);
		ob.setFuelConsumptionRate(1);
		ob.drive(10);
		Car ob1=new Car();
		ob1.setMilage(0);//for flexibity
		ob1.setFuel(100);
		ob1.setFuelConsumptionRate(1);
		ob1.drive(20);
		System.out.println("Milage is "+ob.getMilage());
		System.out.println("Fuel is "+ob.getFuel());
		System.out.println("Fuel Consumption Rate is "+ob.getFuelConsumptionRate());
	}
}