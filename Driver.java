public class Driver
{
	public static void main(String[] args)
	{
		Car ob=new Car();
		ob.setMilage(0);//for flexibity
		ob.setFuel(100);
		ob.setFuelConsumptionRate(1);
		ob.drive(10);
		ob.drive(20,2);
		System.out.println("Milage is "+ob.getMilage());
		System.out.println("Fuel is "+ob.getFuel());
		System.out.println("Fuel Consumption Rate is "+ob.getFuelConsumptionRate());
	}
}