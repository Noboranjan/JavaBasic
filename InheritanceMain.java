public class InheritanceMain{
	public static void main(String args[ ]){
		B b1 = new B( );
		C c1 = new C(10);
		C c2 = new C( );
		c1.show( ); b1.show( );
		c2.show( ); c1.show( ); c1.show( );
	}
}