public class Car{
	private int milage;
	private double fuel;
	private int fuelConsumptionRate;
	
	public int getMilage()
	{
		return this.milage;
	}
	public double getFuel()
	{
		return this.fuel;
	}
	public double getFuelConsumptionRate()
	{
		return this.fuelConsumptionRate;
	}
	
	public  void setMilage(int milage)
	{
		this.milage=milage;
	}
	public void setFuel(double fuel)
	{
		this.fuel=fuel;
	}
	public void setFuelConsumptionRate(int fuelConsumptionRate)
	{
		this.fuelConsumptionRate = fuelConsumptionRate;
	}
	public void drive(int milage)
	{
		this.milage+=milage;
		int burnFuel;
		burnFuel = fuelConsumptionRate*milage;
		fuel-=burnFuel;
		System.out.println("Drive milage "+milage);
		System.out.println("drive Fuel consumtion rate "+burnFuel);
		System.out.println("drive fuel preserved "+fuel);
		
	}
	public void drive(int speed,int time)// Function Overload
	{
		this.milage+=speed*time;
		System.out.println("Drive milage2 "+milage);
		
	}
}