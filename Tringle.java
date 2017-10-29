public class Tringle{
	private Point a;
	private Point b;
	private Point c;
	public Tringle(Point a,Point b,Point c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public Point getA()
  {
      return this.a;
  }
  public Point getB()
  {
      return this.b;
  }
  public Point getC()
  {
      return this.c;
  }
	public void setValue(Point a,Point b,Point c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	public void DisplayTriangle(Point a,Point b,Point c){
		System.out.println("Point A X value: "+a.getX());
		System.out.println("Point A Y value: "+a.getY());
		System.out.println("Point B X value: "+b.getX());
		System.out.println("Point B Y value: "+b.getY());
		System.out.println("Point C X value: "+c.getX());
		System.out.println("Point C Y value: "+c.getY());
		
		
	}
	public static void main(String[] args){
		Point p1=new Point(0,0);
		Point p2=new Point(0,0);
		Point p3=new Point(0,0);
		p1.setValue(10,12);
		p2.setValue(13,14);
		p3.setValue(21,26);
		
		
		Tringle b1=new Tringle(p1,p2,p3);
		b1.setValue(p1,p2,p3);
		b1.DisplayTriangle(p1,p2,p3);
		
	}
}