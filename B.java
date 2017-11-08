public class B extends A{
	protected int b;
	public B( ){
		System.out.println("Inside B's Empty.");
	}
	public B(int b){
		super(b);
		System.out.println("B's constructor - Valued.");
	}
}