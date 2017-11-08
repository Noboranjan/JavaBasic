public class A{
	protected int a;
	public A( ){
		this(0);
		System.out.println("Inside A's Empty.");
    }
    public A(int a){
		this.a = a;
		System.out.println("A's constructor - Valued.");
    }
	public void show( ){
		System.out.println("Show : "+a);
		a-=1;
	}
}