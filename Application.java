import javax.swing.JFrame;
import java.awt.BorderLayout;

public class Application extends JFrame {
	private static Application ref;
	
	private Application(){
		ref = this;
		System.out.println("Run");
		this.add(LogIn.getRef(), BorderLayout.CENTER);
		this.setBounds(100, 100, 500, 450);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public static Application getRef(){
		if(ref==null)
			ref = new Application();
		return ref;
	}

}