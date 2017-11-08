public class C extends B{
	private int c;
	public C( ){
		System.out.println("Inside C's Empty.");
	}
	public C(int c){
		super(20);
		this.c = c;
		System.out.println("C's constructor-Valued.");
	}
	public void show( ){
		System.out.println("Show : "+a+" "+c);
		a++; c*=2;
	}
	public void show(String s){
		System.out.println("Show : "+a+" "+c+" Hello !!");
		a=10;
	}
}